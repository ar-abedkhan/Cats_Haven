package com.abedkhan.catsshaven.Viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abedkhan.catsshaven.R;

public class CatViewholder extends RecyclerView.ViewHolder {
    public TextView name;
    public ImageView img;


    public CatViewholder(@NonNull View itemView) {
        super(itemView);

        name=itemView.findViewById(R.id.catName);
        img=itemView.findViewById(R.id.catimg);

    }
}
