package com.example.firstapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UiAss extends AppCompatActivity {

    private Button button;
    private TextView textView,textView1;
    private EditText editText, editText2;
    private CheckBox checkBox1;
    private RadioButton radioButton1;
    private SeekBar seekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assignment1);

        button = findViewById(R.id.button1c);
        textView = findViewById(R.id.textview1);
        textView1 = findViewById(R.id.textview1_1);
        editText = findViewById(R.id.Edit1);
        editText2 = findViewById(R.id.Edit2);
        radioButton1 = findViewById(R.id.rg_1btn);
        seekBar = findViewById(R.id.seekBar);

        radioButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    textView.setText("radio button1");
            }
        });



        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                    textView.setText("Focused!");
                else
                    textView.setText("Focus Changed");
            }
        });


        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                //입력한 key
                char key = (char)event.getUnicodeChar();
                //textview 에 key append
                //현재의 content 갖고와
                CharSequence current = textView1.getText();
                textView1.setText(current.toString()+key);
                //textView.setText(current.toString()+key);
                return false;
            }
        });

        button.setOnClickListener(v->{
            editText.setText("first");
            editText2.setText("second");
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });




    }
}
