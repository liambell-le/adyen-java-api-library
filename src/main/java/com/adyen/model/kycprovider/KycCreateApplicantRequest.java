package com.adyen.model.kycprovider;

import com.google.gson.annotations.SerializedName;

public class KycCreateApplicantRequest {

    @SerializedName("legalEntityKey")
    private String legalEntityKey;

    @SerializedName("firstName")
    private String firstName;

    @SerializedName("lastName")
    private String lastName;

    @SerializedName("referrer")
    private String referrer;

    public String getLegalEntityKey() {
        return legalEntityKey;
    }

    public void setLegalEntityKey(String legalEntityKey) {
        this.legalEntityKey = legalEntityKey;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }
}
