package com.example.firstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import bsh.Interpreter;


public class MyCal extends AppCompatActivity {

    private EditText editText;
    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bp,bm,bg,bn,bc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        editText = (EditText) findViewById(R.id.Edit1);
        b0 = (Button)findViewById(R.id.button0c);
        b1 = (Button)findViewById(R.id.button1c);
        b2 = (Button)findViewById(R.id.button2c);
        b3 = (Button)findViewById(R.id.button3c);
        b4 = (Button)findViewById(R.id.button4c);
        b5 = (Button)findViewById(R.id.button5c);
        b6 = (Button)findViewById(R.id.button6c);
        b7 = (Button)findViewById(R.id.button7c);
        b8 = (Button)findViewById(R.id.button8c);
        b9 = (Button)findViewById(R.id.button9c);
        bp = (Button)findViewById(R.id.button_plu);
        bm = (Button)findViewById(R.id.button_min);
        bg = (Button)findViewById(R.id.button_mul);
        bn = (Button)findViewById(R.id.button_div);
        bc = (Button)findViewById(R.id.button_result);

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Interpreter interpreter = new Interpreter();
                    interpreter.eval("result=" + editText.getText().toString());
                    String result = interpreter.get("result").toString();
                    Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
                }catch(Exception e){

                }
            }
        });
    }
}
