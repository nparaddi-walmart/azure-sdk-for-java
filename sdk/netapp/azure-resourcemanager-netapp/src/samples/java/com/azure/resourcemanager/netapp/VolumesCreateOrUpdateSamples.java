// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp;

import com.azure.resourcemanager.netapp.models.ServiceLevel;

/** Samples for Volumes CreateOrUpdate. */
public final class VolumesCreateOrUpdateSamples {
    /*
     * operationId: Volumes_CreateOrUpdate
     * api-version: 2021-06-01
     * x-ms-examples: Volumes_CreateOrUpdate
     */
    /**
     * Sample code: Volumes_CreateOrUpdate.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumesCreateOrUpdate(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager
            .volumes()
            .define("volume1")
            .withRegion("eastus")
            .withExistingCapacityPool("myRG", "account1", "pool1")
            .withCreationToken("my-unique-file-path")
            .withUsageThreshold(107374182400L)
            .withSubnetId(
                "/subscriptions/9760acf5-4638-11e7-9bdb-020073ca7778/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
            .withServiceLevel(ServiceLevel.PREMIUM)
            .withThroughputMibps(128.0f)
            .withEncryptionKeySource("Microsoft.KeyVault")
            .create();
    }
}