package com.example.iattendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.iattendance.Sign_up_Screens.Admin_signup.Admin_signup_pg1;
import com.google.android.material.button.MaterialButton;

public class SelectRole extends AppCompatActivity {
    MaterialButton nxtBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_role_pg);

        nxtBtn = findViewById(R.id.nxtBtn);

        nxtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectRole.this, Admin_signup_pg1.class));
            }
        });
    }
}