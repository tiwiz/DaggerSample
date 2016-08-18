package net.orgiu.disample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import net.orgiu.disample.database.RealmDevice;
import net.orgiu.disample.detail.DetailActivityIntentManager;

import javax.inject.Inject;

import io.realm.Realm;
import io.realm.RealmResults;

public class DeviceInfoActivity extends AppCompatActivity {

    @Inject
    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_info);
        ((App) getApplication()).getComponent().inject(this);

        String deviceName = DetailActivityIntentManager.extractDeviceNameFrom(getIntent());
        final RealmDevice device = realm.where(RealmDevice.class).equalTo("deviceName", deviceName).findFirst();

        Glide.with(this).load(device.getImageUrl()).into((ImageView) findViewById(R.id.imgDevice));
        ((TextView) findViewById(R.id.txtModel)).setText(device.getDeviceName());
    }
}
