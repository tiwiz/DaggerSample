package net.orgiu.disample.api;

import android.support.annotation.NonNull;

import retrofit2.Retrofit;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class FonoApiDeviceService implements DeviceService{

    private Retrofit retrofit;
    private final String token;

    public FonoApiDeviceService(Retrofit retrofit, String token) {
        this.retrofit = retrofit;
        this.token = token;
    }

    @Override
    public void getDataOf(@NonNull String model, @NonNull final DeviceListener listener) {
        retrofit.create(FonoApiService.class).getDeviceData(token, model)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(listener::onDeviceDataRetrieved, listener::onDeviceDataFailed);
    }
}