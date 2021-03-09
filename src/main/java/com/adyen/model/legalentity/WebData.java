package com.adyen.model.legalentity;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import static com.adyen.util.Util.toIndentedString;

public class WebData {

    @SerializedName("webAddress")
    private String webAddress = null;

    @SerializedName("appAddress")
    private String appAddress = null;

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public String getAppAddress() {
        return appAddress;
    }

    public void setAppAddress(String appAddress) {
        this.appAddress = appAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebData name = (WebData) o;
        return Objects.equals(this.webAddress, name.webAddress)
                && Objects.equals(this.appAddress, name.appAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(webAddress, appAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebData {\n");
        sb.append("    webAddress: ").append(toIndentedString(webAddress)).append("\n");
        sb.append("    appAddress: ").append(toIndentedString(appAddress)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
