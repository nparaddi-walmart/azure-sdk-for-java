// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LogzOrganizationProperties model. */
@Fluent
public final class LogzOrganizationProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LogzOrganizationProperties.class);

    /*
     * Name of the Logz organization.
     */
    @JsonProperty(value = "companyName")
    private String companyName;

    /*
     * Id of the Logz organization.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The Id of the Enterprise App used for Single sign on.
     */
    @JsonProperty(value = "enterpriseAppId")
    private String enterpriseAppId;

    /*
     * The login URL specific to this Logz Organization.
     */
    @JsonProperty(value = "singleSignOnUrl")
    private String singleSignOnUrl;

    /**
     * Get the companyName property: Name of the Logz organization.
     *
     * @return the companyName value.
     */
    public String companyName() {
        return this.companyName;
    }

    /**
     * Set the companyName property: Name of the Logz organization.
     *
     * @param companyName the companyName value to set.
     * @return the LogzOrganizationProperties object itself.
     */
    public LogzOrganizationProperties withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * Get the id property: Id of the Logz organization.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the enterpriseAppId property: The Id of the Enterprise App used for Single sign on.
     *
     * @return the enterpriseAppId value.
     */
    public String enterpriseAppId() {
        return this.enterpriseAppId;
    }

    /**
     * Set the enterpriseAppId property: The Id of the Enterprise App used for Single sign on.
     *
     * @param enterpriseAppId the enterpriseAppId value to set.
     * @return the LogzOrganizationProperties object itself.
     */
    public LogzOrganizationProperties withEnterpriseAppId(String enterpriseAppId) {
        this.enterpriseAppId = enterpriseAppId;
        return this;
    }

    /**
     * Get the singleSignOnUrl property: The login URL specific to this Logz Organization.
     *
     * @return the singleSignOnUrl value.
     */
    public String singleSignOnUrl() {
        return this.singleSignOnUrl;
    }

    /**
     * Set the singleSignOnUrl property: The login URL specific to this Logz Organization.
     *
     * @param singleSignOnUrl the singleSignOnUrl value to set.
     * @return the LogzOrganizationProperties object itself.
     */
    public LogzOrganizationProperties withSingleSignOnUrl(String singleSignOnUrl) {
        this.singleSignOnUrl = singleSignOnUrl;
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