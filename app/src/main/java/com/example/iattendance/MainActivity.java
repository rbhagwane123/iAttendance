package com.example.iattendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Welcome_screen.class);
                startActivity(intent);
                finish();
            }
        }, 3000);

        Toast.makeText(this, "HELLO NICE TO SEE YOU!....", Toast.LENGTH_SHORT).show();


    }
}