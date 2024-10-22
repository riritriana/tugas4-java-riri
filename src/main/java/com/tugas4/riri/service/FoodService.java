package com.tugas4.riri.service;

import com.tugas4.riri.models.Food;
import org.springframework.stereotype.Service;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoodService {
    // public List<Food> getAllFoods(){
    //     List<Food> food = new ArrayList<>();
    //     food.add(new Food(1, "Chicken steak", 23000L, "sedang"));
    //     return food;
    
    // }
    public List<Food> getAllFoods() {
        return Arrays.asList(
            new Food(1, "Chicken steak", 23000L, "sedang"),
            new Food(2, "Kentang goreng", 19000L, "besar"),
            new Food(3, "Ayam geprek", 25000L, "kecil"),
            new Food(4, "Nasi goreng", 24000L, "sedang")
        );
    }
}
