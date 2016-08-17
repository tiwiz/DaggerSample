package net.orgiu.disample.api;

import android.support.annotation.NonNull;

import net.orgiu.disample.database.RealmDevice;
import net.orgiu.disample.list.DeviceUtils;

import retrofit2.Retrofit;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class FonoApiDeviceService implements DeviceService{

    private final Retrofit fonoRetrofit;
    private final ImageApiService imageService;
    private final String token;

    public FonoApiDeviceService(Retrofit fonoRetrofit, String token, ImageApiService imageService) {
        this.fonoRetrofit = fonoRetrofit;
        this.imageService = imageService;
        this.token = token;
    }

    @Override
    public void getDataOf(@NonNull String model, @NonNull final DeviceListener listener) {
        fonoRetrofit.create(FonoApiService.class).getDeviceData(token, model)
                .flatMap(Observable::from)
                .flatMap(this::getImageUrl)
                .toList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(listener::onDeviceDataRetrieved, listener::onDeviceDataFailed);
    }

    @NonNull
    private Observable<RealmDevice> getImageUrl(Device device) {
        return imageService.getImageUrlOf(DeviceUtils.clearFromBrand(device)).map(imageUrl -> DeviceUtils.from(device, imageUrl));
    }
}
