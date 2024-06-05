package com.masai.Dream11.controller;

import com.masai.Dream11.entity.Player;
import com.masai.Dream11.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @PostMapping("/add")
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @DeleteMapping("delete/{id}")
    public void deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
    }

    @GetMapping("/findAll")
    public List<Player> findAllPlayers() {
        return playerService.findAllPlayers();
    }

    @GetMapping("/name/{name}")
    public List<Player> findPlayersByName(@PathVariable String name) {
        return playerService.findPlayersByName(name);
    }

    @GetMapping("/team/{teamName}")
    public List<Player> findPlayersByTeamName(@PathVariable String teamName) {
        return playerService.findPlayersByTeamName(teamName);
    }
}
