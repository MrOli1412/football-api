package com.football.backend.service.impl;

import com.football.backend.model.Club;
import com.football.backend.repository.ClubRepository;
import com.football.backend.service.ClubService;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClubServiceImpl implements ClubService {

    private ClubRepository clubRepository;

    @Autowired
    ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public Club findClubById(Long id) {
        return clubRepository.findById(id).orElse(null);
    }

    @Override
    public List<Club> findAllClubs() {
        return clubRepository.findAll();
    }

    @Override
    public void saveClub(Club club) {
        clubRepository.save(club);
    }

    @Override
    public void removeClub(Long id) {
        clubRepository.deleteById(id);
    }

    @Override
    public Club editClub(Club club) {

        return clubRepository.save(club);
    }
}
