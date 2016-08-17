package net.orgiu.disample.list;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import net.orgiu.disample.R;
import net.orgiu.disample.api.Device;

public class DevicesViewHolder extends RecyclerView.ViewHolder{
    private final TextView modelTextView;

    public DevicesViewHolder(View itemView) {
        super(itemView);
        modelTextView = (TextView) itemView.findViewById(R.id.txtModel);
    }

    public void bindTo(@NonNull Device device) {
        modelTextView.setText(device.getDeviceName());
    }
}
