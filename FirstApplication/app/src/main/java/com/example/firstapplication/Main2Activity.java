package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    Button b1,mapb,b2;
    EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b1 = (Button)findViewById(R.id.btn_1);
        b2 = findViewById(R.id.my_btn);
        mapb = findViewById(R.id.map_button);
        editText1 = findViewById(R.id.et_1);
        editText2 = findViewById(R.id.et_2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = Integer.parseInt(editText1.getText().toString());
                Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                intent.putExtra("id",a);
                intent.putExtra("name",editText2.getText().toString());
                startActivity(intent);
            }
        });

        mapb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.5,127?z=10"));
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("myIntent");
                startActivity(intent);
            }
        });

    }
}
