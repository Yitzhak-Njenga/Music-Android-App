package com.moringaschool.musicapp;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MusicActivity extends AppCompatActivity {

    private TextView musicTextView;
    private ListView musicListView;
    private String[] genre = new String[] {"HipHop","Afro Beats","Classic","Reggae","Soul","Rnb","Ragga","Worship","Local"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        musicTextView = (TextView) findViewById(R.id.musicGenre);
        musicListView =(ListView) findViewById(R.id.musicListView);
    }



}


