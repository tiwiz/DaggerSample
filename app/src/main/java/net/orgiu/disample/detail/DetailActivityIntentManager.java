package net.orgiu.disample.detail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.view.View;

import net.orgiu.disample.DeviceInfoActivity;
import net.orgiu.disample.R;

public class DetailActivityIntentManager {
    private static final String DEVICE_NAME_KEY = "DEVICE_NAME";

    private DetailActivityIntentManager() {
        throw new IllegalStateException(DetailActivityIntentManager.class.getSimpleName() + " should not be initialised!");
    }

    public static Intent getLaunchIntentFor(@NonNull Context context, @NonNull String deviceName) {
        Intent intent = new Intent(context, DeviceInfoActivity.class);
        intent.putExtra(DEVICE_NAME_KEY, deviceName);
        return intent;
    }

    public static Bundle getTransitionBundleWithin(@NonNull Activity root, @NonNull View deviceImage, @NonNull View deviceName) {
        Pair<View, String> imagePair = Pair.create(deviceImage, root.getString(R.string.transition_device_image));
        Pair<View, String> namePair = Pair.create(deviceName, root.getString(R.string.transition_device_name));

        return ActivityOptionsCompat.makeSceneTransitionAnimation(root, imagePair, namePair).toBundle();
    }

    public static String extractDeviceNameFrom(@NonNull Intent intent) {
        return intent.getStringExtra(DEVICE_NAME_KEY);
    }
}
