package com.masai.Dream11.controller;

import com.masai.Dream11.entity.Sport;
import com.masai.Dream11.service.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sports")
public class SportController {
    @Autowired
    private SportService sportService;

    @PostMapping("/add")
    public Sport addSport(@RequestBody Sport sport) {
        return sportService.addSport(sport);
    }

    @GetMapping("/findAll")
    public List<Sport> findAllSports() {
        return sportService.findAllSports();
    }

    @GetMapping("/name/{name}")
    public List<Sport> findSportsByName(@PathVariable String name) {
        return sportService.findSportsByName(name);
    }
}
