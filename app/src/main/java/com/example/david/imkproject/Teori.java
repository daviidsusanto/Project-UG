package com.example.david.imkproject;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class Teori extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teori);
        ViewPager pager = (ViewPager)findViewById(R.id.pager);
        FragmentManager fm = getSupportFragmentManager();
        TeoriAdapter pagerAdapter = new TeoriAdapter(fm);
        pager.setAdapter(pagerAdapter);
    }
}