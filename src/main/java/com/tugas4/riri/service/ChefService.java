package com.tugas4.riri.service;

import com.tugas4.riri.models.Chef;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ChefService {
    public List<Chef> getAllChefs() {
        return Arrays.asList(
            new Chef(1, "Hilwa", "Semarang"),
            new Chef(2, "Riri", "Banjar"),
            new Chef(3, "Tisa", "Banjar"),
            new Chef(4, "Siti", "KBB")
        );
    }
}