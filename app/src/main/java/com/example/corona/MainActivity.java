package com.example.corona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;



public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.rahul.awareness";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Prevention(View view){
        Intent intent1 = new Intent(this, Prevention.class);
        //intent.putExtra(MSG, )
        startActivity(intent1);
    }
    public void Symptoms (View view){
        Intent intent2 = new Intent(this, Symptoms.class);
        startActivity(intent2);
    }
}
