package com.example.sensational.HYWU;

import android.os.Bundle;
import android.support.v4.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;

/**
 * Created by mssuh on 2017-09-24.
 */

public class TextSizeSetting extends Fragment implements SeekBar.OnSeekBarChangeListener {

    private static int seekValue =0 ;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.fragment1, viewGroup, false);


        final SeekBar seekBar = ( SeekBar) view.findViewById(R.id.seekBar) ;
        seekBar.setOnSeekBarChangeListener( this );

        final Button button = (Button) view.findViewById(R.id.button29);
        button.setOnClickListener();
        return view;

    }
    @Override
    public void OnProgressChanged ( SeekBar seekBar, int progress , boolean fromUser ) {


    }

}
