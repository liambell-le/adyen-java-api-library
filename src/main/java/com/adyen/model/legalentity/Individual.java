package com.adyen.model.legalentity;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import static com.adyen.util.Util.toIndentedString;

public class Individual {

    @SerializedName("name")
    private Name name = null;

    @SerializedName("birthData")
    private BirthData birthData = null;

    @SerializedName("address")
    private Address address = null;

    @SerializedName("phone")
    private PhoneNumber phone = null;

    @SerializedName("webData")
    private WebData webData = null;

    @SerializedName("identificationData")
    private IdentificationData identificationData = null;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public BirthData getBirthData() {
        return birthData;
    }

    public void setBirthData(BirthData birthData) {
        this.birthData = birthData;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getPhone() {
        return phone;
    }

    public void setPhone(PhoneNumber phone) {
        this.phone = phone;
    }

    public WebData getWebData() {
        return webData;
    }

    public void setWebData(WebData webData) {
        this.webData = webData;
    }

    public IdentificationData getIdentificationData() {
        return identificationData;
    }

    public void setIdentificationData(IdentificationData identificationData) {
        this.identificationData = identificationData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Individual name = (Individual) o;
        return Objects.equals(this.name, name.name)
                && Objects.equals(this.birthData, name.birthData)
                && Objects.equals(this.address, name.address)
                && Objects.equals(this.phone, name.phone)
                && Objects.equals(this.webData, name.webData)
                && Objects.equals(this.identificationData, name.identificationData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthData, address, phone, webData, identificationData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Address {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    birthData: ").append(toIndentedString(birthData)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phone)).append("\n");
        sb.append("    webData: ").append(toIndentedString(webData)).append("\n");
        sb.append("    identificationData: ").append(toIndentedString(identificationData)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
