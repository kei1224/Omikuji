package jp.wings.nikkeibp.omikuji;

import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import java.util.Random;

/**
 * Created by wings on 2015/06/27.
 */
public class OmikujiBox implements Animation.AnimationListener {
    private int number; // くじ番号
    private ImageView imageView;

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public OmikujiBox() {
        this.number = -1;
    }

    public int getNumber() {
        return number;
    }

    public void shake() {
        TranslateAnimation translate = new TranslateAnimation(0, 0, 0, -100);
        translate.setRepeatMode(Animation.REVERSE);
        translate.setRepeatCount(5);
        translate.setDuration(100);
        RotateAnimation rotate = new RotateAnimation(0, -36,
                this.imageView.getWidth() / 2, this.imageView.getHeight() / 2);
        rotate.setDuration(200);

        AnimationSet set = new AnimationSet(true);
        set.addAnimation(rotate);
        set.addAnimation(translate);

        set.setAnimationListener(this);
        this.imageView.startAnimation(set);

    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Random rnd = new Random();
        this.number = rnd.nextInt(20);
        this.imageView.setImageResource(R.drawable.omikuji2);
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
