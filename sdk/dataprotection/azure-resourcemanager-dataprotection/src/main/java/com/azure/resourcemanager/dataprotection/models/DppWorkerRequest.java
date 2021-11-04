// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The DppWorkerRequest model. */
@Fluent
public class DppWorkerRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DppWorkerRequest.class);

    /*
     * The subscriptionId property.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /*
     * The uri property.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /*
     * Dictionary of
     * <components·ikn5y4·schemas·dppworkerrequest·properties·headers·additionalproperties>
     */
    @JsonProperty(value = "headers")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, List<String>> headers;

    /*
     * The supportedGroupVersions property.
     */
    @JsonProperty(value = "supportedGroupVersions")
    private List<String> supportedGroupVersions;

    /*
     * The cultureInfo property.
     */
    @JsonProperty(value = "cultureInfo")
    private String cultureInfo;

    /*
     * Dictionary of <string>
     */
    @JsonProperty(value = "parameters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> parameters;

    /*
     * The httpMethod property.
     */
    @JsonProperty(value = "httpMethod")
    private String httpMethod;

    /**
     * Get the subscriptionId property: The subscriptionId property.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: The subscriptionId property.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the DppWorkerRequest object itself.
     */
    public DppWorkerRequest withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the uri property: The uri property.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: The uri property.
     *
     * @param uri the uri value to set.
     * @return the DppWorkerRequest object itself.
     */
    public DppWorkerRequest withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the headers property: Dictionary of
     * &lt;components·ikn5y4·schemas·dppworkerrequest·properties·headers·additionalproperties&gt;.
     *
     * @return the headers value.
     */
    public Map<String, List<String>> headers() {
        return this.headers;
    }

    /**
     * Set the headers property: Dictionary of
     * &lt;components·ikn5y4·schemas·dppworkerrequest·properties·headers·additionalproperties&gt;.
     *
     * @param headers the headers value to set.
     * @return the DppWorkerRequest object itself.
     */
    public DppWorkerRequest withHeaders(Map<String, List<String>> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the supportedGroupVersions property: The supportedGroupVersions property.
     *
     * @return the supportedGroupVersions value.
     */
    public List<String> supportedGroupVersions() {
        return this.supportedGroupVersions;
    }

    /**
     * Set the supportedGroupVersions property: The supportedGroupVersions property.
     *
     * @param supportedGroupVersions the supportedGroupVersions value to set.
     * @return the DppWorkerRequest object itself.
     */
    public DppWorkerRequest withSupportedGroupVersions(List<String> supportedGroupVersions) {
        this.supportedGroupVersions = supportedGroupVersions;
        return this;
    }

    /**
     * Get the cultureInfo property: The cultureInfo property.
     *
     * @return the cultureInfo value.
     */
    public String cultureInfo() {
        return this.cultureInfo;
    }

    /**
     * Set the cultureInfo property: The cultureInfo property.
     *
     * @param cultureInfo the cultureInfo value to set.
     * @return the DppWorkerRequest object itself.
     */
    public DppWorkerRequest withCultureInfo(String cultureInfo) {
        this.cultureInfo = cultureInfo;
        return this;
    }

    /**
     * Get the parameters property: Dictionary of &lt;string&gt;.
     *
     * @return the parameters value.
     */
    public Map<String, String> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Dictionary of &lt;string&gt;.
     *
     * @param parameters the parameters value to set.
     * @return the DppWorkerRequest object itself.
     */
    public DppWorkerRequest withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the httpMethod property: The httpMethod property.
     *
     * @return the httpMethod value.
     */
    public String httpMethod() {
        return this.httpMethod;
    }

    /**
     * Set the httpMethod property: The httpMethod property.
     *
     * @param httpMethod the httpMethod value to set.
     * @return the DppWorkerRequest object itself.
     */
    public DppWorkerRequest withHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
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