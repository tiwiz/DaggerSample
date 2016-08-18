package net.orgiu.disample.list;


import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import net.orgiu.disample.R;
import net.orgiu.disample.database.RealmDevice;

class DevicesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    private final ImageView modelImageView;
    private final TextView modelTextView;
    private final CardView modelRootView;
    private final OnDeviceChosenListener listener;
    private String model;

    DevicesViewHolder(View itemView, OnDeviceChosenListener listener) {
        super(itemView);
        this.modelRootView = (CardView) itemView;
        modelRootView.findViewById(R.id.clickableView).setOnClickListener(this);
        modelImageView = (ImageView) itemView.findViewById(R.id.imgDevice);
        modelTextView = (TextView) itemView.findViewById(R.id.txtModel);
        this.listener = listener;
    }

    void bindTo(@NonNull RealmDevice device) {
        Glide.with(modelImageView.getContext())
                .load(device.getImageUrl())
                .into(modelImageView);
        modelTextView.setText(DeviceUtils.clearFromBrand(device));
        model = device.getDeviceName();


    }

    @Override
    public void onClick(View view) {
        listener.onDeviceChosen(model, modelRootView, modelImageView, modelTextView);
    }
}
