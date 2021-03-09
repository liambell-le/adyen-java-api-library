package com.adyen.service.resource.legalentity;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.service.Resource;

import java.util.Collections;

public class LegalEntity extends Resource {

    public LegalEntity(Service service) {
        super(service, service.getClient().getConfig().getLegalEntityAPIEndpoint() + "/" + Client.LE_API_ENDPOINT_VERSION +
                "/legalEntities", Collections.singletonList("legalEntity"));
    }
}