package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.Adapter.CategorylistAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView catrecyclerView;
    CategorylistAdapter categorylistAdapter;
    TextView next;

    private List categorylists = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        catrecyclerView = findViewById(R.id.offers_recyclerview);
        categorylistAdapter = new CategorylistAdapter(categorylists);
        RecyclerView.LayoutManager mlayoutmanger = new GridLayoutManager(this,3);
        catrecyclerView.setLayoutManager(mlayoutmanger);
        catrecyclerView.setAdapter(categorylistAdapter);




            }
}