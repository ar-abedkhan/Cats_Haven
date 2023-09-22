package com.abedkhan.catsshaven.Viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abedkhan.catsshaven.R;

public class CetagoryViewholder extends RecyclerView.ViewHolder {

    public TextView name;
    public ImageView img;

    public CetagoryViewholder(@NonNull View itemView) {
        super(itemView);


        name=itemView.findViewById(R.id.cetegoryName);
        img=itemView.findViewById(R.id.categeryImg);



    }
}
