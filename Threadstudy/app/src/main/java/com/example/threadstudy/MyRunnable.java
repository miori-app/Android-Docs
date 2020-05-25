package com.example.threadstudy;

import android.app.Activity;
import android.widget.TextView;

public class MyRunnable implements Runnable {

    private TextView tv;
    private Activity mainActivity;

    public MyRunnable(TextView tv, Activity mainActivity){
        this.tv = tv;
        this.mainActivity = mainActivity;
    }

    @Override
    public void run(){
        while(true){
            //1초씩 쉬면서 tv위 값을 가져오고 그것에 1을 추가해서 tv에 반영
            /*
            try{
                Thread.sleep(1000);
                String cur = tv.getText().toString();
                int curVal = Integer.parseInt(cur);
                curVal++;
                tv.setText(String.valueOf(curVal)); //여기서 error 발생

            }
            catch(Exception e){
                e.printStackTrace();
                break;
            }
            */
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }

            mainActivity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    String cur = tv.getText().toString();
                    int curVal = Integer.parseInt(cur);
                    curVal++;
                    tv.setText(String.valueOf(curVal)); //error

                }
            });

        }
    }
}
