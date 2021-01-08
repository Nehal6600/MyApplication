package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;

import com.example.myapplication.Adapter.MyAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.zip.Inflater;

public class MainActivity2 extends AppCompatActivity {
    TabLayout daytab;
    ViewPager dayview;
    TextView order;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        daytab = findViewById(R.id.daytab);
        dayview= findViewById(R.id.dayView);
        order = findViewById(R.id.order);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });


        daytab.addTab(daytab.newTab().setText("Today"));
        daytab.addTab(daytab.newTab().setText("Weekly"));
        daytab.addTab(daytab.newTab().setText("Monthly"));
        daytab.setTabGravity(TabLayout.GRAVITY_FILL);
        daytab.setTabTextColors(getColor(R.color.purple_700),getColor(R.color.Red));
        daytab.setSelectedTabIndicatorColor(Color.parseColor("#FF151414"));

        final MyAdapter adapter = new MyAdapter(this,getSupportFragmentManager(),daytab.getTabCount());
        dayview.setAdapter(adapter);
        dayview.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(daytab));
        daytab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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