package net.orgiu.disample.api;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ImageApiModule {

    private static final String IMAGE_URL = "IMAGE_API_URL";
    private static final String IMAGE_API_RETROFIT = "IMAGE_API_RETROFIT";
    private static final String IMAGE_CLIENT = "IMAGE_CLIENT";
    private static final String IMAGE_INTERCEPTOR = "IMAGE_INTERCEPTOR";

    @Provides @Named(IMAGE_INTERCEPTOR)
    HttpLoggingInterceptor provideInterceptor() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return interceptor;
    }

    @Provides @Named(IMAGE_CLIENT)
    OkHttpClient provideClient(@Named(IMAGE_INTERCEPTOR) HttpLoggingInterceptor interceptor) {
        return new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();
    }

    @SuppressWarnings("SameReturnValue")
    @Provides
    @Named(IMAGE_URL)
    String provideBaseUrl() {
        return ImageApiService.ENDPOINT;
    }

    @Provides @Singleton @Named(IMAGE_API_RETROFIT)
    Retrofit provideRetrofit(@Named(IMAGE_URL) String baseUrl, @Named(IMAGE_CLIENT) OkHttpClient client) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();
    }

    @Provides @Singleton
    ImageApiService provideImageApiService(@Named(IMAGE_API_RETROFIT) Retrofit retrofit) {
        return retrofit.create(ImageApiService.class);
    }
}
