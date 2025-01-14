// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.LicenseType;
import com.azure.resourcemanager.hybridcontainerservice.models.WindowsProfile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class WindowsProfileTests {
    @Test
    public void testDeserialize() {
        WindowsProfile model =
            BinaryData
                .fromString(
                    "{\"adminPassword\":\"fakePasswordPlaceholder\",\"adminUsername\":\"fakeUsernamePlaceholder\",\"enableCsiProxy\":false,\"licenseType\":\"None\"}")
                .toObject(WindowsProfile.class);
        Assertions.assertEquals("fakeUsernamePlaceholder", model.adminUsername());
        Assertions.assertEquals(false, model.enableCsiProxy());
        Assertions.assertEquals(LicenseType.NONE, model.licenseType());
        Assertions.assertEquals("fakePasswordPlaceholder", model.adminPassword());
    }

    @Test
    public void testSerialize() {
        WindowsProfile model =
            new WindowsProfile()
                .withAdminUsername("fakeUsernamePlaceholder")
                .withEnableCsiProxy(false)
                .withLicenseType(LicenseType.NONE)
                .withAdminPassword("fakePasswordPlaceholder");
        model = BinaryData.fromObject(model).toObject(WindowsProfile.class);
        Assertions.assertEquals("fakeUsernamePlaceholder", model.adminUsername());
        Assertions.assertEquals(false, model.enableCsiProxy());
        Assertions.assertEquals(LicenseType.NONE, model.licenseType());
        Assertions.assertEquals("fakePasswordPlaceholder", model.adminPassword());
    }
}
