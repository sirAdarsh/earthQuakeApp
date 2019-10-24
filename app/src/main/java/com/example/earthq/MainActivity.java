package com.example.earthq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list=(ListView)findViewById(R.id.list);

        ArrayList<details> earthquakes=QueryUtils.extractEarthquakes();

        listAdapter ladapter=new listAdapter(this,earthquakes);
        list.setAdapter(ladapter);

    }
}
