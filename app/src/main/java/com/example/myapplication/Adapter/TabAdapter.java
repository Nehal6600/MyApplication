package com.example.myapplication.Adapter;

import android.content.Context;
import android.widget.Switch;
import android.widget.TableLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.myapplication.R;
import com.example.myapplication.calls;
import com.example.myapplication.chaat;
import com.example.myapplication.status;

public class TabAdapter extends FragmentPagerAdapter {
    private final static int[] TA_TITLE = new int[]{R.string.Chaat,R.string.Status,R.string.Calls};
    private Context mycontext;
    int totaltab;

    public TabAdapter(Context context, FragmentManager fm,int totaltab){
        super(fm);
         mycontext = context;
         this.totaltab = totaltab;
    }

    public CharSequence getPageTitle(int position){
        return mycontext.getResources().getString(TA_TITLE[position]);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch(position){
            case 0:
                chaat chaatFragment = new chaat();
                return chaatFragment;
            case 1:
                status statusFragment = new status();
                return statusFragment;
            case 2:
                calls callsFragment = new calls();
                return callsFragment;
            default:
                return null;


        }
    }

    @Override
    public int getCount() {
        return totaltab;
    }
}
