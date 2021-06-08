package com.adyen;

import com.adyen.model.checkout.PaymentsResponse;
import com.adyen.model.kycprovider.KycIdentificationDataVerificationRequest;
import com.adyen.model.kycprovider.KycIdentificationDataVerificationResponse;
import com.adyen.service.KycProviderVerification;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class KycProviderVerificationTest extends BaseTest {

    /**
     * Test success flow for
     * POST /payments
     */
    @Test
    public void IdentificationData() throws Exception {
        Client client = createMockClientFromFile("mocks/kycprovider/identification-data-success.json");
        KycProviderVerification kycProviderVerification = new KycProviderVerification(client);
        KycIdentificationDataVerificationRequest identificationDataVerificationRequest = new KycIdentificationDataVerificationRequest();
        KycIdentificationDataVerificationResponse identificationDataVerificationResponse = kycProviderVerification.verifyIdentificationData(identificationDataVerificationRequest);
        assertNotNull(identificationDataVerificationResponse);
    }
    
}
