package net.orgiu.disample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import net.orgiu.disample.database.RealmDevice;
import net.orgiu.disample.list.DeviceAdapter;
import net.orgiu.disample.list.ItemOffsetDecoration;

import javax.inject.Inject;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmResults;

@SuppressWarnings("WeakerAccess")
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
        devicesListView.setLayoutManager(new GridLayoutManager(this, getResources().getInteger(R.integer.main_view_number_of_columns)));
        devicesListView.addItemDecoration(new ItemOffsetDecoration(this, R.dimen.main_view_item_offset));
        devicesListView.setAdapter(adapter);

        updateViewVisibility();

        changeListener = e -> updateViewVisibility();
    }

    private void updateViewVisibility() {
        final RealmResults<RealmDevice> devices = realm.where(RealmDevice.class).findAll();
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
