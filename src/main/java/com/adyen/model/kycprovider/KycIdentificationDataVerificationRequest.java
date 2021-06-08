package com.adyen.model.kycprovider;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;

public class KycIdentificationDataVerificationRequest {

    public enum IdType {
        ID_CARD,
        PASSPORT,
        DRIVING_LICENCE
    }

    @SerializedName("firstName")
    private String firstName;

    @SerializedName("lastName")
    private String lastName;

    @SerializedName("gender")
    private String gender;

    @SerializedName("dateOfBirth")
    private LocalDate dateOfBirth;

    @SerializedName("idType")
    private IdType idType;

    @SerializedName("idNumber")
    private String idNumber;

    @SerializedName("idIssuerCountry")
    private String idIssuerCountry;

    @SerializedName("idIssuerState")
    private String idIssuerState;

    @SerializedName("idExpirationDate")
    private LocalDate idExpirationDate;

    @SerializedName("country")
    private String country;

    @SerializedName("street")
    private String street;

    @SerializedName("houseNumberOrName")
    private String houseNumberOrName;

    @SerializedName("postalCode")
    private String postalCode;

    @SerializedName("city")
    private String city;

    @SerializedName("stateOrProvince")
    private String stateOrProvince;

    @SerializedName("email")
    private String email;

    @SerializedName("phoneNumber")
    private String phoneNumber;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public IdType getIdType() {
        return idType;
    }

    public void setIdType(IdType idType) {
        this.idType = idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdIssuerCountry() {
        return idIssuerCountry;
    }

    public void setIdIssuerCountry(String idIssuerCountry) {
        this.idIssuerCountry = idIssuerCountry;
    }

    public String getIdIssuerState() {
        return idIssuerState;
    }

    public void setIdIssuerState(String idIssuerState) {
        this.idIssuerState = idIssuerState;
    }

    public LocalDate getIdExpirationDate() {
        return idExpirationDate;
    }

    public void setIdExpirationDate(LocalDate idExpirationDate) {
        this.idExpirationDate = idExpirationDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumberOrName() {
        return houseNumberOrName;
    }

    public void setHouseNumberOrName(String houseNumberOrName) {
        this.houseNumberOrName = houseNumberOrName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateOrProvince() {
        return stateOrProvince;
    }

    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
