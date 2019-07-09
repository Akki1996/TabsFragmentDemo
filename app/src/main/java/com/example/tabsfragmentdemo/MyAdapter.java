package com.example.tabsfragmentdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyAdapter extends FragmentStatePagerAdapter {
    int tabcount;

    public MyAdapter(FragmentManager fm, int tabcount) {
        super(fm);
        this.tabcount = tabcount;
    }

    @Override
    public Fragment getItem(int pos) {
        switch (pos) {
            case 0:
                Fragment_One fragment_one = new Fragment_One();
                return fragment_one;
            case 1 :
                Fragment_Two fragment_two = new Fragment_Two();
                return fragment_two;
            case 2:
                Fragment_Three fragment_three = new Fragment_Three();
                return fragment_three;
                default:return null;
        }

    }

    @Override
    public int getCount() {
        return tabcount;
    }


}
