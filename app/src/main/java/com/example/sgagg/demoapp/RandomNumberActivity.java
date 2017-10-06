package com.example.sgagg.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class RandomNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_number);

        TextView tv = (TextView)findViewById(R.id.randomButton);
        Intent i = getIntent();

        int itr = i.getIntExtra(MainActivity.COUNT_KEY, -1);

        Random random = new Random();

        Integer randomNum = random.nextInt(itr);

        tv.setText(randomNum.toString());
    }
}
