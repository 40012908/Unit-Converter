package com.lnt.multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "my.first.app";
    public static final String EXTRA_MESSAGE1 = "my.first1.app";
    public static final String EXTRA_MESSAGE2 = "my.first2.app";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMyMessage(View view)
    {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText =(EditText) findViewById(R.id.editTextName);
        EditText editText1 =(EditText) findViewById(R.id.editTextPhone);
        EditText editText2 =(EditText) findViewById(R.id.editTextTextEmailAddress);
        String message= editText.getText().toString();
        String message1= editText1.getText().toString();
        String message2= editText2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        intent.putExtra(EXTRA_MESSAGE1,message1);
        intent.putExtra(EXTRA_MESSAGE2,message2);
        startActivity(intent);
    }
}