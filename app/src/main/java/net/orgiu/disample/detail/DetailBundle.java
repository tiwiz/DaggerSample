package net.orgiu.disample.detail;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class DetailBundle {

    private final String deviceName;
    private final Bitmap deviceImage;

    DetailBundle(String deviceName, byte[] imageInByte) {
        this.deviceName = deviceName;
        this.deviceImage = BitmapFactory.decodeByteArray(imageInByte, 0, imageInByte.length);
    }

    public String getDeviceName() {
        return deviceName;
    }

    public Bitmap getDeviceImage() {
        return deviceImage;
    }
}
