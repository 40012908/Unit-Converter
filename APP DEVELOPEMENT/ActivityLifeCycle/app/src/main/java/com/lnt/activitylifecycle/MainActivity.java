package com.lnt.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static  final String HOME_ACTIVITY_TAG=MainActivity.class.getSimpleName();

    private void showLog(String text){
        Log.d(HOME_ACTIVITY_TAG,text);

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showLog("Activity Created");
    }
    @Override
    protected void onStart(){
        super.onStart();
        showLog("Activity Started");
    }
    @Override
    protected void onResume(){
        super.onResume();
        showLog("Activity Resumed");
    }
    @Override
    protected void onPause(){
        super.onPause();
        showLog("Activity paused");
    }
    @Override
    protected void onStop(){
        super.onStop();
        showLog("Activity stopped");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        showLog("Activity Destroyed");
    }
}