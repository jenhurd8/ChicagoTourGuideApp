package com.example.android.chicagotourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3", "tab4" };
    private Context context;

    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context){
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return ActivitiesFragment.newInstance(position + 1);
    }

//        @Override
//    public Fragment getItem(int position){
//        if (position == 0) {
//            return new ActivitiesFragment();
//        } else if (position == 1){
//            return new FoodFragment();
//        } else if (position == 2){
//            return new SightsFragment();
//        } else {
//            return new MuseumFragment();
//        }
//    }

    @Override
    public CharSequence getPageTitle(int position){
        return tabTitles[position];
    }

//    @Override
//    public Fragment getItem(int position){
//        return ActivitiesFragment.newInstance(position + 1);
//    }

    @Override
    public int getCount()
    {
        return 4;
    }
}