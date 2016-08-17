package net.orgiu.disample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import net.orgiu.disample.api.Device;

import javax.inject.Inject;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmResults;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Inject
    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getComponent().inject(this);

        final RealmResults<Device> devices = realm.where(Device.class).findAll();

        realm.addChangeListener(new RealmChangeListener<Realm>() {
            @Override
            public void onChange(Realm element) {
                Timber.d("Data changed!");
            }
        });
    }


}
