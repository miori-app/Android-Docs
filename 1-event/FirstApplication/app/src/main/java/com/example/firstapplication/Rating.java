package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
<<<<<<< HEAD
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.ToggleButton;
=======
import android.widget.RatingBar;
import android.widget.TextView;
>>>>>>> 1e25c7cd36f9baa2fcb750644aa2c0db5bbf8785

public class Rating extends AppCompatActivity {

    private RatingBar ratingBar;
<<<<<<< HEAD
    private TextView textView1,textView2;
    private ToggleButton toggleButton1;
=======
    private TextView textView1;
>>>>>>> 1e25c7cd36f9baa2fcb750644aa2c0db5bbf8785

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        ratingBar = findViewById(R.id.rating);
        textView1 = findViewById(R.id.txt_2);
<<<<<<< HEAD
        textView2 = findViewById(R.id.txt_4);
        toggleButton1 = findViewById(R.id.tg_1);
=======
>>>>>>> 1e25c7cd36f9baa2fcb750644aa2c0db5bbf8785

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                textView1.setText(String.valueOf((rating)));
            }
        });

<<<<<<< HEAD
        toggleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleButton1.isChecked()){
                    textView2.setText("ON");
                }
                else{
                    textView2.setText("OFF");
                }
            }
        });

=======
>>>>>>> 1e25c7cd36f9baa2fcb750644aa2c0db5bbf8785
    }
}
