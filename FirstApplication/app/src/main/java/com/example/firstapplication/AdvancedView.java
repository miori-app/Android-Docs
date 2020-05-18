package com.example.firstapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class AdvancedView extends AppCompatActivity {

    private TextView textView,textView2;
    private Button button,date_button;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_view);

        textView = findViewById(R.id.mytxt);
        textView2 = findViewById(R.id.mytxt3);
        button = findViewById(R.id.mybb);
        date_button = findViewById(R.id.mybb2);



        registerForContextMenu(textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(AdvancedView.this);
                alertDialogBuilder.setMessage("결제 ㄱㄱ??");

                alertDialogBuilder.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        textView2.setText("no!");
                    }
                });

                alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        textView2.setText("yes!");
                    }
                });



                //잘 생성해서
                AlertDialog alertDialog = alertDialogBuilder.create();

                alertDialog.show();

            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        //java code
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.setHeaderTitle("I'm header");
        menu.add(0,1,0,"bg: red");
        menu.add(0,2,0,"bg: green");
        menu.add(0,3,0,"bg: blue");

        // xml code
        //MenuInflater inflater = getMenuInflater();
        //inflater.inflate(R.menu.mymenu, menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        //java code
        super.onCreateOptionsMenu(menu); //초기화 작업
        menu.add(0,1,0,"CAT");
        menu.add(0,2,0,"DOG");
        menu.add(0,3,0,"HUMAN");
        return true;


        // xml로 정의한 mymemu.xml
        /*
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu,menu);
        return true;
        */

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        // toast message 로 화면에 title 출력

        Toast.makeText(this,item.getTitle()+ String.valueOf(item.getItemId()),Toast.LENGTH_SHORT).show();
        return true;
    }
}
