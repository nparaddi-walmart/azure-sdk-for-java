// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.kusto.models.PrivateEndpointConnectionListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public final class PrivateEndpointConnectionListResultTests {
    @Test
    public void testDeserialize() {
        PrivateEndpointConnectionListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"groupId\":\"dsotbobzd\",\"provisioningState\":\"cjwvn\"},\"id\":\"ld\",\"name\":\"mgxcxrslpm\",\"type\":\"twuoegrpkhjwni\"},{\"properties\":{\"groupId\":\"uicpd\",\"provisioningState\":\"kzzlvmbmpaxmodf\"},\"id\":\"efyw\",\"name\":\"bpfvm\",\"type\":\"yhrfouyftaakcpw\"},{\"properties\":{\"groupId\":\"qtmnubexkpzk\",\"provisioningState\":\"ondjmq\"},\"id\":\"vypomgkopkwho\",\"name\":\"v\",\"type\":\"ajqgxy\"},{\"properties\":{\"groupId\":\"mbqfqvmk\",\"provisioningState\":\"oz\"},\"id\":\"vhelxprglyatdd\",\"name\":\"kcbcue\",\"type\":\"rjxgciqib\"}]}")
                .toObject(PrivateEndpointConnectionListResult.class);
    }

    @Test
    public void testSerialize() {
        PrivateEndpointConnectionListResult model =
            new PrivateEndpointConnectionListResult()
                .withValue(
                    Arrays
                        .asList(
                            new PrivateEndpointConnectionInner(),
                            new PrivateEndpointConnectionInner(),
                            new PrivateEndpointConnectionInner(),
                            new PrivateEndpointConnectionInner()));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionListResult.class);
    }
}
