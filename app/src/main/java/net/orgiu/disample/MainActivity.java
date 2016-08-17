package net.orgiu.disample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import net.orgiu.disample.api.Device;
import net.orgiu.disample.list.DeviceAdapter;

import javax.inject.Inject;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    @Inject
    Realm realm;

    View emptyStateView;
    RecyclerView devicesListView;
    final DeviceAdapter adapter = new DeviceAdapter();

    RealmChangeListener<Realm> changeListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getComponent().inject(this);

        emptyStateView = findViewById(R.id.emptyStateView);
        devicesListView = (RecyclerView) findViewById(R.id.devicesListView);
        devicesListView.setLayoutManager(new LinearLayoutManager(this));
        devicesListView.setAdapter(adapter);

        updateViewVisibility();

        changeListener = e -> updateViewVisibility();
    }

    private void updateViewVisibility() {
        final RealmResults<Device> devices = realm.where(Device.class).findAll();
        if (devices.size() > 0) {
            devicesListView.setVisibility(View.VISIBLE);
            emptyStateView.setVisibility(View.GONE);
            adapter.setDevices(devices);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        realm.addChangeListener(changeListener);
    }

    @Override
    protected void onStop() {
        super.onStop();
        realm.removeAllChangeListeners();
    }
}
