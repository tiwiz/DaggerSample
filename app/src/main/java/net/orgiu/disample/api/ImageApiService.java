package net.orgiu.disample.api;


import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface ImageApiService {

    String ENDPOINT = "https://tiwiz-mobile-image-api.herokuapp.com/";
    String LARGE_IMAGE_ENDPOINT = ENDPOINT + "large/";
    String SMALL_IMAGE_ENDPOINT = ENDPOINT + "small/";

    @GET("/device/{model}")
    Observable<ImageUrl> getImageUrlOf(@Path("model") String model);
}
