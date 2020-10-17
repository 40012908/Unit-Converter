package com.lnt.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    ArrayList<String> personNames = new ArrayList<>(Arrays.asList("P1","P2","P3","P4","P5","P6","P7"));
    ArrayList<String> personNames2 = new ArrayList<>(Arrays.asList("V1","V2","V3","V4","V5","V6","V7"));
    static Integer[] drawableArray={R.drawable.cupcake,R.drawable.donut,R.drawable.froyo,R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.ic_launcher,R.drawable.ic_launcher_background};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        NewAdapter newAdapter = new NewAdapter(MainActivity.this,personNames,personNames2,drawableArray);
        recyclerView.setAdapter(newAdapter);
    }
}