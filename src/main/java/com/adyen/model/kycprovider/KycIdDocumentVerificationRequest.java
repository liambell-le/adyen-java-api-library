package com.adyen.model.kycprovider;

import com.google.gson.annotations.SerializedName;

public class KycIdDocumentVerificationRequest {

    @SerializedName("documentFront")
    private KycDocumentMetadata documentFront;

    @SerializedName("documentBack")
    private KycDocumentMetadata documentBack;

    @SerializedName("legalEntityReference")
    private String legalEntityReference;

    public KycDocumentMetadata getDocumentFront() {
        return documentFront;
    }

    public void setDocumentFront(KycDocumentMetadata documentFront) {
        this.documentFront = documentFront;
    }

    public KycDocumentMetadata getDocumentBack() {
        return documentBack;
    }

    public void setDocumentBack(KycDocumentMetadata documentBack) {
        this.documentBack = documentBack;
    }

    public String getLegalEntityReference() {
        return legalEntityReference;
    }

    public void setLegalEntityReference(String legalEntityReference) {
        this.legalEntityReference = legalEntityReference;
    }
}
