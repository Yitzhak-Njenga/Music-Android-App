package com.moringaschool.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //reference to UI elements

    LinearLayout L1,L2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        L1 =(LinearLayout)findViewById(R.id.l1);
        L2 =(LinearLayout)findViewById(findViewById(R.id.l2);

        tv =(TextView)findViewById(R.id.tag);
    }
}