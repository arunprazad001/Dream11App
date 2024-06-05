package com.masai.Dream11.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Entity
@Getter
@Setter
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamId;

    private String name;
    private String country;
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Player> players = new HashSet<>();
    @ManyToMany
    @JoinTable(
            name = "team_sport",
            joinColumns = @JoinColumn(name = "team_id"),
            inverseJoinColumns = @JoinColumn(name = "sport_id")
    )
    private Set<Sport> sports = new HashSet<>();
}
