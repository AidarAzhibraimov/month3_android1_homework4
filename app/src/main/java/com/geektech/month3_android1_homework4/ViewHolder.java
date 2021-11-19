package com.geektech.month3_android1_homework4;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ViewHolder  extends RecyclerView.ViewHolder {
    private TextView title;
    private ImageView image;
    private Context context;
    public ViewHolder(@NonNull View itemView, Context context) {
        super(itemView);
        this.context = context;
        image = itemView.findViewById(R.id.image);
        title = itemView.findViewById(R.id.title);
    }

    public void onBind(ItemModel model){
        image.setImageResource(model.getImage());
        this.title.setText(model.getTitle());
    }
}
