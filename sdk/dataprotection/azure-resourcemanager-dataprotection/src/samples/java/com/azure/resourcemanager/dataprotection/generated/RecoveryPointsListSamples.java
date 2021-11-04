// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.Context;

/** Samples for RecoveryPoints List. */
public final class RecoveryPointsListSamples {
    /*
     * x-ms-original-file: specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2021-07-01/examples/BackupInstanceOperations/ListRecoveryPoints.json
     */
    /**
     * Sample code: List Recovery Points in a Vault.
     *
     * @param manager Entry point to DataProtectionManager.
     */
    public static void listRecoveryPointsInAVault(
        com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager
            .recoveryPoints()
            .list("PratikPrivatePreviewVault1", "000pikumar", "testInstance1", null, null, Context.NONE);
    }
}