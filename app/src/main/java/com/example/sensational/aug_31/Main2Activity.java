package com.example.sensational.aug_31;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    public static final String TAG ="State Change";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Log.i ( TAG, "this is onCreate in Activity 2 ");
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
    public void goTo1 (  View v  ) {
        Intent i = new Intent ( this, MainActivity.class);
        startActivity(i);

/*
        ViewGroup rootContainer;
        rootContainer = (ViewGroup) findViewById(R.id.rootLayout);
        Scene scene1 = Scene.getSceneForLayout(rootContainer, R.layout.activity_main, this);
        //Scene scene2 = Scene.getSceneForLayout(rootContainer, R.layout.activity_main2, this);
        scene1.enter();
*/

    }
    public void goTo2 ( View v ) {

    }

    public void goTo3 ( View v ) {
        Intent i = new Intent ( this, Main3Activity.class);
        startActivity(i);

    }


}
