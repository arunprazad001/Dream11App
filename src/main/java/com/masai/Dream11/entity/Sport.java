package com.masai.Dream11.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Entity
@Getter
@Setter
public class Sport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sportId;

    private String name;

    @ManyToMany(mappedBy = "sports")
    private Set<Team> teams = new HashSet<>();
}
