package com.masai.Dream11.repository;

import com.masai.Dream11.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
    List<Team> findByName(String name);
}
