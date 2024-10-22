package com.tugas4.riri.service;

import com.tugas4.riri.models.Chef;
import com.tugas4.riri.models.ChefRestaurant;
import com.tugas4.riri.models.Food;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChefRestaurantService {

    public List<ChefRestaurant> getChefRestaurantList() {
        List<ChefRestaurant> chefRestaurants = new ArrayList<>();


        Food food1 = new Food(1, "Chicken steak", 23000L, "sedang");
        Food food2 = new Food(2, "Kentang Goreng", 19000L, "besar");
        Food food3 = new Food(3, "Ayam geprek", 25000L, "kecil");
        Food food4 = new Food(4, "Nasi Goreng", 24000L, "sedang");

        Chef chef1 = new Chef(1, "Hilwa", "Semarang");
        Chef chef2 = new Chef(2, "Riri", "Banjar");
        Chef chef3 = new Chef(3, "Tisa", "Banjar");
        Chef chef4 = new Chef(4, "Siti cupit", "KBB");

     
        chefRestaurants.add(new ChefRestaurant(food1, chef1));
        chefRestaurants.add(new ChefRestaurant(food2, chef2));
        chefRestaurants.add(new ChefRestaurant(food3, chef3));
        chefRestaurants.add(new ChefRestaurant(food4, chef4));

        return chefRestaurants;
    }
}
