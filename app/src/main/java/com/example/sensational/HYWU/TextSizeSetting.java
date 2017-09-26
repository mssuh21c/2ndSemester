package com.example.sensational.HYWU;

import android.app.Activity;
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
import android.widget.Toolbar;

/**
 * Created by mssuh on 2017-09-24.
 */

public class TextSizeSetting extends Fragment  {


    ToolbarListener activityCallback;
    //Toolbar.OnClickListener activityCallback;

    public interface ToolbarListener {
            public void onButtonClick ( int position    , String message  );

    }

    private static int seekValue =0 ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.fragment1, viewGroup, false);

        return view;

    }

    @Override
    public void onAttach (Activity activity){
        super.onAttach( activity);
        activityCallback = (ToolbarListener) activity;
    }

    public void buttonClicked ( View view) {
        activityCallback.onButtonClick( 2, "what is this");
    }

}
