package com.blogspot.programer27android.haripertamaiak;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashSecreen extends AppCompatActivity {
    ImageView img;
    Animation anim;
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_secreen);
        anim= AnimationUtils.loadAnimation(this,R.anim.animasi);
        img=(ImageView) findViewById(R.id.img);
        img.startAnimation(anim);

//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                startActivity(new Intent(SplashSecreen.this,MainActivity.class));
//                finish();
//            }
//        },10500);






        final Intent home = new Intent(this, MainActivity.class);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(10500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(home);
                    finish();
                }
            }
        };
        timer.start();

    }
}
