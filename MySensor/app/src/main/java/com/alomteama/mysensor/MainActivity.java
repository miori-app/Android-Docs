package com.alomteama.mysensor;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.hardware.Sensor.TYPE_ALL;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private SensorManager sm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        sm = (SensorManager) getSystemService(SENSOR_SERVICE); //다운캐스팅

        //sensor list를 가져올 수 있음
        final List<Sensor> sensorList = sm.getSensorList(TYPE_ALL);

        ArrayList<String> sensorStringList = new ArrayList<String>();

        for (Sensor sensor: sensorList){
            String sensorName = sensor.getName();
            sensorStringList.add(sensorName);
        }

        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sensorStringList));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Sensor clickedSensor = sensorList.get(position);

                sm.registerListener(new SensorEventListener() {
                    @Override
                    public void onSensorChanged(SensorEvent event) {
                        // sensor값을 toast로 출력
                        // val1, val2, val3, 이렇게 스트링화 시켜서 toast로 출력
                        float[] sensorValueArray = event.values;
                        String values = "";
                        for (float val : sensorValueArray){
                            values += val + ",";
                        }
                        Toast.makeText(MainActivity.this, values, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onAccuracyChanged(Sensor sensor, int accuracy) {

                    }
                },clickedSensor,3000);


            }
        });
    }
}
