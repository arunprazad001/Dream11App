package com.masai.Dream11.service;

import com.masai.Dream11.entity.Team;
import com.masai.Dream11.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    public Team addTeam(Team team) {
        return teamRepository.save(team);
    }

    public void deleteTeam(Long teamId) {
        teamRepository.deleteById(teamId);
    }

    public List<Team> findAllTeams() {
        return teamRepository.findAll();
    }

    public List<Team> findTeamsByName(String name) {
        return teamRepository.findByName(name);
    }
}
