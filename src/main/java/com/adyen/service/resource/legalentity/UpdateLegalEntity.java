package com.adyen.service.resource.legalentity;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.service.Resource;

import java.util.Arrays;

public class UpdateLegalEntity extends Resource {

    public UpdateLegalEntity(Service service) {
        super(service, service.getClient().getConfig().getLegalEntityAPIEndpoint() + "/" + Client.LE_API_ENDPOINT_VERSION +
                "/legalEntities/{id}", Arrays.asList("id", "legalEntity"));
    }
}