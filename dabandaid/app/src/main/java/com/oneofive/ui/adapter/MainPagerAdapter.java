package com.oneofive.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MainPagerAdapter extends FragmentStatePagerAdapter {

    private Fragment[] fragments;

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];

//		switch(position){
//		case 0:
//			return new HomeFragment();
//		case 1:
//			return new ShareFragment();
//		case 2:
//			return new MyProfileFragment();
//		}
//		return null;

    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    public void setFragments(Fragment[] fragments) {
        this.fragments = fragments;
    }


}
