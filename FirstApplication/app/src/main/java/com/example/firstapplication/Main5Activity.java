package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

//Data
        Integer[] data = {1,2,3};
        //String[] data = new String[3];
        //data[0]="A";

        //UI
        listView = findViewById(R.id.listview2);

        // Data (Array) <--- array adapter ---> UI
        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this,android.R.layout.simple_list_item_1,data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // view 이용
                AppCompatTextView tv = (AppCompatTextView) view;
                Toast.makeText(Main5Activity.this,tv.getText().toString(),Toast.LENGTH_SHORT).show();

                //listview 이용
                //Object obj = parent.getItemAtPosition(position);
                //System.out.println(obj);
            }
        });
    }
}
