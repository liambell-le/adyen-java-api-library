package com.adyen.model.kycprovider;

import com.google.gson.annotations.SerializedName;

public class KycIdNumberVerificationResponse {
    @SerializedName("verifiedIdNumber")
    private String verifiedIdNumber;
    public String getVerifiedIdNumber() {
        return verifiedIdNumber;
    }
    public void setVerifiedIdNumber(String verifiedIdNumber) {
        this.verifiedIdNumber = verifiedIdNumber;
    }
}
