package com.example.threadstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private MyRunnable r;
    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.handler);
        button2 = (Button)findViewById(R.id.service);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
            }
        });

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
