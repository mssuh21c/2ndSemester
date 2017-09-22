package com.example.sensational.aug_31;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class SecondInstanceWithNewScreen extends AppCompatActivity {

    public static final String TAG ="State Change";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen5);


        //Log.i ( TAG, "this is onCreate in Activity 2 ");
        Log.d("markDebug" , " this is onCreate in Main 2 Activity ");
    }

    protected void onPause ( Bundle savedInstanceState ) {

        Toast toast = Toast.makeText(getApplicationContext(), "onPause : this will be poped up after pressing back button ", Toast.LENGTH_SHORT);
        toast.show();

        Log.i("Debug", " mark is On Pause in Main2 Activity ");



    }

    protected void onResume ( Bundle savedInstanceState ) {
        Toast toast = Toast.makeText(getApplicationContext(), "onResume : this will be poped up after pressing back button ", Toast.LENGTH_SHORT);
        toast.show();

        Log.i("Debug", " mark is On Resume in Main2 Activity ");
    }



}
