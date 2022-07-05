package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.fooddelivery.adapter.CategoryAdapter;
import com.example.fooddelivery.adapter.FoodAdapter;
import com.example.fooddelivery.databinding.ActivityMainBinding;
import com.example.fooddelivery.model.Category;
import com.example.fooddelivery.model.Food;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bottomNavView.setBackground(null);
        ArrayList<Category> arrayList = new ArrayList();
        arrayList.add(new Category("Pizza",R.drawable.cat_1));
        arrayList.add(new Category("Burger",R.drawable.cat_2));
        arrayList.add(new Category("Hotdog",R.drawable.cat_3));
        arrayList.add(new Category("Drink",R.drawable.cat_4));
        arrayList.add(new Category("Donut",R.drawable.cat_5));
        CategoryAdapter adapter = new CategoryAdapter(this,arrayList);
        binding.rvCategories.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        binding.rvCategories.setAdapter(adapter);

        ArrayList<Food> arrayFood = new ArrayList<>();
        arrayFood.add(new Food("Pepperoni pizza",R.drawable.pop_1,"slices pepperoni,mozzerella cheese, fresh oregano, ground black pepper, pizza sauce",9.76,100));
        arrayFood.add(new Food("Cheese Burger",R.drawable.pop_2,"beef, Gouda Cheese, Special Sauce, Lettuce, tomato",8.79,100));
        arrayFood.add(new Food("Vegetable pizza",R.drawable.pop_3,"olive oil, Vegetable oil, pitted kalamata, cherry tomatoes, fresh oregano, basil",10.55,100));
        FoodAdapter foodAdapter = new FoodAdapter(this,arrayFood);
        binding.rvPopular.setAdapter(foodAdapter);
        binding.rvPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }

    public void swipeFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.silde_in
                ,R.anim.fade_out,R.anim.fade_in,R.anim.slide_out)
                .replace(R.id.main_Container,fragment)
                .addToBackStack(null)
                .commit();
    }
}