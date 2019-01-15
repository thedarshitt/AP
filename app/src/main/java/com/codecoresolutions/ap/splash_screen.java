package com.codecoresolutions.ap;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class splash_screen extends AppCompatActivity {

    private ImageView logo,ap,logo_tr;
    Animation frombottom,fromtop,fromleft;
    LottieAnimationView car;
    private static int SPLASH_TIME_OUT=4500;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


            fromleft=AnimationUtils.loadAnimation(this,R.anim.fromleft);
//        frombottom=AnimationUtils.loadAnimation(this,R.anim.frombottom);
//        fromtop=AnimationUtils.loadAnimation(this,R.anim.fromtop);
//
//        logo=findViewById(R.id.ss_logo);
//        logo.setAnimation(frombottom);
//
        ap=findViewById(R.id.ss_ap);

//
//        logo_tr=findViewById(R.id.ss_logo_tr);
//        logo_tr.setAnimation(fromtop);

        car=findViewById(R.id.car);
        car.setAnimation(fromleft);
        //car.setSpeed(250);




        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(splash_screen.this,home.class);
                startActivity(i);
                finish();

            }
        },SPLASH_TIME_OUT);


    }
}
