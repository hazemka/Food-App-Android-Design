package com.example.fooddelivery.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fooddelivery.R;
import com.example.fooddelivery.databinding.FragmentCartBinding;

public class CartFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentCartBinding binding = FragmentCartBinding.inflate(inflater,container,false);

        return binding.getRoot();
    }

}