package com.football.backend.model;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "List of Polish football federation regions")
public enum FootballFederationRegion {
    DOLNOSLASKIE("DOLNOŚLĄSKI ZPN"),
    KUJAWSKO_POMORSKI("KUJAWSKO-POMORSKI ZPN"),
    LUBELSKI("LUBELSKI ZPN"),
    LUBUSKI("LUBUSKI ZPN"),
    LODZKI("ŁÓDZKI ZPN"),
    MALOPOLSKI("MAŁOPOLSKI ZPN"),
    MAZOWIECKI("MAZOWIECKI ZPN"),
    OPOLSKI("OPOLSKI ZPN"),
    PODKARPACKI("PODKARPACKI ZPN"),
    PODLASKI("PODLASKI ZPN"),
    POMORSKI("POMORKSI ZPN"),
    SLASKI("ŚLĄSKI ZPN"),
    SWIETOKRZYSKI("ŚWIĘTOKRZYSKI ZPN"),
    WARMINSKO_MAZURSKI("WARMIŃSKO-MAZURSKI ZPN"),
    WIELKOPOLSKI("WIELKOPOLSKI ZPN"),
    ZACHODNIOPOMORSKI("ZACHODNIOPOMORSKI ZPN");

    private final String name;

    FootballFederationRegion(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }
}
