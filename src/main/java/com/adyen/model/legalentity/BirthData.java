package com.adyen.model.legalentity;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import static com.adyen.util.Util.toIndentedString;

public class BirthData {

    @SerializedName("dateOfBirth")
    private String dateOfBirth = null;

    public BirthData dateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BirthData name = (BirthData) o;
        return Objects.equals(this.dateOfBirth, name.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfBirth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BirthData {\n");
        sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
