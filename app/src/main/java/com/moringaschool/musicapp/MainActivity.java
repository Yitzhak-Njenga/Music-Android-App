package com.moringaschool.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //reference to UI elements
    LinearLayout L1,L2;
    TextView tv;
    private Button musicButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        L1 =(LinearLayout)findViewById(R.id.l1);
        L2=(LinearLayout)findViewById(R.id.l2);

        tv =(TextView)findViewById(R.id.tag);

        musicButton =(Button)findViewById(R.id.musicButton);
        musicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Listen Music of Your Choice",Toast.LENGTH_LONG).show();
            }
        });
    }
}