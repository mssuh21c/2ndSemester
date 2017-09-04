package com.example.sensational.aug_31;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        Button button = (Button) findViewById(R.id.button2);

        button.setOnClickListener (
                new Button.OnClickListener ( ) {

                    public void onClick ( View v) {
                    //public void onClick ( View v ) {

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

    }

    public void PB2( View view ){

        Toast toast = Toast.makeText(getApplicationContext(), "this is after clicked in PB2 ", Toast.LENGTH_SHORT);
        toast.show();


        EditText aa = (EditText) findViewById(R.id.editText);
        //aa.getText();

        TextView bb = (TextView) findViewById(R.id.textView);
        bb.setText( aa.getText());


    }
}

