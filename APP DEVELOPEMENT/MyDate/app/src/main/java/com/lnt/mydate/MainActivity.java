package com.lnt.mydate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button submit;
    DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker = (DatePicker) findViewById(R.id.dateP);
        submit = (Button) findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day="Day="+datePicker.getDayOfMonth();
                String month="Month="+(datePicker.getMonth()+1);
                String year="Year="+datePicker.getYear();
                Toast.makeText(getApplicationContext(),day+"\n"+year,Toast.LENGTH_LONG).show();
            }
        });
    }
}