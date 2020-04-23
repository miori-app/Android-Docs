package com.example.firstapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class LayoutCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main);

        //new 를 써서, linear layout 만들고 방향 설정
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation((LinearLayout.HORIZONTAL));

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                1.0f
        );

        Button button1 = new Button(this);
        button1.setText("Button1");
        button1.setLayoutParams(params);
        mainLayout.addView(button1);

        Button button2 = new Button(this);
        button2.setText("Button2");
        button2.setLayoutParams(params);
        mainLayout.addView(button2);

        Button button3 = new Button(this);
        button3.setText("Button3");
        button3.setLayoutParams(params);
        mainLayout.addView(button3);

        setContentView(mainLayout);
    }
}
