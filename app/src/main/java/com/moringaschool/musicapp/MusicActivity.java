package com.moringaschool.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MusicActivity extends AppCompatActivity {

//    private TextView musicTextView;
//    private ListView musicListView;

    @BindView(R.id.musicGenre) TextView musicTextView;
    @BindView(R.id.musicListView) ListView musicListView;
    private String[] genre = new String[] {"HipHop","Afro Beats","Classic","Reggae","Soul","Rnb","Ragga","Worship","Local"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        ButterKnife.bind(this);

//        musicTextView = (TextView) findViewById(R.id.musicGenre);
//        musicListView = (ListView) findViewById(R.id.musicListView);


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, genre);
        setContentView(R.layout.activity_music);
        musicListView.setAdapter(adapter);
        Intent intent=getIntent();

    }

}


