package com.adyen.service;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.model.RequestOptions;
import com.adyen.model.legalentity.LegalEntityRequest;
import com.adyen.model.legalentity.LegalEntityResponse;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.legalentity.LegalEntityCreate;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import static com.adyen.constants.ApiConstants.RequestProperty.Method;

public class LegalEntity extends Service {

    private LegalEntityCreate legalEntity;

    public LegalEntity(Client client) {
        super(client);
        this.legalEntity = new LegalEntityCreate(this);
    }

    /**
     * POST /legalEntities API call
     * @param legalEntityRequest LegalEntityRequest
     * @return legalEntityResponse LegalEntityResponse
     * @throws ApiException ApiException
     * @throws IOException IOException
     */
    public LegalEntityResponse createLegalEntity(LegalEntityRequest legalEntityRequest) throws ApiException, IOException {
        return createLegalEntity(legalEntityRequest, null);
    }

    /**
     * POST /legalEntities API call
     * @param legalEntityRequest LegalEntityRequest
     * @param requestOptions RequestOptions
     * @return legalEntityResponse LegalEntityResponse
     * @throws ApiException ApiException
     * @throws IOException IOException
     */
    public LegalEntityResponse createLegalEntity(LegalEntityRequest legalEntityRequest, RequestOptions requestOptions) throws ApiException, IOException {
        String jsonRequest = GSON.toJson(legalEntityRequest);
        String jsonResult = legalEntity.request(jsonRequest, requestOptions, Method.POST);
        return GSON.fromJson(jsonResult, new TypeToken<LegalEntityResponse>() {
        }.getType());
    }
}
