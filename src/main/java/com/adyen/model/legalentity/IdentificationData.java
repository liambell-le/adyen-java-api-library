package com.adyen.model.legalentity;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import static com.adyen.util.Util.toIndentedString;

public class IdentificationData {
    @SerializedName("number")
    private String number = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("issuerCountry")
    private String issuerCountry = null;

    @SerializedName("issuerState")
    private String issuerState = null;

    @SerializedName("expiryDate")
    private String expiryDate = null;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIssuerCountry() {
        return issuerCountry;
    }

    public void setIssuerCountry(String issuerCountry) {
        this.issuerCountry = issuerCountry;
    }

    public String getIssuerState() {
        return issuerState;
    }

    public void setIssuerState(String issuerState) {
        this.issuerState = issuerState;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdentificationData name = (IdentificationData) o;
        return Objects.equals(this.number, name.number)
                && Objects.equals(this.type, name.type)
                && Objects.equals(this.issuerCountry, name.issuerCountry)
                && Objects.equals(this.issuerState, name.issuerState)
                && Objects.equals(this.expiryDate, name.expiryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, type, issuerCountry, issuerState, expiryDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdentificationData {\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    issuerCountry: ").append(toIndentedString(issuerCountry)).append("\n");
        sb.append("    issuerState: ").append(toIndentedString(issuerState)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
