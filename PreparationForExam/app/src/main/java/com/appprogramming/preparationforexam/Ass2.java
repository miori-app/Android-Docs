package com.appprogramming.preparationforexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ass2 extends AppCompatActivity {

    private Button btn1;
    private EditText et1,et2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ass2);

        btn1 = (Button)findViewById(R.id.ass2_btn1);
        et1 = (EditText)findViewById(R.id.ass2_et1);
        et2 = (EditText)findViewById(R.id.ass2_et2);
        textView = findViewById(R.id.show_result);

        Intent intent = getIntent();
        String result = intent.getStringExtra("i_result");
        textView.setText(textView.getText().toString() + result);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("first");
            }
        });

        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                //Toast.makeText(Ass2.this,s,Toast.LENGTH_SHORT).show();
                et2.setText("second");
            }
        });



    }
}
