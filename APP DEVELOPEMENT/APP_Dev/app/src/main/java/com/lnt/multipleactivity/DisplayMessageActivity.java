package com.lnt.multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        //get the intent that started this activity and extract the text
        Intent intent = getIntent();
        String msg =intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String msg1 =intent.getStringExtra(MainActivity.EXTRA_MESSAGE1);
        String msg2 =intent.getStringExtra(MainActivity.EXTRA_MESSAGE2);
        //capture the layout's text view and set the string as it text
        TextView tv = findViewById(R.id.textView1);
        tv.setText(msg);
        TextView tv1 = findViewById(R.id.textView2);
        tv1.setText(msg1);
        TextView tv2 = findViewById(R.id.textView3);
        tv2.setText(msg2);

    }
}