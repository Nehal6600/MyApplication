package com.example.myapplication.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.myapplication.MonthlyFragment;
import com.example.myapplication.R;
import com.example.myapplication.TodayFragment;
import com.example.myapplication.WeeklyFragment;

public class MyAdapter extends FragmentPagerAdapter {
    private static final int[] Tab_Title = new int[]{R.string.Today,R.string.Weekly,R.string.Month};
    private Context myContext;
    int  totalTab;


    public MyAdapter(Context context, FragmentManager fm,int totalTab){
        super(fm);
        myContext = context;
        this.totalTab = totalTab;


    }
    public CharSequence getPageTitle(int position){
        return myContext.getResources().getString(Tab_Title[position]);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                TodayFragment todayFragment = new TodayFragment();
                return todayFragment;
            case 1:
                WeeklyFragment weeklyFragment = new WeeklyFragment();
                return weeklyFragment;
            case 2:
                MonthlyFragment monthlyragment = new MonthlyFragment();
                return monthlyragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTab;
    }
}
