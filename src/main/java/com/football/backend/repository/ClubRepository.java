package com.football.backend.repository;

import com.football.backend.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClubRepository extends JpaRepository<Club,Long > {
    Optional<Club> findById(Long id);
}
