// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.ApiEntityBaseContract;
import com.azure.resourcemanager.apimanagement.models.ApiType;
import com.azure.resourcemanager.apimanagement.models.ApiVersionSetContractDetails;
import com.azure.resourcemanager.apimanagement.models.AuthenticationSettingsContract;
import com.azure.resourcemanager.apimanagement.models.Protocol;
import com.azure.resourcemanager.apimanagement.models.SubscriptionKeyParameterNamesContract;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Api Entity Properties. */
@Fluent
public class ApiContractProperties extends ApiEntityBaseContract {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApiContractProperties.class);

    /*
     * API identifier of the source API.
     */
    @JsonProperty(value = "sourceApiId")
    private String sourceApiId;

    /*
     * API name. Must be 1 to 300 characters long.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Absolute URL of the backend service implementing this API. Cannot be
     * more than 2000 characters long.
     */
    @JsonProperty(value = "serviceUrl")
    private String serviceUrl;

    /*
     * Relative URL uniquely identifying this API and all of its resource paths
     * within the API Management service instance. It is appended to the API
     * endpoint base URL specified during the service instance creation to form
     * a public URL for this API.
     */
    @JsonProperty(value = "path", required = true)
    private String path;

    /*
     * Describes on which protocols the operations in this API can be invoked.
     */
    @JsonProperty(value = "protocols")
    private List<Protocol> protocols;

    /*
     * Version set details
     */
    @JsonProperty(value = "apiVersionSet")
    private ApiVersionSetContractDetails apiVersionSet;

    /**
     * Get the sourceApiId property: API identifier of the source API.
     *
     * @return the sourceApiId value.
     */
    public String sourceApiId() {
        return this.sourceApiId;
    }

    /**
     * Set the sourceApiId property: API identifier of the source API.
     *
     * @param sourceApiId the sourceApiId value to set.
     * @return the ApiContractProperties object itself.
     */
    public ApiContractProperties withSourceApiId(String sourceApiId) {
        this.sourceApiId = sourceApiId;
        return this;
    }

    /**
     * Get the displayName property: API name. Must be 1 to 300 characters long.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: API name. Must be 1 to 300 characters long.
     *
     * @param displayName the displayName value to set.
     * @return the ApiContractProperties object itself.
     */
    public ApiContractProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the serviceUrl property: Absolute URL of the backend service implementing this API. Cannot be more than 2000
     * characters long.
     *
     * @return the serviceUrl value.
     */
    public String serviceUrl() {
        return this.serviceUrl;
    }

    /**
     * Set the serviceUrl property: Absolute URL of the backend service implementing this API. Cannot be more than 2000
     * characters long.
     *
     * @param serviceUrl the serviceUrl value to set.
     * @return the ApiContractProperties object itself.
     */
    public ApiContractProperties withServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
        return this;
    }

    /**
     * Get the path property: Relative URL uniquely identifying this API and all of its resource paths within the API
     * Management service instance. It is appended to the API endpoint base URL specified during the service instance
     * creation to form a public URL for this API.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Relative URL uniquely identifying this API and all of its resource paths within the API
     * Management service instance. It is appended to the API endpoint base URL specified during the service instance
     * creation to form a public URL for this API.
     *
     * @param path the path value to set.
     * @return the ApiContractProperties object itself.
     */
    public ApiContractProperties withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the protocols property: Describes on which protocols the operations in this API can be invoked.
     *
     * @return the protocols value.
     */
    public List<Protocol> protocols() {
        return this.protocols;
    }

    /**
     * Set the protocols property: Describes on which protocols the operations in this API can be invoked.
     *
     * @param protocols the protocols value to set.
     * @return the ApiContractProperties object itself.
     */
    public ApiContractProperties withProtocols(List<Protocol> protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * Get the apiVersionSet property: Version set details.
     *
     * @return the apiVersionSet value.
     */
    public ApiVersionSetContractDetails apiVersionSet() {
        return this.apiVersionSet;
    }

    /**
     * Set the apiVersionSet property: Version set details.
     *
     * @param apiVersionSet the apiVersionSet value to set.
     * @return the ApiContractProperties object itself.
     */
    public ApiContractProperties withApiVersionSet(ApiVersionSetContractDetails apiVersionSet) {
        this.apiVersionSet = apiVersionSet;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractProperties withAuthenticationSettings(AuthenticationSettingsContract authenticationSettings) {
        super.withAuthenticationSettings(authenticationSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractProperties withSubscriptionKeyParameterNames(
        SubscriptionKeyParameterNamesContract subscriptionKeyParameterNames) {
        super.withSubscriptionKeyParameterNames(subscriptionKeyParameterNames);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractProperties withApiType(ApiType apiType) {
        super.withApiType(apiType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractProperties withApiRevision(String apiRevision) {
        super.withApiRevision(apiRevision);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractProperties withApiVersion(String apiVersion) {
        super.withApiVersion(apiVersion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractProperties withIsCurrent(Boolean isCurrent) {
        super.withIsCurrent(isCurrent);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractProperties withApiRevisionDescription(String apiRevisionDescription) {
        super.withApiRevisionDescription(apiRevisionDescription);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractProperties withApiVersionDescription(String apiVersionDescription) {
        super.withApiVersionDescription(apiVersionDescription);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractProperties withApiVersionSetId(String apiVersionSetId) {
        super.withApiVersionSetId(apiVersionSetId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractProperties withSubscriptionRequired(Boolean subscriptionRequired) {
        super.withSubscriptionRequired(subscriptionRequired);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (path() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property path in model ApiContractProperties"));
        }
        if (apiVersionSet() != null) {
            apiVersionSet().validate();
        }
    }
}