package animation.rahul.com.animation;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;

import pl.droidsonroids.gif.GifImageView;

/**
 * Created by rsahukar on 4/14/2016.
 */
public class CustomProgressDialog extends Dialog {

    private GifImageView gif;
    private int resId;

    public CustomProgressDialog(Context context, int resourceId) {
        super(context);
        resId = resourceId;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.loading);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        gif = (GifImageView)findViewById(R.id.gif);
        gif.setImageResource(resId);
    }

    @Override
    public void show() {
        super.show();
    }
}
