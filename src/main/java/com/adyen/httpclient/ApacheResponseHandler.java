package com.adyen.httpclient;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class ApacheResponseHandler implements ResponseHandler<ApacheResponse> {

    @Override
    public ApacheResponse handleResponse(HttpResponse httpResponse) throws IOException {
        ApacheResponse apacheResponse = new ApacheResponse();
        apacheResponse.setStatus(httpResponse.getStatusLine().getStatusCode());

        HttpEntity entity = httpResponse.getEntity();
        if (entity != null) {
            apacheResponse.setResponse(EntityUtils.toString(entity));
        }
        return apacheResponse;
    }
}