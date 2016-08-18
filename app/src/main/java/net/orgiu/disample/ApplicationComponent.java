package net.orgiu.disample;

import net.orgiu.disample.api.ApiModule;
import net.orgiu.disample.api.ApiService;
import net.orgiu.disample.api.ImageApiModule;
import net.orgiu.disample.database.DatabaseModule;

import javax.inject.Singleton;

import dagger.Component;

@SuppressWarnings("WeakerAccess")
@Singleton
@Component(modules = {ApplicationModule.class, ApiModule.class, DatabaseModule.class, ImageApiModule.class})
public interface ApplicationComponent {

    void inject(ApiService service);

    void inject(MainActivity activity);

    void inject(DeviceInfoActivity activity);
}
