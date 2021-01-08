package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TableLayout;
import android.widget.TextView;

import com.example.myapplication.Adapter.TabAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity3 extends AppCompatActivity {

    private ProgressBar progressBar;
    private TextView progresstextr;
    int i=0;

    ViewPager viewPager;
    TabLayout tabview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        progressBar = findViewById(R.id.progree_bar);
        progresstextr = findViewById(R.id.text_progress);

        final Handler handler =new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(i<=100){
                    progresstextr.setText(""+i);
                    progressBar.setProgress(i);
                    i++;
                    handler.postDelayed(this,200);
                }else {
                    handler.removeCallbacks(this);
                }
            }
        },200);




        viewPager = findViewById(R.id.viewpage);
        tabview = findViewById(R.id.tabview);
        tabview.addTab(tabview.newTab().setText("Chaat"));
        tabview.addTab(tabview.newTab().setText("Status"));
        tabview.addTab(tabview.newTab().setText("Calls"));
        tabview.setTabTextColors(getColor(R.color.black),getColor(R.color.Red));

        tabview.setSelectedTabIndicatorColor(getColor(R.color.black));

        final TabAdapter adapter = new TabAdapter(this, getSupportFragmentManager(),tabview.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabview));
        tabview.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });




    }
}