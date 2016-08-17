package net.orgiu.disample.list;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import net.orgiu.disample.R;
import net.orgiu.disample.database.RealmDevice;

class DevicesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    private final ImageView modelImageView;
    private final TextView modelTextView;
    private final OnDeviceChosenListener listener;
    private String model;

    DevicesViewHolder(View itemView, OnDeviceChosenListener listener) {
        super(itemView);
        itemView.findViewById(R.id.clickableView).setOnClickListener(this);
        modelImageView = (ImageView) itemView.findViewById(R.id.imgDevice);
        modelTextView = (TextView) itemView.findViewById(R.id.txtModel);
        this.listener = listener;
    }

    void bindTo(@NonNull RealmDevice device) {
        Glide.with(modelImageView.getContext())
                .load(device.getImageUrl())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(modelImageView);
        modelTextView.setText(DeviceUtils.clearFromBrand(device));
        model = device.getDeviceName();
    }

    @Override
    public void onClick(View view) {
        listener.onDeviceChosen(model);
    }
}
