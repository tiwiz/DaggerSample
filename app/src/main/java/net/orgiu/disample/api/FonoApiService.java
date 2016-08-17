package net.orgiu.disample.api;

import android.support.annotation.NonNull;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

interface FonoApiService {

    @GET("getdevice")
    Observable<List<Device>> getDeviceData(@NonNull @Query("token") String token,
                                           @NonNull @Query("device") String device);
}
