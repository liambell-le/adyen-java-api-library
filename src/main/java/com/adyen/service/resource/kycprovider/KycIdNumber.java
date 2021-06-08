package com.adyen.service.resource.kycprovider;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.service.Resource;

import java.util.Collections;

public class KycIdNumber extends Resource {

    public KycIdNumber(Service service) {
        super(service, service.getClient().getConfig().getKycExternalAPIEndpoint() + "/" + Client.KYC_EXTERNAL_API_ENDPOINT_VERSION +
                "/verification/idNumber", Collections.singletonList("IdNumber"));
    }
}
