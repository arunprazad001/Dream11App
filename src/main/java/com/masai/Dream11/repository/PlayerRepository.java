package com.masai.Dream11.repository;

import com.masai.Dream11.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    List<Player> findByName(String name);
    List<Player> findByTeamName(String teamName);
}
