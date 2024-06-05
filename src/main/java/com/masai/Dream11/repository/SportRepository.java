package com.masai.Dream11.repository;

import com.masai.Dream11.entity.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface SportRepository extends JpaRepository<Sport, Long> {
    List<Sport> findByName(String name);
}
