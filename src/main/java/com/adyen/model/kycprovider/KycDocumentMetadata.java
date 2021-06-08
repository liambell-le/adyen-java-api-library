package com.adyen.model.kycprovider;

import com.google.gson.annotations.SerializedName;

public class KycDocumentMetadata {

    public enum DocumentType {
        passport,
        driving_licence,
        id_card
    }

    @SerializedName("id")
    private String id;

    @SerializedName("type")
    private DocumentType type;

    @SerializedName("side")
    private String side;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DocumentType getType() {
        return type;
    }

    public void setType(DocumentType type) {
        this.type = type;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }
}
