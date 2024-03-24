package com.example.iattendance.Faculty_Attendance_Screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.iattendance.R;
import com.google.android.material.tabs.TabLayout;

public class FacultyAttendancePg extends AppCompatActivity {
    TabLayout stud_tab;
    ViewPager stud_viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faculty_attendance_pg);

        stud_tab = findViewById(R.id.stud_tab);
        stud_viewPager = findViewById(R.id.stud_viewPager);
    }
}