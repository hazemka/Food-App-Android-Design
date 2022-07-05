package com.example.fooddelivery.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddelivery.databinding.CartItemBinding;
import com.example.fooddelivery.model.Category;
import com.example.fooddelivery.model.Food;

import java.util.ArrayList;


public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {

    public Context context;
    public ArrayList<Food> data;

    public CartAdapter(Context context, ArrayList<Food> data){
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CartItemBinding binding = CartItemBinding.inflate(LayoutInflater.from(context),parent,false);
        return new CartViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
        holder.binding.txtTitleCart.setText(data.get(position).getTitle());
        holder.binding.picCart.setImageResource(data.get(position).getPic());
        holder.binding.feeEachItem.setText(String.valueOf(data.get(position).getFee()));
        holder.binding.totalEachItem.setText(String.valueOf(data.get(position).getFee()));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class CartViewHolder extends RecyclerView.ViewHolder{
        public CartItemBinding binding;
        public CartViewHolder(CartItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
