package com.football.backend.controller;

import com.football.backend.model.Club;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(value = "Club Management System")
@RestController
public class ClubController {

    @ApiOperation(value = "List of all clubs",response = Club.class)
    @GetMapping("/clubs")
    public List allClubs(){
        return new ArrayList<Club>();
    }
}
