package com.example.environmentsetup;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class MainActivity extends AppCompatActivity {

    String[] cities = {"Seattle", "Bothell", "Kirkland", "Bellevue", "Lynnwood", "Renton",
            "Redmond", "Spokane", "Vancouver", "Tacoma", "Olympia", "Bellingham", "Arlington",
            "Everett", "Woodinville", "Monroe", "New Castle", "Ballard", "Lacey"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> cityList = new ArrayAdapter<String>(this, R.layout.listview_layout, R.id.cityLayout, cities);
        ListView lv = findViewById(R.id.cityListView);
        lv.setAdapter(cityList);
    }





}