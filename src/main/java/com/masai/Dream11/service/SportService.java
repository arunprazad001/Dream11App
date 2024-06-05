package com.masai.Dream11.service;

import com.masai.Dream11.entity.Sport;
import com.masai.Dream11.repository.SportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class SportService {
    @Autowired
    private SportRepository sportRepository;

    public Sport addSport(Sport sport) {
        return sportRepository.save(sport);
    }

    public List<Sport> findAllSports() {
        return sportRepository.findAll();
    }

    public List<Sport> findSportsByName(String name) {
        return sportRepository.findByName(name);
    }
}
