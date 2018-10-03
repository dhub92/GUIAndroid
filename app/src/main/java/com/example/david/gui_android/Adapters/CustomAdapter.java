package com.example.david.gui_android.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.david.gui_android.Models.DataModel;
import com.example.david.gui_android.R;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>{

    private Context context;
    private List<DataModel> list;

    public CustomAdapter(Context context, List<DataModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        DataModel dataModel = list.get(position);
        holder.name.setText(dataModel.getName());
        holder.description.setText(dataModel.getDescription());
        holder.value.setText(dataModel.getValue());
        holder.image.setImageDrawable(context.getDrawable(dataModel.getImage()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name,description,value;
        ImageView image;

        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            description = itemView.findViewById(R.id.description);
            value = itemView.findViewById(R.id.value);
            image = itemView.findViewById(R.id.image);
        }

    }
}
