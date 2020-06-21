package com.appprogramming.preparationforexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MyGetIntent extends AppCompatActivity {

    private TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_get_intent);

        tv1 = (TextView)findViewById(R.id.get_sid);
        tv2 = (TextView)findViewById(R.id.get_sname);

        Intent intent = getIntent();
        int s_id_get = intent.getIntExtra("s_id",-1);
        String s_name_get = intent.getStringExtra("s_name");

        tv1.setText(tv1.getText()+String.valueOf(s_id_get));
        tv2.setText(tv2.getText()+s_name_get);


    }
}
