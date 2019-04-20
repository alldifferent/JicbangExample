package com.alldi.jicbangexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alldi.jicbangexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);

        act.numTxt.setText("32개");
        bindViews();
        setupEvents();
        setValues();

    }

    void setupEvents(){


    }

    void setValues(){


    }

    void bindViews(){


    }


}
