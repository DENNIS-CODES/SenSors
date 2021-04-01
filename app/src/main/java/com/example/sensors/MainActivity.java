package com.example.sensors;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    SensorManager sm=null;
    TextView textView1=null;
    List list;

    SensorEventListener sel=new SensorEventListener() {
        @Override
        public void onSensorChanged(SensorEvent event) {
            float[]values=event.values;
            textView1.setText("x:"+values[0]+"\ny:"+values[1]+"\nz"+values[2]);
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {

        }
    };
@Override
    public void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    /*Get a SensorManager Instance*/
    sm=(SensorManager)getSystemService(SENSOR_SERVICE);
    textView1=(TextView)findViewById(R.id.textView1);
    list=sm.getSensorList(Sensor.TYPE_ACCELEROMETER);
    if(list.size()>0){
        sm.registerListener(sel,(Sensor)list.get(0),SensorManager.SENSOR_DELAY_NORMAL);
    }else{
        Toast.makeText(getBaseContext(),"Error:NO Accelerometer.",Toast.LENGTH_LONG).show();
    }
}
@Override
    protected void onStop(){
    if (list.size()>0){
        sm.unregisterListener(sel);
    }
    super.onStop();
}
}