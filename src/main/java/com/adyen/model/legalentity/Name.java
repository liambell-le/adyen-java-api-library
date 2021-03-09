package com.adyen.model.legalentity;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import static com.adyen.util.Util.toIndentedString;

public class Name {

    @SerializedName("firstName")
    private String firstName = null;

    @SerializedName("infix")
    private String infix = null;

    @SerializedName("lastName")
    private String lastName = null;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getInfix() {
        return infix;
    }

    public void setInfix(String infix) {
        this.infix = infix;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Name name = (Name) o;
        return Objects.equals(this.firstName, name.firstName) &&
                Objects.equals(this.infix, name.infix) &&
                Objects.equals(this.lastName, name.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, infix, lastName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Name {\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    infix: ").append(toIndentedString(infix)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
