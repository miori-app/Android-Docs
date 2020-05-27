package com.example.threadstudy;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import java.util.TimerTask;

public class MyTimerTask2 extends TimerTask {

    private TextView tv2;
    private Handler handler;

    // 두가지 값을 생성 당시에 가져와
    public MyTimerTask2(TextView tv2, Handler handler){
        this.tv2 = tv2;
        this.handler = handler;
    }

    @Override
    public void run() {
        // textview 값 가져와 1 증가시키고
        // textview에 증가된 값 갱신
        // handler를 통해서 그 값을 전달함으로써 갱신
        int curVal = Integer.parseInt(tv2.getText().toString());
        curVal++;

        // 갱신된 값을 handler를 통해 전달
        Message message = handler.obtainMessage();
        message.arg1 = curVal;
        handler.sendMessage(message);
    }
}
