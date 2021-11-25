package com.geektech.month3_android1_homework4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SecondActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SecondRecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        recyclerView = findViewById(R.id.rv_flags);
        ItemModel itemModel = (ItemModel) getIntent().getSerializableExtra("item_model");
        recyclerAdapter = new SecondRecyclerAdapter(itemModel.getFlags());
        recyclerView.setAdapter(recyclerAdapter);

    }
}