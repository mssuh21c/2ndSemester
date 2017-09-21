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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("markDebug",  " this is onCreate in Main 1 Activity ");


        Button button = (Button) findViewById(R.id.copyBtn);



        //Button button = (Button) findViewById(R.id.button2);

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


    }


    /*
    public void PB1( ){

        Toast toast = Toast.makeText(getApplicationContext(), "this is after clicked in PB1 ", Toast.LENGTH_SHORT);


    }
*/



    public void PB2( View view ){

        Toast toast = Toast.makeText(getApplicationContext(), "this is after clicked in PB2 ", Toast.LENGTH_SHORT);

        toast.show();


        EditText aa = (EditText) findViewById(R.id.editText);
        //aa.getText();

        TextView bb = (TextView) findViewById(R.id.textView);
        bb.setText( aa.getText());
    }



    public void nextScene  ( View view) {

        /*
        Intent intent = new Intent ( this , Main2Activity.class);
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
        Intent i = new Intent ( this, Main2Activity.class);
        startActivity(i);

/*
        ViewGroup rootContainer;
        rootContainer = (ViewGroup) findViewById(R.id.rootLayout);
        Scene scene1 = Scene.getSceneForLayout(rootContainer, R.layout.activity_main, this);
        //Scene scene2 = Scene.getSceneForLayout(rootContainer, R.layout.activity_main2, this);
        scene1.enter();
       */

    }


}

