package com.adyen.model.legalentity;

import com.fasterxml.jackson.annotation.JsonValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

import static com.adyen.util.Util.toIndentedString;

public class Address {

    @SerializedName("street")
    private String street = null;

    @SerializedName("street2")
    private String street2 = null;

    @SerializedName("city")
    private String city = null;

    @SerializedName("postalCode")
    private String postalCode = null;

    @SerializedName("stateOrProvince")
    private String stateOrProvince = null;

    @SerializedName("country")
    private String country = null;

    @SerializedName("type")
    private AddressTypeEnum type;

    @JsonAdapter(Address.AddressTypeEnum.Adapter.class)
    public enum AddressTypeEnum {
        REGISTERED("registered"),
        PRINCIPALPLACEOFBUSINESS("principalPlaceOfBusiness"),
        RESIDENTIAL("residential");

        @JsonValue
        private String value;

        AddressTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public static AddressTypeEnum fromValue(String text) {
            return Arrays.stream(values()).
                    filter(s -> s.value.equals(text)).
                    findFirst().orElse(null);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<Address.AddressTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final Address.AddressTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public Address.AddressTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return Address.AddressTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStateOrProvince() {
        return stateOrProvince;
    }

    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public AddressTypeEnum getType() {
        return type;
    }

    public void setType(AddressTypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return Objects.equals(street, address.street) &&
                Objects.equals(street2, address.street2) &&
                Objects.equals(city, address.city) &&
                Objects.equals(postalCode, address.postalCode) &&
                Objects.equals(stateOrProvince, address.stateOrProvince) &&
                Objects.equals(country, address.country) &&
                type == address.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, street2, city, postalCode, stateOrProvince, country, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Address {\n");

        sb.append("    street: ").append(toIndentedString(street)).append("\n");
        sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    AddressType: ").append(toIndentedString(type)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
