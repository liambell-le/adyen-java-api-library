package com.adyen.service;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.model.RequestOptions;
import com.adyen.model.legalentity.LegalEntityRequest;
import com.adyen.model.legalentity.LegalEntityResponse;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.legalentity.CreateLegalEntity;
import com.adyen.service.resource.legalentity.RetrieveLegalEntity;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import static com.adyen.constants.ApiConstants.RequestProperty.Method;

public class LegalEntity extends Service {

    private CreateLegalEntity createLegalEntity;
    private RetrieveLegalEntity retrieveLegalEntity;

    public LegalEntity(Client client) {
        super(client);
        this.createLegalEntity = new CreateLegalEntity(this);
        this.retrieveLegalEntity = new RetrieveLegalEntity(this);
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
        String jsonResult = createLegalEntity.request(jsonRequest, requestOptions);
        return GSON.fromJson(jsonResult, new TypeToken<LegalEntityResponse>() {
        }.getType());
    }

    /**
     * GET /legalEntities/{id} API call
     * @param id legal entity id
     * @return legalEntityResponse LegalEntityResponse
     * @throws ApiException ApiException
     * @throws IOException IOException
     */
    public LegalEntityResponse retrieveLegalEntity(String id) throws ApiException, IOException {
        return retrieveLegalEntity(id, null);
    }

    /**
     * GET /legalEntities/{id} API call
     * @param id legal entity id
     * @param requestOptions RequestOptions
     * @return legalEntityResponse LegalEntityResponse
     * @throws ApiException ApiException
     * @throws IOException IOException
     */
    public LegalEntityResponse retrieveLegalEntity(String id, RequestOptions requestOptions) throws ApiException, IOException {
        Map<String, String> params = Collections.singletonMap("id", id);
        String jsonResult = retrieveLegalEntity.request(null, requestOptions, Method.GET, params);
        return GSON.fromJson(jsonResult, new TypeToken<LegalEntityResponse>() {
        }.getType());
    }
}
