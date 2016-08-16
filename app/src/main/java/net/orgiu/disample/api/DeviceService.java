package net.orgiu.disample.api;

import android.support.annotation.NonNull;

public interface DeviceService {

    void getDataOf(@NonNull String model, @NonNull DeviceListener listener);
}
