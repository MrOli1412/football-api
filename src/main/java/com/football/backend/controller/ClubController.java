package com.football.backend.controller;

import com.football.backend.model.Club;
import com.football.backend.service.ClubService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "Club Management System")
@RestController
public class ClubController {
    private final ClubService clubService;

    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

    @ApiOperation(value = "List of all clubs", response = Club.class)
    @GetMapping("/clubs")
    public ResponseEntity<List<Club>> allClubs() {

        try{
            return new ResponseEntity<>(clubService.findAllClubs(), HttpStatus.OK);
        }catch (NullPointerException e){
            return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
        }

    }




}
