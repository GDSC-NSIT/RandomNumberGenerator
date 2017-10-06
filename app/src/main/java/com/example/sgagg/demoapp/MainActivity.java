package com.example.sgagg.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String COUNT_KEY = "_count_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClickFunction(View view) {
        TextView numTextView = (TextView)findViewById(R.id.countTextView);
        String str = numTextView.getText().toString();
        Integer itr = Integer.parseInt(str);
        itr+=1;
        numTextView.setText(itr.toString());
    }

    public void randomActivity(View view) {
        TextView numTextView = (TextView)findViewById(R.id.countTextView);
        String str = numTextView.getText().toString();
        Integer itr = Integer.parseInt(str);

        Intent i = new Intent(MainActivity.this, RandomNumberActivity.class);
        i.putExtra(COUNT_KEY, itr);
        startActivity(i);
    }
}
