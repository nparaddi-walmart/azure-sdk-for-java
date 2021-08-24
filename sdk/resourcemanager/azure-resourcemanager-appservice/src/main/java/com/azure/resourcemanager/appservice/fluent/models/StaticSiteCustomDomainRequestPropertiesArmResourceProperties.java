// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** StaticSiteCustomDomainRequestPropertiesARMResource resource specific properties. */
@Fluent
public final class StaticSiteCustomDomainRequestPropertiesArmResourceProperties {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(StaticSiteCustomDomainRequestPropertiesArmResourceProperties.class);

    /*
     * Validation method for adding a custom domain
     */
    @JsonProperty(value = "validationMethod")
    private String validationMethod;

    /**
     * Get the validationMethod property: Validation method for adding a custom domain.
     *
     * @return the validationMethod value.
     */
    public String validationMethod() {
        return this.validationMethod;
    }

    /**
     * Set the validationMethod property: Validation method for adding a custom domain.
     *
     * @param validationMethod the validationMethod value to set.
     * @return the StaticSiteCustomDomainRequestPropertiesArmResourceProperties object itself.
     */
    public StaticSiteCustomDomainRequestPropertiesArmResourceProperties withValidationMethod(String validationMethod) {
        this.validationMethod = validationMethod;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}