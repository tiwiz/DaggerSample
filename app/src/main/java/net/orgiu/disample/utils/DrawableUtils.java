package net.orgiu.disample.utils;


import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.widget.ImageView;

import com.bumptech.glide.load.resource.bitmap.GlideBitmapDrawable;

public class DrawableUtils {

    public static Bitmap fromGlide(@NonNull final ImageView imageView) {
        return ((GlideBitmapDrawable) imageView.getDrawable().getCurrent()).getBitmap();
    }
}
