package com.example.threadstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;

public class Main2Activity extends AppCompatActivity {

    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv2 = findViewById(R.id.tv2);

        Handler  handler = new Handler(){
            @Override
            public void handleMessage(Message msg){
                //background task가 보낸 메시지를 처리하는 곳
                int updatedVal = msg.arg1;
                tv2.setText(String.valueOf(updatedVal));
            }
        };

        //Timer -> Handler -> Main Thread
        Timer timer = new Timer();
        timer.schedule(new MyTimerTask2(tv2,handler),3000,2000);

    }
}
