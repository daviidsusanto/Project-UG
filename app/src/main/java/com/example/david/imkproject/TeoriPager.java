package com.example.david.imkproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TeoriPager extends Fragment {
    int mCurrentPage;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle data = getArguments();
        mCurrentPage = data.getInt("current_page", 0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = null;
        if (mCurrentPage == 1) {
            v = inflater.inflate(R.layout.teori_biner, container, false);
        } else if (mCurrentPage == 2) {
            v = inflater.inflate(R.layout.teori_decimal, container, false);
        } else if (mCurrentPage == 3) {
            v = inflater.inflate(R.layout.teori_octal, container, false);
        } else if (mCurrentPage == 4){
            v = inflater.inflate(R.layout.teori_hexa, container, false);
        }
        return v;
    }}