package com.michaelfahmy.events.organizeyourevent;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Michael Fahmy on 08/26/2015.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"Day 1", "Day 2", "Day 3"};

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new DayOne();
            case 1:
                return new DayTwo();
            case 2:
                return new DayThree();
            default:
                return new DayOne();
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return 3;
    }
}
