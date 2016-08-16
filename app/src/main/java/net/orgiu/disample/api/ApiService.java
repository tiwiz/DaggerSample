package net.orgiu.disample.api;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.jaredrummler.android.device.DeviceName;

import net.orgiu.disample.App;

import java.util.List;

import javax.inject.Inject;

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
        Timber.d(devices.toString());
    }

    @Override
    public void onDeviceDataFailed(Throwable throwable) {
        Timber.e(throwable.getMessage());
    }
}
