package com.example.sensational.HYWU;

import android.app.Application;
import android.os.Bundle;
import android.support.v4.app.Fragment;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

/**
 * Created by mssuh on 2017-09-24.
 */

public class TextSizeSetting extends Fragment implements SeekBar.OnSeekBarChangeListener {

    private static int seekValue =0 ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.fragment1, viewGroup, false);

/*
        final SeekBar seekBar = ( SeekBar) view.findViewById(R.id.seekBar) ;
        seekBar.setOnSeekBarChangeListener( this );

        final Button button = (Button) view.findViewById(R.id.button29);
        button.setOnClickListener();
*/


        return view;

    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        seekValue = progress;

        Log.i("Mark Debug", " Mark is onProgressChanged");

        //Toast.makeText ( getApplicationContext() , "on ProgressChanged", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
