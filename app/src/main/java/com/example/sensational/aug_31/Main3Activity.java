package com.example.sensational.aug_31;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    public static final String TAG ="State Change";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //Log.i ( TAG, "this is onCreate in Activity 3 ");

        Log.d("markDebug",  " this is onCreate in Main 3 Activity ");
    }

}
