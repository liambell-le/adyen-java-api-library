package com.adyen.model.legalentity;

import com.google.gson.annotations.SerializedName;

public class LegalEntityInfo {

    @SerializedName("type")
    private String type;

    @SerializedName("individual")
    private Individual individual;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Individual getIndividual() {
        return individual;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }
}
