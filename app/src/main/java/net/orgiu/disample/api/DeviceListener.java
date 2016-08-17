package net.orgiu.disample.api;

import net.orgiu.disample.database.RealmDevice;

import java.util.List;

interface DeviceListener {

    void onDeviceDataRetrieved(List<RealmDevice> devices);
    void onDeviceDataFailed(Throwable throwable);
}
