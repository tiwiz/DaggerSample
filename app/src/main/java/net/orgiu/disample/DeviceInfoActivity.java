package net.orgiu.disample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import net.orgiu.disample.detail.DetailActivityIntentManager;
import net.orgiu.disample.detail.DetailBundle;

import javax.inject.Inject;

import io.realm.Realm;

public class DeviceInfoActivity extends AppCompatActivity {

    @Inject
    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_info);
        ((App) getApplication()).getComponent().inject(this);

        DetailBundle bundle = DetailActivityIntentManager.extractDeviceDetailFrom(getIntent());
//        final RealmDevice device = realm.where(RealmDevice.class).equalTo("deviceName", bundle.getDeviceName()).findFirst();

        ((ImageView) findViewById(R.id.imgDevice)).setImageBitmap(bundle.getDeviceImage());
        ((TextView) findViewById(R.id.txtModel)).setText(bundle.getDeviceName());

    }
}
