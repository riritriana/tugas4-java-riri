package com.tugas4.riri.controllers;


import com.tugas4.riri.models.Chef;
import com.tugas4.riri.service.ChefService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ChefController {
    private final ChefService chefService;

    public ChefController(ChefService chefService) {
        this.chefService = chefService;
    }

    @GetMapping("/list-chef")
    public String listChef(Model model) {
        List<Chef> chefs = chefService.getAllChefs();
        model.addAttribute("chefs", chefs);
        return "chef";  
    }
}
