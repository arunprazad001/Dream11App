package com.masai.Dream11.service;

import com.masai.Dream11.entity.Player;
import com.masai.Dream11.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    public void deletePlayer(Long playerId) {
        playerRepository.deleteById(playerId);
    }

    public List<Player> findAllPlayers() {
        return playerRepository.findAll();
    }

    public List<Player> findPlayersByName(String name) {
        return playerRepository.findByName(name);
    }

    public List<Player> findPlayersByTeamName(String teamName) {
        return playerRepository.findByTeamName(teamName);
    }
}
