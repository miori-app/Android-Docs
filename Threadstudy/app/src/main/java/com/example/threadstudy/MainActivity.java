package com.example.threadstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private MyRunnable r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.textview);

       r = new MyRunnable(tv,this);
        //Log.i("mylog","textview 가져옴");

        //Thread 이용
        //new Thread(r).start();

        //Timer 이용
        Timer timer = new Timer();
        timer.schedule(new MyTimerTask(tv,this),5000,3000);
    }
}
