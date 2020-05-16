package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView1 = findViewById(R.id.tv_1);
        textView2= findViewById(R.id.tv_2);

        Intent intent = getIntent();
        int id = intent.getIntExtra("id",-1);
        String name = intent.getStringExtra("name");
        //String my_id = Integer.toString(id);


        textView1.setText(String.valueOf(id));
        textView2.setText(name);


    }
}
