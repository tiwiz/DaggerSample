package net.orgiu.disample;

import dagger.Component;

@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(MainActivity activity);
}
