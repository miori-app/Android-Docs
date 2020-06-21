package com.appprogramming.preparationforexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button catButton;
    private Button dogButton;
    private Button javaButton,intentsendButton,ass_1_btn,r_event;
    private TextView textView1;
    private EditText editText1,editText2,editText3,s_id,s_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catButton = (Button)findViewById(R.id.cat_btn);
        textView1 = (TextView)findViewById(R.id.tv1);
        editText1 = (EditText)findViewById(R.id.edit1);
        editText2 = (EditText)findViewById(R.id.edit2);
        editText3 = (EditText)findViewById(R.id.edit3);
        s_id = (EditText)findViewById(R.id.s_id_in);
        s_name = (EditText)findViewById(R.id.s_name_in);
        javaButton = (Button)findViewById(R.id.java_btn);
        intentsendButton = (Button)findViewById(R.id.intent_send);
        ass_1_btn = (Button) findViewById(R.id.ass_1);
        r_event = (Button)findViewById(R.id.r_btn1);

        ass_1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MyCalculator.class);
                startActivity(intent);
            }
        });

        intentsendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int s_id_val = Integer.parseInt(s_id.getText().toString());
                Intent intent = new Intent(MainActivity.this,MyGetIntent.class);
                intent.putExtra("s_id",s_id_val);
                intent.putExtra("s_name",s_name.getText().toString());
                startActivity(intent);
            }
        });


        javaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,JavaUI.class);
                startActivity(intent);
            }
        });

        catButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("Button is clicked");
            }
        });

        catButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                textView1.setText("Long Clicked");
                return true;
            }
        });

        editText1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                    textView1.setText("Got A Focus!");
            }
        });

        editText2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                editText3.setText(editText2.getText().toString()+(char)event.getUnicodeChar());
                return false;
            }
        });

        r_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,EventDriven.class);
                startActivity(intent);
            }
        });


    }

}
