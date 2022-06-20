package com.example.fooddelivery.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fooddelivery.R;
import com.example.fooddelivery.databinding.FragmentFoodDetailsBinding;

public class FoodDetailsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentFoodDetailsBinding binding = FragmentFoodDetailsBinding.inflate(inflater,container,false);
        binding.txtFoodName.setText(requireArguments().getString("title"));
        binding.txtFoodPrice.setText("$"+requireArguments().getString("price"));
        binding.txtDescription.setText(requireArguments().getString("description"));
        binding.imgFoodDetails.setImageResource(requireArguments().getInt("img"));
        binding.btnPlus.setOnClickListener(view -> {
            int num = Integer.parseInt(binding.txtNum.getText().toString());
            int newNum = (num+1);
            String n = String.valueOf(newNum);
            binding.txtNum.setText(n);
        });
        binding.btnMin.setOnClickListener(view -> {
            int num = Integer.parseInt(binding.txtNum.getText().toString());
            if (num != 1){
                int newNum = (num-1);
                String n = String.valueOf(newNum);
                binding.txtNum.setText(n);
            }
        });
        return binding.getRoot();
    }
}