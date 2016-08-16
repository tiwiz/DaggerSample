package net.orgiu.disample.api;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.jaredrummler.android.device.DeviceName;

import net.orgiu.disample.App;

import java.util.List;

import javax.inject.Inject;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import timber.log.Timber;

public class ApiService extends Service implements DeviceListener {

    @Inject
    DeviceService deviceService;

    public ApiService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ((App) getApplication()).getComponent().inject(this);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        final DeviceListener listener = this;
        DeviceName.with(this).request((info, error) -> deviceService.getDataOf(info.marketName, listener));

        return START_STICKY;
    }

    @Override
    public void onDeviceDataRetrieved(List<Device> devices) {
        Timber.d("Devices list updated.");

        RealmConfiguration realmConfig = new RealmConfiguration.Builder(this).build();
        Realm.setDefaultConfiguration(realmConfig);
        Realm realm = Realm.getDefaultInstance();

        realm.beginTransaction();
        realm.copyToRealm(devices);
        realm.commitTransaction();

        stopSelf();
    }

    @Override
    public void onDeviceDataFailed(Throwable throwable) {
        Timber.e(throwable.getMessage());
        stopSelf();
    }
}
