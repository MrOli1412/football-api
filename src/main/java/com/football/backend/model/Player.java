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
import java.time.LocalDate;

@ApiModel(description = "All information about player")
@Entity
@Table(name = "player")
@Data
public class Player extends Person {

    @Id
    @GeneratedValue
    @ApiModelProperty(required = true, dataType = "Long", notes = "Player id")
    @NotBlank
    private Long id;

    @NotBlank
    @ApiModelProperty(required = true, dataType = "Long", notes = "Player evidential number", example = "0001254773")
    private Long evidentialNumber;

    @NotBlank
    @ApiModelProperty(required = true, dataType = "LocalDate", notes = "Date of birth", example = "2002-04-25")
    private LocalDate birthDate;

    @NotBlank
    @ApiModelProperty(required = true, dataType = "LocalDate", notes = "Date of player permission ", example = "2018-03-20")
    private LocalDate permissionDate;

    @NotBlank
    @ApiModelProperty(required = true, dataType = "String", notes = "Contract time, it's could by a date or A like Amator", example = "2018-03-20")
    private String contractTime;

    @ApiModelProperty(required = true, dataType = "String", notes = "Player last club", example = "LKS Pawłów")
    private String lastClub;

    @NotNull
    @ApiModelProperty(required = true, dataType = "TransferType", notes = "Transfer type")
    private TransferType transferType;


}
