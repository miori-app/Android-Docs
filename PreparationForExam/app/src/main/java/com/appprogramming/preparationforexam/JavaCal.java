package com.appprogramming.preparationforexam;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;

import androidx.appcompat.app.AppCompatActivity;

public class JavaCal extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        TableLayout tableLayout = new TableLayout(this);
        tableLayout.setStretchAllColumns(true);

        TableRow tableRow1 = new TableRow(this);
        TableRow tableRow2 = new TableRow(this);
        TableRow tableRow3 = new TableRow(this);
        TableRow tableRow4 = new TableRow(this);
        TableRow tableRow5 = new TableRow(this);
        TableRow tableRow6 = new TableRow(this);
        TableRow tableRow7 = new TableRow(this);
        //TableRow tableRow8 = new TableRow(this);


        //TableRow.LayoutParams p = new TableRow.LayoutParams();
        EditText et1 = new EditText(this);
        et1.setHint("Name");
        //p.span=3;
        tableRow1.addView(et1);

        Button btn1 = new Button(this);
        btn1.setText("1");
        Button btn2 = new Button(this);
        btn2.setText("2");
        Button btn3 = new Button(this);
        btn3.setText("3");
        tableRow2.addView(btn1);
        tableRow2.addView(btn2);
        tableRow2.addView(btn3);

        Button btn4 = new Button(this);
        btn4.setText("4");
        Button btn5 = new Button(this);
        btn5.setText("5");
        Button btn6 = new Button(this);
        btn6.setText("6");
        tableRow3.addView(btn4);
        tableRow3.addView(btn5);
        tableRow3.addView(btn6);

        Button btn7 = new Button(this);
        btn7.setText("7");
        Button btn8 = new Button(this);
        btn8.setText("8");
        Button btn9 = new Button(this);
        btn9.setText("9");
        tableRow4.addView(btn7);
        tableRow4.addView(btn8);
        tableRow4.addView(btn9);

        Button btnn1 = new Button(this);
        btn1.setText("7");
        btnn1.setVisibility(View.INVISIBLE);
        Button btn0 = new Button(this);
        btn0.setText("0");
        Button btnc = new Button(this);
        btnc.setText("clear");
        tableRow5.addView(btnn1);
        tableRow5.addView(btn0);
        tableRow5.addView(btnc);

        Button btnp = new Button(this);
        btnp.setText("+");
        Button btnm = new Button(this);
        btnm.setText("_");
        Button btnn2 = new Button(this);
        btnn2.setText("clear");
        btnn2.setVisibility(View.INVISIBLE);
        tableRow6.addView(btnp);
        tableRow6.addView(btnm);
        tableRow6.addView(btnn2);

        Button btng = new Button(this);
        btng.setText("*");
        Button btnd = new Button(this);
        btnd.setText("/");
        Button btnn3 = new Button(this);
        btnn3.setText("clear");
        btnn3.setVisibility(View.INVISIBLE);
        tableRow7.addView(btng);
        tableRow7.addView(btnd);
        tableRow7.addView(btnn3);



        tableLayout.addView(tableRow1);
        tableLayout.addView(tableRow2);
        tableLayout.addView(tableRow3);
        tableLayout.addView(tableRow4);
        tableLayout.addView(tableRow5);
        tableLayout.addView(tableRow6);
        tableLayout.addView(tableRow7);
        //tableLayout.addView(tableRow8);


        setContentView(tableLayout);
    }
}
