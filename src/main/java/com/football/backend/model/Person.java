package com.football.backend.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel(description = "General data about all person in team")
public  abstract class Person {

    @NotBlank
    @ApiModelProperty(required = true,dataType = "String",notes = "First name")
    protected String firstName;

    @NotBlank
    @ApiModelProperty(required = true,dataType = "String",notes = "Last name")
    protected String lastName;
}
