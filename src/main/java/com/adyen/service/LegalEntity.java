package com.adyen.service;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.model.RequestOptions;
import com.adyen.model.legalentity.LegalEntityRequest;
import com.adyen.model.legalentity.LegalEntityResponse;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.legalentity.CreateLegalEntity;
import com.adyen.service.resource.legalentity.RetrieveLegalEntity;
import com.adyen.service.resource.legalentity.UpdateLegalEntity;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import static com.adyen.constants.ApiConstants.HttpMethod.GET;
import static com.adyen.constants.ApiConstants.HttpMethod.POST;
import static com.adyen.constants.ApiConstants.HttpMethod.PATCH;

public class LegalEntity extends Service {

    private CreateLegalEntity createLegalEntity;
    private RetrieveLegalEntity retrieveLegalEntity;
    private UpdateLegalEntity updateLegalEntity;

    public LegalEntity(Client client) {
        super(client);
        this.createLegalEntity = new CreateLegalEntity(this);
        this.retrieveLegalEntity = new RetrieveLegalEntity(this);
        this.updateLegalEntity = new UpdateLegalEntity(this);
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
        String jsonResult = createLegalEntity.request(jsonRequest, requestOptions, POST, null);
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
        String jsonResult = retrieveLegalEntity.request(null, requestOptions, GET, params);
        return GSON.fromJson(jsonResult, new TypeToken<LegalEntityResponse>() {
        }.getType());
    }

    /**
     * PATCH /legalEntities/{id} API call
     * @param id legal entity id
     * @param legalEntityRequest LegalEntityRequest
     * @return legalEntityResponse LegalEntityResponse
     * @throws ApiException ApiException
     * @throws IOException IOException
     */
    public LegalEntityResponse updateLegalEntity(String id, LegalEntityRequest legalEntityRequest) throws ApiException, IOException {
        return updateLegalEntity(id, legalEntityRequest, null);
    }

    /**
     * PATCH /legalEntities/{id} API call
     * @param id legal entity id
     * @param legalEntityRequest LegalEntityRequest
     * @param requestOptions RequestOptions
     * @return legalEntityResponse LegalEntityResponse
     * @throws ApiException ApiException
     * @throws IOException IOException
     */
    public LegalEntityResponse updateLegalEntity(String id, LegalEntityRequest legalEntityRequest, RequestOptions requestOptions) throws ApiException, IOException {
        Map<String, String> params = Collections.singletonMap("id", id);
        String jsonRequest = GSON.toJson(legalEntityRequest);
        String jsonResult = updateLegalEntity.request(jsonRequest, requestOptions, PATCH, params);
        return GSON.fromJson(jsonResult, new TypeToken<LegalEntityResponse>() {
        }.getType());
    }
}
