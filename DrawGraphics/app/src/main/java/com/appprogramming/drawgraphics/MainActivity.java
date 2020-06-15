package com.appprogramming.drawgraphics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Button b = new Button(this);
        setContentView(R.layout.activity_main);

        //setContentView(new MyView(this));
       //setContentView(new MyButton(this));
    }
}
