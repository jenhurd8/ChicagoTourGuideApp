package com.example.android.chicagotourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private Context context;

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
        switch (position) {
            case 0:
                return context.getString(R.string.activities);
            case 1:
                return context.getString(R.string.food);
            case 2:
                return context.getString(R.string.sights);
            case 3:
                return context.getString(R.string.museum);
        }
        return null;
    }

    @Override
    public int getCount()
    {
        return PAGE_COUNT;
    }
}