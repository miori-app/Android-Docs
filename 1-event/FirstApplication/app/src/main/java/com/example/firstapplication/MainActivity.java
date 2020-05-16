package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5;

    private Button catButton;
    private Button dogButton;
    private Button humanButton;
    private TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button_cal);
        b3 = (Button)findViewById(R.id.button_ass);
        b4 = (Button)findViewById(R.id.button_indent);
        b5 = findViewById(R.id.button_gorating);

        catButton = findViewById(R.id.btn_cat);
        dogButton = findViewById(R.id.btn_dog);
        humanButton = findViewById(R.id.btn_human);
        textView = findViewById(R.id.textView);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LinearVertical.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MyCal.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,UiAss.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 명시적인 intent를 사용해서 Main2Activity 호출 (현재 인자, 호출할 인자)
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                //intent.putExtra("id",17011879);
                //intent.putExtra("name","miyeon");
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Rating.class);
                startActivity(intent);
            }
        });

        catButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("cat");
            }
        });

        catButton.setOnLongClickListener((View v) ->{
            textView.setText("CAT");
            return true;
            // true 로 하면 롱클릭 유지
            // false로 하면 1번 선택으로
        });



        dogButton.setOnClickListener(v ->  {
            textView.setText("dog");
        });

        dogButton.setOnLongClickListener(v ->{
            textView.setText("DOG");
            return false;
        });

        humanButton.setOnClickListener(v ->  {
            textView.setText("HUMAN");
        });



    }
}
