package com.geektech.month3_android1_homework4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainRecyclerAdapter extends RecyclerView.Adapter<MainRecyclerAdapter.ViewHolder> {

    private ArrayList<ItemModel> list;
    private OnClickItem clickItem;

    public MainRecyclerAdapter(ArrayList<ItemModel> list, OnClickItem clickItem) {
        this.list = list;
        this.clickItem = clickItem;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_recycler, parent, false);
        return new ViewHolder(view, clickItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView title;
        private final ImageView image;
        private OnClickItem onClickItem;

        public ViewHolder(@NonNull View itemView, OnClickItem onClickItem) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            image = itemView.findViewById(R.id.iv_dis);
            this.onClickItem = onClickItem;
        }

        public void onBind(ItemModel model) {
            itemView.setOnClickListener(v -> onClickItem.clickListener(model));
            image.setImageResource(model.getImage());
            title.setText(model.getTitle());
        }
    }

    interface OnClickItem {
        void clickListener(ItemModel itemModel);
    }
}


