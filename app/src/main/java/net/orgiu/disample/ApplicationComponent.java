package net.orgiu.disample;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
interface ApplicationComponent {

    void inject(MainActivity activity);
}
