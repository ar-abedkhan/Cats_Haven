package com.abedkhan.catsshaven.Viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abedkhan.catsshaven.R;

public class SubjectViewholder extends RecyclerView.ViewHolder {
    public TextView name,description;
    public ImageView image;


    public SubjectViewholder(@NonNull View itemView) {
        super(itemView);

        name=itemView.findViewById(R.id.subjectName);
        description=itemView.findViewById(R.id.subjectDes);
        image=itemView.findViewById(R.id.subjectImg);
    }
}
