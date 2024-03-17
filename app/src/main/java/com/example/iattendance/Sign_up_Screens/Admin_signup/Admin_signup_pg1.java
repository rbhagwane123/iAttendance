package com.example.iattendance.Sign_up_Screens.Admin_signup;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.iattendance.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.hbb20.CountryCodePicker;

import java.util.Objects;

public class Admin_signup_pg1 extends AppCompatActivity {
    CountryCodePicker country_code;
    TextInputLayout phone_num, otp;
    String phoneNumberRegex;
    MaterialButton get_otp, resend_btn;
    LinearLayout ll;

    private FirebaseAuth mAuth;
    private String verificationId;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_signup_pg1);

//        Hooks
        country_code = findViewById(R.id.country_code);
        phone_num = findViewById(R.id.phone_num);
        otp = findViewById(R.id.otp);
        get_otp = findViewById(R.id.get_otp);
        resend_btn = findViewById(R.id.resend_btn);
        ll = findViewById(R.id.ll);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

    }

    private boolean isPhoneNumberValid() {

//        Regular expression for phone number
        phoneNumberRegex = "^[+]?[0-9]{10,13}$";
        String getTxt = Objects.requireNonNull(phone_num.getEditText()).getText().toString().trim();
        Toast.makeText(Admin_signup_pg1.this, country_code.getFormattedFullNumber(), Toast.LENGTH_SHORT).show();


        if (getTxt.isEmpty()) {
            phone_num.setError("Invalid phone number");
            return false;
        } else if (country_code.getFormattedFullNumber().replace(" ", "").matches(phoneNumberRegex)) {
            phone_num.setErrorIconDrawable(null);
            phone_num.setError("Invalid phone number");
            return false;
        } else if (country_code.getFullNumber().length() != 12) {
            phone_num.setErrorIconDrawable(null);
            phone_num.setError("Check phone number");
            return false;
        } else {
            phone_num.setError(null);
            phone_num.setErrorEnabled(false);
            return true;
        }
    }
}