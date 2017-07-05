package com.example.david.imkproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



public class TeoriAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    public TeoriAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int arg0) {
        TeoriPager myFragment = new TeoriPager();
        Bundle data = new Bundle();
        data.putInt("current_page", arg0+1);
        myFragment.setArguments(data);
        return myFragment;
    }
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if( position == 0) {
            return "Teori Biner";}
        else if(position == 1){
            return "Teori Decimal";
        }
        else if (position == 2){
            return "Teori Octal";
        }
        else{
            return "Teori Hexa";
        }
    }
}