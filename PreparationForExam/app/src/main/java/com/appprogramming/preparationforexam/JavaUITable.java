package com.appprogramming.preparationforexam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class JavaUITable extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        TableLayout tableLayout = new TableLayout(this);

        tableLayout.setStretchAllColumns(true);

        TableRow tableRow1  = new TableRow(this);
        TableRow tableRow2  = new TableRow(this);
        TableRow tableRow3  = new TableRow(this);

        TextView tvhb = new TextView(this);
        tvhb.setText("학번");
        TextView tvname = new TextView(this);
        tvname.setText("이름");


        EditText ethb = new EditText(this);
        ethb.setHint("학번 입력");
        EditText etname = new EditText(this);
        etname.setHint("이름 입력");

        tableRow1.addView(tvhb);
        tableRow1.addView(ethb);

        tableRow2.addView(tvname);
        tableRow2.addView(etname);

        Button btnsend = new Button(this);
        btnsend.setText("send");
        Button btncancel = new Button(this);
        btncancel.setText("Java Calculator");
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaUITable.this,JavaCal.class);
                startActivity(intent);
            }
        });

        tableRow3.addView(btnsend);
        tableRow3.addView(btncancel);



        tableLayout.addView(tableRow1);
        tableLayout.addView(tableRow2);
        tableLayout.addView(tableRow3);
        setContentView(tableLayout);



    }

}

