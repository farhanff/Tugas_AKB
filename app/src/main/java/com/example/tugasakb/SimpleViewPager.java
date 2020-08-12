package com.example.tugasakb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.tugasakb.fragment.FirstFragment;
import com.example.tugasakb.fragment.SecondFragment;
//07 Agustus 2020 Farhan Firman Firdaus
public class SimpleViewPager extends FragmentStatePagerAdapter {

    public SimpleViewPager(FragmentManager fm){
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new FirstFragment();
            case 1 : return new SecondFragment();
            default: return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0 : return "Profile";
            case 1 : return "Wisata";
            default : return "no";
        }
    }
}
