// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.fluent.models.MonitoringTagRulesInner;
import com.azure.resourcemanager.elastic.models.LogRules;
import com.azure.resourcemanager.elastic.models.MonitoringTagRulesProperties;
import com.azure.resourcemanager.elastic.models.ProvisioningState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MonitoringTagRulesInnerTests {
    @Test
    public void testDeserialize() {
        MonitoringTagRulesInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Updating\",\"logRules\":{\"sendAadLogs\":true,\"sendSubscriptionLogs\":true,\"sendActivityLogs\":false,\"filteringTags\":[]}},\"id\":\"rlovmclwhijcoej\",\"name\":\"tbzaqsqsycbkbfk\",\"type\":\"ukdkexxppofmxa\"}")
                .toObject(MonitoringTagRulesInner.class);
        Assertions.assertEquals(ProvisioningState.UPDATING, model.properties().provisioningState());
        Assertions.assertEquals(true, model.properties().logRules().sendAadLogs());
        Assertions.assertEquals(true, model.properties().logRules().sendSubscriptionLogs());
        Assertions.assertEquals(false, model.properties().logRules().sendActivityLogs());
    }

    @Test
    public void testSerialize() {
        MonitoringTagRulesInner model =
            new MonitoringTagRulesInner()
                .withProperties(
                    new MonitoringTagRulesProperties()
                        .withProvisioningState(ProvisioningState.UPDATING)
                        .withLogRules(
                            new LogRules()
                                .withSendAadLogs(true)
                                .withSendSubscriptionLogs(true)
                                .withSendActivityLogs(false)
                                .withFilteringTags(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(MonitoringTagRulesInner.class);
        Assertions.assertEquals(ProvisioningState.UPDATING, model.properties().provisioningState());
        Assertions.assertEquals(true, model.properties().logRules().sendAadLogs());
        Assertions.assertEquals(true, model.properties().logRules().sendSubscriptionLogs());
        Assertions.assertEquals(false, model.properties().logRules().sendActivityLogs());
    }
}
