package net.orgiu.disample.detail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.view.View;
import android.view.Window;

import net.orgiu.disample.DeviceInfoActivity;
import net.orgiu.disample.R;

import java.io.ByteArrayOutputStream;

public class DetailActivityIntentManager {
    private static final String DEVICE_NAME_KEY = "DEVICE_NAME";
    private static final String DEVICE_IMAGE_KEY = "DEVICE_IMAGE";

    private DetailActivityIntentManager() {
        throw new IllegalStateException(DetailActivityIntentManager.class.getSimpleName() + " should not be initialised!");
    }

    public static Intent getLaunchIntentFor(@NonNull Context context, @NonNull String deviceName, @NonNull Bitmap deviceImage) {
        Intent intent = new Intent(context, DeviceInfoActivity.class);
        intent.putExtra(DEVICE_NAME_KEY, deviceName);
        intent.putExtra(DEVICE_IMAGE_KEY, from(deviceImage));
        return intent;
    }

    private static byte[] from(@NonNull Bitmap bitmap) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        return stream.toByteArray();
    }

    public static Bundle getTransitionBundleWithin(@NonNull Activity root, @NonNull View... views) {
        Pair<View, String> cardPair = Pair.create(views[0], root.getString(R.string.transition_device_card));
        Pair<View, String> imagePair = Pair.create(views[1], root.getString(R.string.transition_device_image));
        Pair<View, String> namePair = Pair.create(views[2], root.getString(R.string.transition_device_name));
        Pair<View, String> statusBarPair = Pair.create(root.findViewById(android.R.id.statusBarBackground), Window.STATUS_BAR_BACKGROUND_TRANSITION_NAME);
        Pair<View, String> navigationPair = Pair.create(root.findViewById(android.R.id.navigationBarBackground), Window.NAVIGATION_BAR_BACKGROUND_TRANSITION_NAME);

        return ActivityOptionsCompat.makeSceneTransitionAnimation(root, cardPair, imagePair, namePair, statusBarPair, navigationPair).toBundle();
    }

    public static DetailBundle extractDeviceDetailFrom(@NonNull Intent intent) {
        return new DetailBundle(intent.getStringExtra(DEVICE_NAME_KEY), intent.getByteArrayExtra(DEVICE_IMAGE_KEY));
    }
}
