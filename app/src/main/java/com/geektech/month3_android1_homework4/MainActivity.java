package com.geektech.month3_android1_homework4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        ArrayList<ItemModel> list = new ArrayList<>();
        for (int i = 0; i <1; i++) {
            list.add(new ItemModel("Азия", R.drawable.asia));
            list.add(new ItemModel("Африка", R.drawable.asia));
            list.add(new ItemModel("Северная Америка", R.drawable.asia));
            list.add(new ItemModel("Южная Америка", R.drawable.asia));
            list.add(new ItemModel("Антарктида", R.drawable.asia));
            list.add(new ItemModel("Европа", R.drawable.asia));
            list.add(new ItemModel("Австралия", R.drawable.asia));
        }
        recyclerAdapter = new RecyclerAdapter(list, this);
        recyclerView.setAdapter(recyclerAdapter);
    }
}