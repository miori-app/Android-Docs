package com.appprogramming.preparationforexam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JavaUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);


        Button btn1 = new Button(this);
        Button btn2 = new Button(this);
        Button btn3 = new Button(this);

        btn1.setText("btn1");
        btn2.setText("btn2");
        btn3.setText("btn3");

        final TextView tv = new TextView(this);
        tv.setText("original");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("btn1 clicked");
            }
        });

        btn2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tv.setText("btn2 Long Clicked");
                return false;
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaUI.this,JavaUITable.class);
                startActivity(intent);
            }
        });


        linearLayout.addView(btn1);
        linearLayout.addView(btn2);
        linearLayout.addView(btn3);
        linearLayout.addView(tv);

        setContentView(linearLayout);
    }
}
