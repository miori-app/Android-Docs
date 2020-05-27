package com.example.threadstudy;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyService extends Service {

    private MediaPlayer player; //음악재생 위해

    public MyService() {
    }

    @Override
    public void onCreate(){
        //서비스가 생성될때 호출

        //player 초기화
        player = MediaPlayer.create(this,R.raw.bumpercar);
        player.setLooping(true); //계속 재생

    }

    @Override
    public int onStartCommand(Intent intent,int flags,int started){
        //서비스가 시작될때 호출
        player.start();
        return START_STICKY;

        //return 값의미
        // service가 강제종료ㅚ었을 경우 시스템이 다시 service를 재시작시켜주지만 intent값을 null로 초기화 시켜서 재시작
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
