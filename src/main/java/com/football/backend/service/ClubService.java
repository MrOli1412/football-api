package com.football.backend.service;

import com.football.backend.model.Club;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ClubService {
    Club findClubById(Long id);
    List<Club> findAllClubs();
    void saveClub(Club club);
    void removeClub(Long id);
    Club editClub(Club club);

}
