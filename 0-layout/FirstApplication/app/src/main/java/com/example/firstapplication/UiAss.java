package com.example.firstapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UiAss extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText, editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assignment1);

        button = findViewById(R.id.button1c);
        textView = findViewById(R.id.textview1);
        editText = findViewById(R.id.Edit1);
        editText2 = findViewById(R.id.Edit2);

        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                    textView.setText("Focused!");
                else
                    textView.setText("Focus Changed");
            }
        });



    }
}
