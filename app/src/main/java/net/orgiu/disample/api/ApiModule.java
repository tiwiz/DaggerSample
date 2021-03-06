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
public class ApiModule {
    private static final String URL = "FONO_API_URL";
    public static final String FONO_API_RETROFIT = "FONO_API_RETROFIT";
    private static final String FONO_API_CLIENT = "FONO_API_CLIENT";
    private static final String FONO_API_INTERCEPTOR = "FONO_API_INTERCEPTOR";

    @Provides @Named(FONO_API_INTERCEPTOR)
    HttpLoggingInterceptor provideInterceptor() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return interceptor;
    }

    @Provides @Named(FONO_API_CLIENT)
    OkHttpClient provideClient(@Named(FONO_API_INTERCEPTOR) HttpLoggingInterceptor interceptor) {
        return new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();
    }

    @SuppressWarnings("SameReturnValue")
    @Provides
    @Named(URL)
    String provideBaseUrl() {
        return "https://fonoapi.freshpixl.com/v1/";
    }

    @Provides @Singleton @Named(FONO_API_RETROFIT)
    Retrofit provideRetrofit(@Named(URL) String baseUrl, @Named(FONO_API_CLIENT) OkHttpClient client) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();
    }
}
