package com.example.threadstudy;

import android.app.Activity;
import android.widget.TextView;

import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

    private TextView tv;
    private Activity mainActivity;
    public MyTimerTask(TextView tv, Activity mainActivity){
        this.tv = tv;
        this.mainActivity = mainActivity;
    }

    @Override
    public void run() {
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