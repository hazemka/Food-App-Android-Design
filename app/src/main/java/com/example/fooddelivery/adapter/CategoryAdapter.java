package com.example.fooddelivery.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.fooddelivery.databinding.CategoryBinding;
import com.example.fooddelivery.model.Category;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>{
    public Context context;
    public ArrayList<Category> data;

    public CategoryAdapter(Context context, ArrayList<Category> data){
        this.context = context;
        this.data = data;
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder{
        public CategoryBinding binding;
        public CategoryViewHolder(CategoryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CategoryBinding binding = CategoryBinding.inflate(LayoutInflater.from(context),parent,false);
        return new CategoryViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        if (position %6 == 0){
            holder.binding.getRoot().setCardBackgroundColor(Color.rgb(254,244,229));
        }else if(position %6 == 1 ){
            holder.binding.getRoot().setCardBackgroundColor(Color.rgb(245, 229, 254));
        }else if(position %6 == 2){
            holder.binding.getRoot().setCardBackgroundColor(Color.rgb(229, 241, 254));
        }else if (position %6 == 3){
            holder.binding.getRoot().setCardBackgroundColor(Color.rgb(235, 254, 229));
        }else if (position %6 == 4){
            holder.binding.getRoot().setCardBackgroundColor(Color.rgb(249, 228, 228));
        }
        holder.binding.nameCat.setText(data.get(position).getTitle());
        holder.binding.img.setImageResource(data.get(position).getPic());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
