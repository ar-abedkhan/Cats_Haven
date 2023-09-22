package com.abedkhan.catsshaven.Viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abedkhan.catsshaven.R;

public class TodoViewHolder extends RecyclerView.ViewHolder {

    public TextView title,time,done;
    public ImageView todoImg,pHigh;

    public TodoViewHolder(@NonNull View itemView) {
        super(itemView);

        title=itemView.findViewById(R.id.todayTitle);
        time=itemView.findViewById(R.id.toDoTime);
        todoImg=itemView.findViewById(R.id.todoImage);
        done=itemView.findViewById(R.id.statusDone);
    //    undone=itemView.findViewById(R.id.statusUnDone);
        pHigh=itemView.findViewById(R.id.highPriority);
     //   pMedium=itemView.findViewById(R.id.mediumPriority);
      //  pLow=itemView.findViewById(R.id.lowPriority);

    }
}
