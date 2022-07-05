package com.example.fooddelivery.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fooddelivery.R;
import com.example.fooddelivery.adapter.CartAdapter;
import com.example.fooddelivery.databinding.FragmentCartBinding;
import com.example.fooddelivery.model.Food;

import java.util.ArrayList;

public class CartFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentCartBinding binding = FragmentCartBinding.inflate(inflater,container,false);

        ArrayList<Food> arrayFood = new ArrayList<>();
        arrayFood.add(new Food("Pepperoni pizza",R.drawable.pop_1,"slices pepperoni,mozzerella cheese, fresh oregano, ground black pepper, pizza sauce",9.76,100));
        arrayFood.add(new Food("Cheese Burger",R.drawable.pop_2,"beef, Gouda Cheese, Special Sauce, Lettuce, tomato",8.79,100));
        arrayFood.add(new Food("Vegetable pizza",R.drawable.pop_3,"olive oil, Vegetable oil, pitted kalamata, cherry tomatoes, fresh oregano, basil",10.55,100));

        CartAdapter adapter = new CartAdapter(requireContext(),arrayFood);

        binding.rvItemsInCart.setLayoutManager(new LinearLayoutManager((requireContext())));
        binding.rvItemsInCart.setAdapter(adapter);

        return binding.getRoot();
    }

}