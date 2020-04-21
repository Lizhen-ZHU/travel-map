package com.example.travelmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IntroPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_page);
    }

    public void send1(View view){
        Intent intent = new Intent(this, Map.class);
        startActivity(intent);
    }

    public void send2(View view){
        Intent intent = new Intent(this, MovieList.class);
        startActivity(intent);
    }

    public void send3(View view){
        Intent intent = new Intent(this, TravelPlan.class);
        startActivity(intent);
    }

    public void send4(View view){
        Intent intent = new Intent(this, Share.class);
        startActivity(intent);
    }
}
