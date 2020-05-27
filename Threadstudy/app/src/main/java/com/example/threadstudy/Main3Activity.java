package com.example.threadstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //이 activity가 생성, 시작되면서 동시에 서비스를 시작시킨다
        Intent intent = new Intent(Main3Activity.this,MyService.class);
        //intent.putExtra();
        // 값전달도 가능

        //MyService는 시작된다
        startService(intent);

        //broadcast 추가
        //1. broadcast receiver 만들어
        BroadcastReceiver br = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                //방송을 받았을 때 호출됨
                TextView tv3 = findViewById(R.id.tv3);
                tv3.setText(new Date().toString());

            }
        };

        //2. broadcast receiver 등록
        //br은 ACTION_TIME_TICK 마다 onreceive 호출
        registerReceiver(br,new IntentFilter(Intent.ACTION_TIME_TICK));

    }
}
