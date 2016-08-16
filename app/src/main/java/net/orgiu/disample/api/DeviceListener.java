package net.orgiu.disample.api;

import java.util.List;

public interface DeviceListener {

    void onDeviveDataRetrieved(List<Device> devices);
    void onDeviceDataFailed(Throwable throwable);
}
