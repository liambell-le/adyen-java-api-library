package com.adyen.service;

import com.adyen.ApiKeyAuthenticatedService;
import com.adyen.Client;
import com.adyen.model.RequestOptions;
import com.adyen.model.kycprovider.*;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.kycprovider.KycCreateApplicant;
import com.adyen.service.resource.kycprovider.KycIdDocument;
import com.adyen.service.resource.kycprovider.KycIdNumber;
import com.adyen.service.resource.kycprovider.KycIdentificationData;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import static com.adyen.constants.ApiConstants.HttpMethod.POST;

public class KycProviderVerification extends ApiKeyAuthenticatedService {
    
    private final KycIdentificationData kycIdentificationData;
    private final KycIdNumber kycIdNumber;
    private final KycCreateApplicant kycCreateApplicant;
    private final KycIdDocument kycIdDocument;
    
    public KycProviderVerification(Client client) {
        super(client);
        this.kycIdentificationData = new KycIdentificationData(this);
        this.kycIdNumber = new KycIdNumber(this);
        this.kycCreateApplicant = new KycCreateApplicant(this);
        this.kycIdDocument = new KycIdDocument(this);
    }
    
    /**
     * POST /identificationData API call
     * @param identificationDataVerificationRequest KycIdentificationDataVerificationRequest
     * @return kycIdentificationDataVerificationResponse KycIdentificationDataVerificationResponse
     * @throws ApiException ApiException
     * @throws IOException IOException
     */
    public KycIdentificationDataVerificationResponse verifyIdentificationData(KycIdentificationDataVerificationRequest identificationDataVerificationRequest) throws ApiException, IOException {
        return verifyIdentificationData(identificationDataVerificationRequest, null);
    }
    
    /**
     * POST /identificationData API call
     * @param identificationDataVerificationRequest KycIdentificationDataVerificationRequest
     * @param requestOptions RequestOptions
     * @return kycIdentificationDataVerificationResponse KycIdentificationDataVerificationResponse
     * @throws ApiException ApiException
     * @throws IOException IOException
     */
    public KycIdentificationDataVerificationResponse verifyIdentificationData(KycIdentificationDataVerificationRequest identificationDataVerificationRequest, RequestOptions requestOptions) throws ApiException, IOException {
        String jsonRequest = GSON.toJson(identificationDataVerificationRequest);
        String jsonResult = kycIdentificationData.request(jsonRequest, requestOptions, POST, null);
        return GSON.fromJson(jsonResult, new TypeToken<KycIdentificationDataVerificationResponse>() {
        }.getType());
    }
    
    /**
     * POST /verification/identificationData API call
     * @param kycIdNumberVerificationRequest KycIdNumberVerificationRequest
     * @return kycIdNumberVerificationResponse KycIdNumberVerificationResponse
     * @throws ApiException ApiException
     * @throws IOException IOException
     */
    public KycIdNumberVerificationResponse verifyIdNumber(KycIdNumberVerificationRequest kycIdNumberVerificationRequest) throws ApiException, IOException {
        return verifyIdNumber(kycIdNumberVerificationRequest, null);
    }
    
    /**
     * POST /identificationData API call
     * @param kycIdNumberVerificationRequest KycIdNumberVerificationRequest
     * @param requestOptions RequestOptions
     * @return kycIdNumberVerificationResponse KycIdNumberVerificationResponse
     * @throws ApiException ApiException
     * @throws IOException IOException
     */
    public KycIdNumberVerificationResponse verifyIdNumber(KycIdNumberVerificationRequest kycIdNumberVerificationRequest, RequestOptions requestOptions) throws ApiException, IOException {
        String jsonRequest = GSON.toJson(kycIdNumberVerificationRequest);
        String jsonResult = kycIdNumber.request(jsonRequest, requestOptions, POST, null);
        return GSON.fromJson(jsonResult, new TypeToken<KycIdNumberVerificationResponse>() {
        }.getType());
    }
    
    /**
     * POST /verification/applicants API call
     * @param kycCreateApplicantRequest KycCreateApplicantRequest
     * @return kycIdNumberVerificationResponse KycIdNumberVerificationResponse
     * @throws ApiException ApiException
     * @throws IOException IOException
     */
    public KycIdNumberVerificationResponse createApplicant(KycCreateApplicantRequest kycCreateApplicantRequest) throws ApiException, IOException {
        return createApplicant(kycCreateApplicantRequest, null);
    }
    
    /**
     * POST /verification/applicants API call
     * @param kycCreateApplicantRequest KycCreateApplicantRequest
     * @param requestOptions RequestOptions
     * @return kycCreateApplicantResponse KycCreateApplicantResponse
     * @throws ApiException ApiException
     * @throws IOException IOException
     */
    public KycIdNumberVerificationResponse createApplicant(KycCreateApplicantRequest kycCreateApplicantRequest, RequestOptions requestOptions) throws ApiException, IOException {
        String jsonRequest = GSON.toJson(kycCreateApplicantRequest);
        String jsonResult = kycCreateApplicant.request(jsonRequest, requestOptions, POST, null);
        return GSON.fromJson(jsonResult, new TypeToken<KycCreateApplicantResponse>() {
        }.getType());
    }
    
    /**
     * POST /verification/applicants/{applicantId}/initiate API call
     * @param kycIdDocumentVerificationRequest KycIdDocumentVerificationRequest
     * @return kycIdNumberVerificationResponse KycIdNumberVerificationResponse
     * @throws ApiException ApiException
     * @throws IOException IOException
     */
    public KycIdNumberVerificationResponse verifyIdDocument(KycIdDocumentVerificationRequest kycIdDocumentVerificationRequest) throws ApiException, IOException {
        return verifyIdDocument(kycIdDocumentVerificationRequest, null);
    }
    
    /**
     * POST /verification/applicants/{applicantId}/initiate API call
     * @param kycIdDocumentVerificationRequest KycIdDocumentVerificationRequest
     * @param requestOptions RequestOptions
     * @return kycIdentificationDataVerificationResponse KycIdentificationDataVerificationResponse
     * @throws ApiException ApiException
     * @throws IOException IOException
     */
    public KycIdNumberVerificationResponse verifyIdDocument(KycIdDocumentVerificationRequest kycIdDocumentVerificationRequest, RequestOptions requestOptions) throws ApiException, IOException {
        String jsonRequest = GSON.toJson(kycIdDocumentVerificationRequest);
        String jsonResult = kycIdDocument.request(jsonRequest, requestOptions, POST, null);
        return GSON.fromJson(jsonResult, new TypeToken<KycIdentificationDataVerificationResponse>() {
        }.getType());
    }
}
