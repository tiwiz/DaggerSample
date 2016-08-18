package net.orgiu.disample.list;

import android.support.annotation.NonNull;
import android.view.View;

public interface OnDeviceChosenListener {

    void onDeviceChosen(@NonNull String deviceName, @NonNull View... views);
}
