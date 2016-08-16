package net.orgiu.disample.api;

import android.support.annotation.NonNull;

import retrofit2.http.GET;
import rx.Observable;

public interface FonoApiService {

    @GET("/getdevice")
    Observable<Device> getDeviceData(@NonNull String token,
                                     @NonNull String device);
}
