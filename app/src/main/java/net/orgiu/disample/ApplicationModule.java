package net.orgiu.disample;


import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.preference.PreferenceManager;

import net.orgiu.disample.api.ApiModule;
import net.orgiu.disample.api.DeviceService;
import net.orgiu.disample.api.FonoApiDeviceService;
import net.orgiu.disample.api.ImageApiService;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
class ApplicationModule {
    private final Context context;

    ApplicationModule(Context context) {
        this.context = context;
    }

    @Provides @Singleton
    Context providesContext() {
        return context;
    }

    @Provides @Singleton
    SharedPreferences providesSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Provides @Singleton
    ConnectivityManager providesConnectivityManager(Context context) {
        return (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    }

    @Provides
    DeviceService provideDeviceService(Context context,
                                       @Named(ApiModule.FONO_API_RETROFIT) Retrofit fonoRetrofit,
                                       ImageApiService imageService) {

        return new FonoApiDeviceService(fonoRetrofit, context.getString(R.string.fono_api_key), imageService);
    }
}
