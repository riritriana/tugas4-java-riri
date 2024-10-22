package com.tugas4.riri.controllers;

import com.tugas4.riri.models.Food;
import com.tugas4.riri.service.FoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FoodController {
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/list-food")
    public String listFood(Model model) {
        List<Food> foods = foodService.getAllFoods();
        model.addAttribute("foods", foods);
        return "food";  
    }

}
