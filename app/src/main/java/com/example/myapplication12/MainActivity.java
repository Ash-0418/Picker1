package com.example.myapplication12;

import androidx.appcompat.app.AppCompatActivity;

import java.util.*;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;


public class MainActivity extends AppCompatActivity {
    Button b1, b2;
    DatePickerDialog dp;
    TimePickerDialog tp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);

    }
    public void ck(View v){

        if(v==b1){
            //현재 날짜
            final Calendar c=Calendar.getInstance();
            int Y=c.get(Calendar.YEAR);
            int M=c.get(Calendar.MONTH);
            int D=c.get(Calendar.DAY_OF_MONTH);
            String st="";
            dp=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int Y, int M, int D) {
                          b1.setText(Y+"/"+(M+1)+"/"+D);
                }
            },Y,M,D);
            dp.show();

        }
        if(v==b2){
            final Calendar c=Calendar.getInstance();
            int H=c.get(Calendar.HOUR);
            //int H=c.get(Calendar.HOUR_OF_DAY);

            int M=c.get(Calendar.MINUTE);

            tp=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int i, int i1) {
                    b2.setText(i+"시 : "+i1+"분");
                }
            },H,M,false);
                tp.show();
        }//if
    }//ck
}//class