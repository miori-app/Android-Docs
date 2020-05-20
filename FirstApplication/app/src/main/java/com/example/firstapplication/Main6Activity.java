package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main6Activity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        listView = findViewById(R.id.listview3);

        MyListViewAdapter adapter = new MyListViewAdapter();
        ArrayList<MyListViewItem> data = adapter.getData();

        data.add(new MyListViewItem(
                ContextCompat.getDrawable(this,R.drawable.my_logo),"miori","@miori","1m","hello"));

        data.add(new MyListViewItem(
                ContextCompat.getDrawable(this,R.drawable.android_logo),"android","@android","3m","go go"));



        listView.setAdapter(adapter);


    }
}
