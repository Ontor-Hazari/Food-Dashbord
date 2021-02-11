package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    int[] w_foodicon;
    String[] w_fooditeam;


    public Adapter(Context context, int[] w_foodicon, String[] w_fooditeam) {
        this.context = context;
        this.w_foodicon = w_foodicon;
        this.w_fooditeam = w_fooditeam;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View VH = LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.wviewlayout,parent,false);

        return new Adapter.ViewHolder(VH);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        holder.imageView.setImageResource(w_foodicon[position]);
        holder.textView.setText(w_fooditeam[position]);

    }

    @Override
    public int getItemCount() {
        return w_fooditeam.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.w_image);
            textView = itemView.findViewById(R.id.w_name);

        }
    }
}
