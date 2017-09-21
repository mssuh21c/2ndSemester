package com.example.sensational.aug_31;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {

    public static final String TAG ="State Change";


    ViewGroup rc;
    Scene s2;
    Scene s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("markDebug",  " this is onCreate in Main 1 Activity ");

        Button button = (Button) findViewById(R.id.copyBtn);

        button.setOnClickListener (
                new Button.OnClickListener ( ) {

                    public void onClick ( View v) {

                        Toast toast = Toast.makeText(getApplicationContext(), "this is after clicked in PB1 ", Toast.LENGTH_SHORT);
                        toast.show();

                        EditText aa = (EditText) findViewById(R.id.editText);
                        //aa.getText();

                        TextView bb = (TextView) findViewById(R.id.textView);
                        bb.setText( aa.getText());

                    }

                }
        );



        Log.i ( TAG, "this is onCreate in Activity 1 ");


    }

    protected void onPause ( Bundle savedInstanceState ) {

        Toast toast = Toast.makeText(getApplicationContext(), "this will be poped up after pressing back button ", Toast.LENGTH_SHORT);
        toast.show();

        Log.i ( TAG, "mark : this is onPause in Activity 1 ,,, when is this called ? ");

    }




    public void nextScene  ( View view) {

        /*
        Intent intent = new Intent ( this , SecondInstanceWithNewScreen.class);
        startActivity( intent );
        */

        ViewGroup rootContainer;

        rootContainer = (ViewGroup) findViewById(R.id.rootLayout);
        Scene scene1 = Scene.getSceneForLayout(rootContainer, R.layout.activity_main, this);
        Scene scene2 = Scene.getSceneForLayout(rootContainer, R.layout.activity_main2, this);

        Toast t = Toast.makeText(this, "Next Scene will be coming ", Toast.LENGTH_LONG ) ;
        t.show();


        scene2.enter();

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

    public void goTo2 (  View v  ) {
//        Intent i = new Intent ( this, SecondInstanceWithNewScreen.class);
//        startActivity(i);


        rc = (ViewGroup) findViewById(R.id.rootLayout);
            // id should be first parent layout of launcher activity  ***********

        s2 = Scene.getSceneForLayout(rc, R.layout.activity_main2, this);

        s2.enter();


    }


    public void goTo3 ( View v ) {

        /*

        //Intent i = new Intent ( this, Main3Activity.class);       // this is not instantiated yet
        //startActivity(i);
        ViewGroup rc;
        Scene s3;                               // s3 will be used within this scope
                                                // s1, s2, s3 should be global , and anyone is able to access.....

        rc = (ViewGroup) findViewById(R.id.rootLayout);
        s3 = Scene.getSceneForLayout(rc, R.layout.activity_main3, this);  // file name of xml
        s3.enter();

        */

        Log.i(" mark Debug ",  " this is at the goTo3 afer clicked by button");

        s3 = Scene.getSceneForLayout(rc, R.layout.activity_main3, this);

        s3.enter();


    }


}

