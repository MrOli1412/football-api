package com.football.backend.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "team")
@ApiModel(description = "General information about team")
@Data
public class Team {

    @Id
    @GeneratedValue
    @NotBlank
    @ApiModelProperty(required = true,dataType = "Long",notes = "Team id")
    private Long id;

    @NotBlank
    @ApiModelProperty(required = true,dataType = "String",notes = "Team name like Juniors/Seniors")
    private String teamName;




}
