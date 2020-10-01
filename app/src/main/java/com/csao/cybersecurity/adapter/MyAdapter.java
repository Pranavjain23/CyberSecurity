package com.csao.cybersecurity.adapter;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.csao.cybersecurity.R;
import com.csao.cybersecurity.fragment.DoFragment;
import com.csao.cybersecurity.fragment.DontFragment;

public class MyAdapter extends FragmentPagerAdapter {

    private static final int[] TAB_TITLES =
            new int[] {R.string.do_string , R.string.dont_string};
    private final Context mContext;
    public MyAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                DoFragment do_object = new DoFragment();
                return do_object;
            case 1:
                DontFragment dont_obj = new DontFragment();
                return dont_obj;

            default:
                return null;
        }
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }
    @Override
    public int getCount() {
        return 2;
    }
}