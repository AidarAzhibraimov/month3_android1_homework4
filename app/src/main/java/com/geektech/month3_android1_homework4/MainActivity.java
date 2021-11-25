package com.geektech.month3_android1_homework4;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements MainRecyclerAdapter.OnClickItem {
    private RecyclerView recyclerView;
    private MainRecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        ArrayList<ItemModel> list = new ArrayList<>();
        list.add(new ItemModel("Азия", R.drawable.asia, Arrays.asList(
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%90%D0%B7%D0%B5%D1%80%D0%B1%D0%B0%D0%B9%D0%B4%D0%B6%D0%B0%D0%BD.png",
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%9A%D0%B8%D1%80%D0%B3%D0%B8%D0%B7%D0%B8%D1%8F.png",
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%9A%D0%B0%D0%BC%D0%B1%D0%BE%D0%B4%D0%B6%D0%B0.png",
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%9A%D0%B0%D0%B7%D0%B0%D1%85%D1%81%D1%82%D0%B0%D0%BD.png",
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%9A%D0%B8%D1%82%D0%B0%D0%B9.png"

        )));

        list.add(new ItemModel("Африка", R.drawable.ic_afrika, Arrays.asList(
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%90%D0%BB%D0%B6%D0%B8%D1%80.png",
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%90%D0%BD%D0%B3%D0%BE%D0%BB%D0%B0.png",
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%94%D0%B5%D0%BC%D0%BE%D0%BA%D1%80%D0%B0%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B0%D1%8F-%D0%A0%D0%B5%D1%81%D0%BF%D1%83%D0%B1%D0%BB%D0%B8%D0%BA%D0%B0-%D0%9A%D0%BE%D0%BD%D0%B3%D0%BE.png",
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%95%D0%B3%D0%B8%D0%BF%D0%B5%D1%82.png",
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%9C%D0%B0%D0%B4%D0%B0%D0%B3%D0%B0%D1%81%D0%BA%D0%B0%D1%80.png")));

        list.add(new ItemModel("Северная Америка", R.drawable.ic_sever_amerika, Arrays.asList(
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%94%D0%BE%D0%BC%D0%B8%D0%BD%D0%B8%D0%BA%D0%B0.png",
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%9F%D0%B0%D0%BD%D0%B0%D0%BC%D0%B0.png",
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%AF%D0%BC%D0%B0%D0%B9%D0%BA%D0%B0.png",
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%9C%D0%B5%D0%BA%D1%81%D0%B8%D0%BA%D0%B0.png",
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%9A%D0%B0%D0%BD%D0%B0%D0%B4%D0%B0.png")));

        list.add(new ItemModel("Южная Америка", R.drawable.ic_ug_america, Arrays.asList(
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%91%D1%80%D0%B0%D0%B7%D0%B8%D0%BB%D0%B8%D1%8F.png",
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%90%D1%80%D0%B3%D0%B5%D0%BD%D1%82%D0%B8%D0%BD%D0%B0.png",
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%A7%D0%B8%D0%BB%D0%B8.png",
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%AD%D0%BA%D0%B2%D0%B0%D0%B4%D0%BE%D1%80.png",
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%91%D0%BE%D0%BB%D0%B8%D0%B2%D0%B8%D1%8F.png")));

        list.add(new ItemModel("Антарктида", R.drawable.ic_antarctide, Arrays.asList(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/True_South_Antarctic_Flag.svg/440px-True_South_Antarctic_Flag.svg.png")));

        list.add(new ItemModel("Европа", R.drawable.ic_europe, Arrays.asList(
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%91%D0%B5%D0%BB%D0%B0%D1%80%D1%83%D1%81%D1%8C.png",
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%93%D0%B5%D1%80%D0%BC%D0%B0%D0%BD%D0%B8%D1%8F.png",
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%98%D1%82%D0%B0%D0%BB%D0%B8%D1%8F.png",
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%98%D1%81%D0%BF%D0%B0%D0%BD%D0%B8%D1%8F.png",
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%A4%D1%80%D0%B0%D0%BD%D1%86%D0%B8%D1%8F.png" )));

        list.add(new ItemModel("Австралия", R.drawable.ic_australiya, Arrays.asList(
                "http://merkator.org.ua/wp-content/uploads/2017/12/%D0%90%D0%B2%D1%81%D1%82%D1%80%D0%B0%D0%BB%D0%B8%D1%8F.png")));
        recyclerAdapter = new MainRecyclerAdapter(list, this);
        recyclerView.setAdapter(recyclerAdapter);
    }

    @Override
    public void clickListener(ItemModel itemModel) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("item_model",itemModel);
        startActivity(intent);
    }
}