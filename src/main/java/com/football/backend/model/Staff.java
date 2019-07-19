package com.football.backend.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@ApiModel(description = "Information about team staff ")
@Entity
@Table(name = "staff")
@Data
@EqualsAndHashCode(callSuper = false)
public class Staff extends Person {

    @Id
    @GeneratedValue
    @NotBlank
    @ApiModelProperty(required = true,dataType = "Long",notes = "Staff id")
    private Long id;


    @ApiModelProperty(required = false,dataType = "String",notes = "License number",example = "UEFA A 000123")
    private String licenseNumber;

}
