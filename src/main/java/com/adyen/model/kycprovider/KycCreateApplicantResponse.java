package com.adyen.model.kycprovider;

import com.google.gson.annotations.SerializedName;

public class KycCreateApplicantResponse {

    @SerializedName("applicantId")
    private String applicantId;

    @SerializedName("sdkToken")
    private String sdkToken;

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public String getSdkToken() {
        return sdkToken;
    }

    public void setSdkToken(String sdkToken) {
        this.sdkToken = sdkToken;
    }
}
