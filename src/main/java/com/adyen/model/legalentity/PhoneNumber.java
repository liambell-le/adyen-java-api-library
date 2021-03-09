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

public class PhoneNumber {

    @JsonAdapter(PhoneNumber.PhoneTypeEnum.Adapter.class)
    public enum PhoneTypeEnum {
        MOBILE("mobile"),
        LANDLINE("landline"),
        SIP("sip"),
        FAX("fax"),
        UNKNOWNTYPE("unknownType");

        @JsonValue
        private String value;

        PhoneTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public static PhoneTypeEnum fromValue(String text) {
            return Arrays.stream(values()).
                    filter(s -> s.value.equals(text)).
                    findFirst().orElse(null);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<PhoneNumber.PhoneTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PhoneNumber.PhoneTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PhoneNumber.PhoneTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PhoneNumber.PhoneTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("type")
    private PhoneTypeEnum type = null;

    @SerializedName("countryCode")
    private String countryCode = null;

    @SerializedName("number")
    private String number = null;

    public PhoneTypeEnum getType() {
        return type;
    }

    public void setType(PhoneTypeEnum type) {
        this.type = type;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PhoneNumber name = (PhoneNumber) o;
        return Objects.equals(this.type, name.type)
                && Objects.equals(this.countryCode, name.countryCode)
                && Objects.equals(this.number, name.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, countryCode, number);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PhoneNumber {\n");
        sb.append("    phoneType: ").append(toIndentedString(type)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
