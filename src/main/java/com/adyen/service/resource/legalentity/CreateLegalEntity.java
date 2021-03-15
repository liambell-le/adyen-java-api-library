package com.adyen.service.resource.legalentity;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.service.Resource;

import java.util.Collections;

public class CreateLegalEntity extends Resource {

    public CreateLegalEntity(Service service) {
        super(service, service.getClient().getConfig().getLegalEntityAPIEndpoint() + "/" + Client.LE_API_ENDPOINT_VERSION +
                "/legalEntities", Collections.singletonList("legalEntity"));
    }
}