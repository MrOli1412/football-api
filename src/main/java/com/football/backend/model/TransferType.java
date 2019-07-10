package com.football.backend.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description = "Types of transfer")

public enum TransferType {
    D("Definitywny"),
    C("Czasowy"),
    Z("Wolny zawodnik"),
    W("Wychowanek");

    private String type;

    TransferType(String type) {
        this.type=type;
    }

    public String getType() {
        return type;
    }
}
