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


/*
    ViewGroup rc;
    Scene scr1;
    Scene scr2;
    Scene scr3;
*/
    public static ViewGroup rc;
    public static Scene scr1;
    public static Scene scr2;
    //ViewGroup scr2;
    public static Scene scr3;
    public static Scene scr4;
    public static Scene scr5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*    ****     */
        setContentView(R.layout.activity_main);

        Log.d("markDebug",  " this is onCreate in Main 1 Activity ");


        // id should be first parent layout of launcher activity  ***********
        rc = (ViewGroup) findViewById(R.id.rootLayout);

        scr1 = Scene.getSceneForLayout(rc, R.layout.activity_main, this);

        scr2 = Scene.getSceneForLayout(rc, R.layout.activity_main2, this);
        //scr2 = ( ViewGroup) findViewById(R.id.lay2);
        scr3 = Scene.getSceneForLayout(rc, R.layout.activity_main3, this);
        scr4 = Scene.getSceneForLayout(rc, R.layout.activitymainscr4, this);
        scr5 = Scene.getSceneForLayout(rc, R.layout.screen5, this);








/*      listener implementation

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
*/

        Log.i ( TAG, "this is onCreate in Activity 1 ");


    }

    protected void onPause ( Bundle savedInstanceState ) {

        Toast toast = Toast.makeText(getApplicationContext(), "this will be poped up after pressing back button ", Toast.LENGTH_SHORT);
        toast.show();
        Log.i ( TAG, "mark : this is onPause in Activity 1 ,,, when is this called ? ");
    }

    protected void onStop ( Bundle savedInstanceState ) {

        Toast toast = Toast.makeText(getApplicationContext(), "this will be poped up after startActvity  ", Toast.LENGTH_SHORT);
        toast.show();

        Log.i ( TAG, "mark : this is onStop in Activity 1 ,,, when is this called ? ");

    }



    //public void goTo1 (  View v  ) {

    public void  copyFromInputToOutput (  View v  ) {

        Toast toast = Toast.makeText(getApplicationContext(), "this is after copy button clicked ", Toast.LENGTH_SHORT);
        toast.show();

        // check Toast   new Toast ,,,,, Toast.makeText ....

        EditText aa = (EditText) findViewById(R.id.editText);
        //aa.getText();

        TextView bb = (TextView) findViewById(R.id.textView);
        bb.setText( aa.getText());

    }



    public static void goTo1 (  View v  ) {
        scr1.enter();
    }

    public void goTo2 (  View v  ) {
        scr2.enter();
    }

    public void goTo3 ( View v ) {
<<<<<<< HEAD

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

        Log.i(" mark Debug ",  " this is at the goTo3 after clicked by button");

        rc = (ViewGroup) findViewById(R.id.rootLayout);
        s3 = Scene.getSceneForLayout(rc, R.layout.activity_main3, this);
=======
        Log.i(" mark Debug ",  " this is at the goTo3 afer clicked by button");
        scr3.enter();
    }
    public void goTo4 ( View v ) {
        Log.i(" mark Debug ",  " this is at the goTo4 afer clicked by button");
        scr4.enter();
    }

    public void goTo5 ( View v ) {
        Log.i(" mark Debug ",  " this is at the goTo5 afer clicked by button");
        scr5.enter();
    }

    public void newActivity ( View v ) {
>>>>>>> ff3fb3f6fed193b830a71dc494b09b818e8f5b96

        Intent i = new Intent ( this , SecondInstanceWithNewScreen.class);
        startActivity( i );


    }



}

