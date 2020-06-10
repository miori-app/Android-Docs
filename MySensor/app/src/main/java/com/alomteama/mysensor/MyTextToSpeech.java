package com.alomteama.mysensor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.speech.tts.TextToSpeech;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

public class MyTextToSpeech extends AppCompatActivity {

    private EditText ttsEidtText;
    private Button ttsbutton;
    private android.speech.tts.TextToSpeech ttsEngine;

    private TextView srText;
    private TextView srSysMsg;
    private Button srButton;

    private SpeechRecognizer myRecognizer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_text_to_speech);

        ttsEidtText = (EditText) findViewById(R.id.type_zone);
        ttsbutton = (Button)findViewById(R.id.start_speaking);

        srText = findViewById(R.id.srText);
        srSysMsg = findViewById(R.id.stSysMsg);
        srButton = findViewById(R.id.sr);

        //1. TextToSpeech class 인스턴스화
        ttsEngine = new android.speech.tts.TextToSpeech(this, new android.speech.tts.TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != android.speech.tts.TextToSpeech.ERROR){
                    ttsEngine.setLanguage(Locale.KOREAN);
                }
            }
        });

        ttsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttsEngine.setPitch(0.1f);
                ttsEngine.setSpeechRate(3.0f);

                Editable editable = ttsEidtText.getText(); //editabel 도 charsequence라 ttsEngine.speak에 들어갈 수 있음 (ctrl+클릭 하면 자세한 명세 확인 가능)

                ttsEngine.speak(editable, TextToSpeech.QUEUE_ADD,null,"1");
            }
        });

        // Speech to Text
        //1. speechRecognizer 준비
        myRecognizer = SpeechRecognizer.createSpeechRecognizer(this);
        myRecognizer.setRecognitionListener(new RecognitionListener() {
            @Override
            public void onReadyForSpeech(Bundle params) {
                srSysMsg.setText("[onReadyForSpeech]");
            }

            @Override
            public void onBeginningOfSpeech() {
                srSysMsg.setText("[onBeginningOfSpeech]");
            }

            @Override
            public void onRmsChanged(float rmsdB) {
                srSysMsg.setText("[onRmsChanged]");
            }

            @Override
            public void onBufferReceived(byte[] buffer) {
                srSysMsg.setText("[onBufferReceived]");
            }

            @Override
            public void onEndOfSpeech() {
                srSysMsg.setText("[onEndOfSpeech]");
            }

            @Override
            public void onError(int error) {
                srSysMsg.setText("[onError]");
            }

            @Override
            public void onResults(Bundle results) {
                //Burndle reuslts 가 결과값
                ArrayList<String> myResult = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
                String str = "";
                for (String elem: myResult){
                    str += elem + " , ";
                }
                //srText.setText(myResult.toString());
                srText.setText(str);
            }

            @Override
            public void onPartialResults(Bundle partialResults) {
                srSysMsg.setText("[onPartialReuslts]");
            }

            @Override
            public void onEvent(int eventType, Bundle params) {
                srSysMsg.setText("[onEvent]");
            }
        });

        srButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //권한 묻기 (메니패스트도 추가하고 이것도 해야함)
                // 1. Internet 과 오디오 권한
                if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED
                        || ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(MyTextToSpeech.this,
                            new String[]{Manifest.permission.INTERNET, Manifest.permission.RECORD_AUDIO},0);
                }

                Intent srIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                srIntent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE,getPackageName());
                srIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE,"ko-KR");
                myRecognizer.startListening(srIntent);
            }
        });

        //안드로이드에서 접근제어 필수 (Permission)
        // 따라서 menifiest에 permission 넣어줘야함

    }
}
