package com.masai.Dream11.controller;
import com.masai.Dream11.entity.Team;
import com.masai.Dream11.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {
    @Autowired
    private TeamService teamService;

    @PostMapping("/add")
    public Team addTeam(@RequestBody Team team) {
        return teamService.addTeam(team);
    }

    @DeleteMapping("/{id}")
    public void deleteTeam(@PathVariable Long id) {
        teamService.deleteTeam(id);
    }

    @GetMapping("/findAll")
    public List<Team> findAllTeams() {
        return teamService.findAllTeams();
    }

    @GetMapping("/name/{name}")
    public List<Team> findTeamsByName(@PathVariable String name) {
        return teamService.findTeamsByName(name);
    }
}
