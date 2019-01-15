package com.codecoresolutions.ap;

import android.app.TimePickerDialog;
import android.arch.lifecycle.ViewModelProvider;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import java.util.Random;
import android.app.ProgressDialog;

import java.util.Calendar;

public class reserving_slot extends AppCompatActivity {

    private Button button_time,button_reserve;
    private TextView tvTime,temp;
    private EditText eduname,edvno;
    private ProgressDialog pd;

    Random r=new Random();
    int id=r.nextInt(4000)+3000;
    String uid="AP"+id+"2019";   //uid
    String arrTime;

    int mHour,mMin;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserving_slot);

        button_time=findViewById(R.id.button_time);
        button_reserve=findViewById(R.id.button_reserve);
        tvTime=findViewById(R.id.tvTime);
        eduname=findViewById(R.id.eduname);
        edvno=findViewById(R.id.edvno);
        temp=findViewById(R.id.temp);
        pd=new ProgressDialog(this);
    }

    //this function will store the data in db
    public void onClickReserve(View view) {

        String uname=eduname.getText().toString();
        String vno=edvno.getText().toString();

        if(uname.isEmpty()){
            eduname.setError("Please enter your Name");
        }
        if(vno.isEmpty()){
            edvno.setError("Please enter your Vehicle number");
        }
        if(vno.length()!=10){
            edvno.setError("Please Check your vehicle number again");
        }





    }

    public void onClickArrTime(View view) {


        final Calendar c= Calendar.getInstance();
        mHour=c.get(Calendar.HOUR_OF_DAY);
        mMin=c.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                tvTime.setText(hourOfDay+" : "+minute);
                arrTime=(hourOfDay+" : "+minute);
                //tvTime.setText(uid);
            }
        },mHour,mMin,false);
        timePickerDialog.show();


    }
}
