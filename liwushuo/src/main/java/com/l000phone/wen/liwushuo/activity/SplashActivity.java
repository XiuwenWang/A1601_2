package com.l000phone.wen.liwushuo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

import com.l000phone.wen.liwushuo.R;


public class SplashActivity extends AppCompatActivity {
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        img = (ImageView) findViewById(R.id.splash_img);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.5f, 1.0f);
        alphaAnimation.setDuration(1 * 1000);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                toActivty();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        img.setAnimation(alphaAnimation);
        alphaAnimation.start();

    }

    public void toActivty() {
        startActivity(new Intent(this, MainActivity.class));

    }


}
