package net.orgiu.disample.list;

import android.support.annotation.NonNull;

import net.orgiu.disample.api.Device;
import net.orgiu.disample.api.ImageUrl;
import net.orgiu.disample.database.RealmDevice;

public class DeviceUtils {

    private DeviceUtils() {
        throw new IllegalStateException(DeviceUtils.class.getSimpleName() + " should not be instantiated");
    }

    public static String clearFromBrand(@NonNull Device device) {
        return clearFromBrand(device.getDeviceName(), device.getBrand());
    }

    static String clearFromBrand(@NonNull RealmDevice device) {
        return clearFromBrand(device.getDeviceName(), device.getBrand());
    }

    private static String clearFromBrand(@NonNull String name, @NonNull String brand) {
        String spacedBrand = brand + " ";
        if (name.contains(spacedBrand)) {
            return name.replace(spacedBrand, "").trim();
        } else {
            return name;
        }
    }

    public static RealmDevice from(Device device, ImageUrl imageUrl) {
        return new RealmDevice.Importer().with(device).with(imageUrl).get();
    }
}
