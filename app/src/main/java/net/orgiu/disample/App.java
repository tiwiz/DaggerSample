package net.orgiu.disample;


import android.app.Application;
import android.content.Intent;

import net.orgiu.disample.api.ApiModule;
import net.orgiu.disample.api.ApiService;
import net.orgiu.disample.api.ImageApiModule;
import net.orgiu.disample.database.DatabaseModule;

import timber.log.Timber;

public class App extends Application{

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .apiModule(new ApiModule())
                .databaseModule(new DatabaseModule())
                .imageApiModule(new ImageApiModule())
                .build();

        startService(new Intent(this, ApiService.class));
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
