package com.football.backend.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "club")
@ApiModel(description = "General information about football club")
@Data
public class Club {

    @Id
    @GeneratedValue
    @ApiModelProperty(required = true,dataType ="Long",notes = "Club id")
    @NotNull
    private Long id;


    @ApiModelProperty(required = true,dataType ="FootballFederationRegion", notes = "Football federation region")
    @NotNull
    private FootballFederationRegion region;

    @ApiModelProperty(required = true,dataType = "String", notes="Football club sub region")
    @NotBlank
    private String subRegion;

    @ApiModelProperty(required = true,dataType = "String", notes = "Club name")
    @NotBlank
    private String clubName;







}
