package com.adyen.model.legalentity;

import com.google.gson.annotations.SerializedName;

public class LegalEntityResponse {

    @SerializedName("id")
    private String id;

    @SerializedName("type")
    private String type;

    @SerializedName("individual")
    private Individual individual;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
