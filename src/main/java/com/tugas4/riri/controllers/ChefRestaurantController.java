package com.tugas4.riri.controllers;

import com.tugas4.riri.models.ChefRestaurant;
import com.tugas4.riri.service.ChefRestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ChefRestaurantController {

    @Autowired
    private ChefRestaurantService chefRestaurantService;

    @GetMapping("/chef-restaurant")
    public String getChefRestaurant(Model model) {
        List<ChefRestaurant> chefRestaurantList = chefRestaurantService.getChefRestaurantList();
        model.addAttribute("chefRestaurants", chefRestaurantList);
        return "chef-restaurant";
    }
}
