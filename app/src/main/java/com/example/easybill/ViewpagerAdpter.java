package com.example.easybill;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class ViewpagerAdpter extends FragmentStatePagerAdapter {
    private  final List<Fragment> fragmentList;
    public ViewpagerAdpter(@NonNull FragmentManager fm, List<Fragment> fragmentList) {

        super(fm);
        this.fragmentList=fragmentList;
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }
}
