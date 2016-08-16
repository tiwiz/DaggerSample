package net.orgiu.disample;

import net.orgiu.disample.api.ApiModule;
import net.orgiu.disample.api.ApiService;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, ApiModule.class})
public interface ApplicationComponent {

    void inject(ApiService service);
}
