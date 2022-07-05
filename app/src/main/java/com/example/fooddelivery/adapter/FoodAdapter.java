package com.example.fooddelivery.adapter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddelivery.MainActivity;
import com.example.fooddelivery.databinding.FoodItemBinding;
import com.example.fooddelivery.fragments.FoodDetailsFragment;
import com.example.fooddelivery.model.Food;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    public Activity activity;
    public ArrayList<Food> data;

    public FoodAdapter(Activity activity,ArrayList<Food> data){
        this.activity = activity;
        this.data = data;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        FoodItemBinding binding = FoodItemBinding.inflate(LayoutInflater.from(activity),parent,false);
        return new FoodViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        holder.binding.txtTitle.setText(data.get(position).getTitle());
        holder.binding.imgFood.setImageResource(data.get(position).getPic());
        holder.binding.fee.setText(data.get(position).getFee().toString());
        holder.binding.btnAdd.setOnClickListener(view -> {
            FoodDetailsFragment fragment =new FoodDetailsFragment();
            Bundle bundle = new Bundle();
            bundle.putString("title",data.get(position).getTitle());
            bundle.putString("price",data.get(position).getFee().toString());
            bundle.putString("description",data.get(position).getDescription());
            fragment.setArguments(bundle);
            ((MainActivity) activity).swipeFragment(fragment);
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class FoodViewHolder extends RecyclerView.ViewHolder{
        FoodItemBinding binding;
        public FoodViewHolder(FoodItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
