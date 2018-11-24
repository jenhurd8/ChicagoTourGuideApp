package com.example.android.chicagotourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private Context context;

    private String tabTitles[] = new String[] { "ACTIVITIES", "FOOD", "SIGHTS",
            //"MUSEUMS"
//            context.getString(R.string.activities),
//            context.getString(R.string.food),
//            context.getString(R.string.sights),
    //        context.getString(R.string.sights),
            };

    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context){
        super(fm);
        this.context = context;
    }

        @Override
    public Fragment getItem(int position){
        if (position == 0) {
            return new ActivitiesFragment().newInstance(position + 1);
        } else if (position == 1){
            return new FoodFragment().newInstance(position + 1);
        } else if (position == 2){
            return new SightsFragment().newInstance(position + 1);
        } else {
            return new MuseumFragment().newInstance(position + 1);
        }
    }

    @Override
    public CharSequence getPageTitle(int position){
        return tabTitles[position];
    }

    @Override
    public int getCount()
    {
        return 4;
    }
}