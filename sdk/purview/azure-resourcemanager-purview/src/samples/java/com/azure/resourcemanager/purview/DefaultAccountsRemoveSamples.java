// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview;

import com.azure.core.util.Context;
import com.azure.resourcemanager.purview.models.ScopeType;
import java.util.UUID;

/** Samples for DefaultAccounts Remove. */
public final class DefaultAccountsRemoveSamples {
    /*
     * operationId: DefaultAccounts_Remove
     * api-version: 2021-07-01
     * x-ms-examples: DefaultAccounts_Remove
     */
    /**
     * Sample code: DefaultAccounts_Remove.
     *
     * @param manager Entry point to PurviewManager.
     */
    public static void defaultAccountsRemove(com.azure.resourcemanager.purview.PurviewManager manager) {
        manager
            .defaultAccounts()
            .removeWithResponse(
                UUID.fromString("12345678-1234-1234-12345678abc"),
                ScopeType.TENANT,
                "12345678-1234-1234-12345678abc",
                Context.NONE);
    }
}