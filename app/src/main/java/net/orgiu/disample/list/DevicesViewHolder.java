package net.orgiu.disample.list;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import net.orgiu.disample.R;
import net.orgiu.disample.database.RealmDevice;

class DevicesViewHolder extends RecyclerView.ViewHolder {
    private final TextView modelTextView;

    DevicesViewHolder(View itemView) {
        super(itemView);
        modelTextView = (TextView) itemView.findViewById(R.id.txtModel);
    }

    void bindTo(@NonNull RealmDevice device) {
        modelTextView.setText(DeviceUtils.clearFromBrand(device));
    }
}
