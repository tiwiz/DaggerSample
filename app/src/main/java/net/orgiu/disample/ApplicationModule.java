package net.orgiu.disample;


import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.preference.PreferenceManager;

import net.orgiu.disample.api.DeviceService;
import net.orgiu.disample.api.FonoApiDeviceService;

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
    DeviceService provideDeviceService(Context context, Retrofit retrofit) {
        return new FonoApiDeviceService(retrofit, context.getString(R.string.fono_api_key));
    }
}
