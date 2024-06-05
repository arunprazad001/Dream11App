package com.masai.Dream11.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long playerId;

    private String name;
    private String skill;
    private double price;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;


}
