package com.example.mobiledevelopment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("test", "testje0");
    }

    public void LaunchSecondActivity(View view) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    public void LaunchBibActivity(View view) {
        Intent intent = new Intent(this, Bib.class);
        startActivity(intent);
    }
}