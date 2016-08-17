package net.orgiu.disample.list;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import net.orgiu.disample.R;
import net.orgiu.disample.database.RealmDevice;

import java.util.ArrayList;
import java.util.List;

public class DeviceAdapter extends RecyclerView.Adapter<DevicesViewHolder>{
    private final List<RealmDevice> devices = new ArrayList<>(0);

    @Override
    public DevicesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new DevicesViewHolder(inflater.inflate(R.layout.main_list_view, parent, false));
    }

    @Override
    public void onBindViewHolder(DevicesViewHolder holder, int position) {
        holder.bindTo(devices.get(position));
    }

    @Override
    public int getItemCount() {
        return devices.size();
    }

    public void setDevices(List<RealmDevice> devices) {
        this.devices.clear();
        this.devices.addAll(devices);
        notifyDataSetChanged();
    }
}
