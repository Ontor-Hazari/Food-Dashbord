package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    Context context;

    int[] foodicon;
    String[] fooditeam;

    public MyAdapter(Context context,int[] foodicon, String[] fooditeam) {
        this.context = context;
        this.fooditeam = fooditeam;
        this.foodicon = foodicon;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vh = LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.viewlayout,parent,false);

        return new ViewHolder(vh);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(foodicon[position]);
        holder.textView.setText(fooditeam[position]);

    }

    @Override
    public int getItemCount() {
        return fooditeam.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView ;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.name);


        }
    }


}
