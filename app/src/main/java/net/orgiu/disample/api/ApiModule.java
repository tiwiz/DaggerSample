package net.orgiu.disample.api;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ApiModule {
    private static final String URL = "FONO_API_URL";

    @Provides
    @Named(URL)
    public String provideBaseUrl() {
        return "https://fonoapi.freshpixl.com/v1/getdevice";
    }

    @Provides @Singleton
    public Retrofit provideRetrofit(@Named(URL) String baseUrl) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}
