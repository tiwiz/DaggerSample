package net.orgiu.disample.api;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.jaredrummler.android.device.DeviceName;

import net.orgiu.disample.App;
import net.orgiu.disample.database.RealmDevice;

import java.util.List;

import javax.inject.Inject;

import io.realm.Realm;
import timber.log.Timber;

@SuppressWarnings("WeakerAccess")
public class ApiService extends Service implements DeviceListener {

    @Inject
    DeviceService deviceService;

    @Inject
    Realm realm;

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
    public void onDeviceDataRetrieved(List<RealmDevice> devices) {
        Timber.d("Devices list updated.");
        saveDeviceToDatabase(devices);
        stopSelf();
    }

    private void saveDeviceToDatabase(List<RealmDevice> devices) {
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(devices);
        realm.commitTransaction();
    }

    @Override
    public void onDeviceDataFailed(Throwable throwable) {
        Timber.e(throwable.getMessage());
        stopSelf();
    }
}
