package com.codecoresolutions.ap;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    Button a1,a2,a3;

    //Vibrator v=(Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void onClickA1(View view) {
        a1=findViewById(R.id.slot_a1);
        a1.setBackgroundResource(R.drawable.button_shape3);
        a1.setEnabled(false);
        startActivity(new Intent(home.this,reserving_slot.class));
        //v.vibrate(100);
    }

    public void onClickA2(View view) {
        a2=findViewById(R.id.slot_a2);
        a2.setBackgroundResource(R.drawable.button_shape3);
       // v.vibrate(100);
        a2.setEnabled(false);
        startActivity(new Intent(home.this,reserving_slot.class));
    }

    public void onClickA3(View view) {
        a3=findViewById(R.id.slot_a3);
        a3.setBackgroundResource(R.drawable.button_shape3);
        a3.setEnabled(false);
        startActivity(new Intent(home.this,reserving_slot.class));

      //  v.vibrate(100);
    }
}
