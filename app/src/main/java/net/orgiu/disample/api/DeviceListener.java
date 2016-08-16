package net.orgiu.disample.api;

import java.util.List;

public interface DeviceListener {

    void onDeviceDataRetrieved(List<Device> devices);
    void onDeviceDataFailed(Throwable throwable);
}
