package com.example.threadstudy;

import android.app.Activity;
import android.widget.TextView;

import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

    private TextView tv;
    private Activity mainActivity;

    // 두가지 값을 생성 당시에 가져와
    public MyTimerTask(TextView tv, Activity mainActivity){
        this.tv = tv;
        this.mainActivity = mainActivity;
    }

    @Override
    public void run() {
        // textview를 가져와서 그안의 값을 1 증가시키고
        // textview에 증가된 값을 갱신
        // handler를 통해서 그값을 전달함으로써 갱신
        /*
    }
        mainActivity.runOnUiThread(()->{
            String cur = tv.getText().toString();
            int curVal = Integer.parseInt(cur);
            curVal++;
            tv.setText(String.valueOf(curVal));
        }
        });
        */

        tv.post(()-> {
            String cur = tv.getText().toString();
            int curVal = Integer.parseInt(cur);
            curVal++;
            tv.setText(String.valueOf(curVal));
        });
        }
    }