// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Class encapsulating restore target parameters. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("RestoreTargetInfo")
@Fluent
public final class RestoreTargetInfo extends RestoreTargetInfoBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestoreTargetInfo.class);

    /*
     * Datasource Information of target DS
     */
    @JsonProperty(value = "datasourceInfo", required = true)
    private Datasource datasourceInfo;

    /*
     * DatasourceSet Information of target DS Set
     */
    @JsonProperty(value = "datasourceSetInfo")
    private DatasourceSet datasourceSetInfo;

    /*
     * Credentials to use to authenticate with data source provider.
     */
    @JsonProperty(value = "datasourceAuthCredentials")
    private AuthCredentials datasourceAuthCredentials;

    /**
     * Get the datasourceInfo property: Datasource Information of target DS.
     *
     * @return the datasourceInfo value.
     */
    public Datasource datasourceInfo() {
        return this.datasourceInfo;
    }

    /**
     * Set the datasourceInfo property: Datasource Information of target DS.
     *
     * @param datasourceInfo the datasourceInfo value to set.
     * @return the RestoreTargetInfo object itself.
     */
    public RestoreTargetInfo withDatasourceInfo(Datasource datasourceInfo) {
        this.datasourceInfo = datasourceInfo;
        return this;
    }

    /**
     * Get the datasourceSetInfo property: DatasourceSet Information of target DS Set.
     *
     * @return the datasourceSetInfo value.
     */
    public DatasourceSet datasourceSetInfo() {
        return this.datasourceSetInfo;
    }

    /**
     * Set the datasourceSetInfo property: DatasourceSet Information of target DS Set.
     *
     * @param datasourceSetInfo the datasourceSetInfo value to set.
     * @return the RestoreTargetInfo object itself.
     */
    public RestoreTargetInfo withDatasourceSetInfo(DatasourceSet datasourceSetInfo) {
        this.datasourceSetInfo = datasourceSetInfo;
        return this;
    }

    /**
     * Get the datasourceAuthCredentials property: Credentials to use to authenticate with data source provider.
     *
     * @return the datasourceAuthCredentials value.
     */
    public AuthCredentials datasourceAuthCredentials() {
        return this.datasourceAuthCredentials;
    }

    /**
     * Set the datasourceAuthCredentials property: Credentials to use to authenticate with data source provider.
     *
     * @param datasourceAuthCredentials the datasourceAuthCredentials value to set.
     * @return the RestoreTargetInfo object itself.
     */
    public RestoreTargetInfo withDatasourceAuthCredentials(AuthCredentials datasourceAuthCredentials) {
        this.datasourceAuthCredentials = datasourceAuthCredentials;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestoreTargetInfo withRecoveryOption(RecoveryOption recoveryOption) {
        super.withRecoveryOption(recoveryOption);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestoreTargetInfo withRestoreLocation(String restoreLocation) {
        super.withRestoreLocation(restoreLocation);
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
        if (datasourceInfo() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property datasourceInfo in model RestoreTargetInfo"));
        } else {
            datasourceInfo().validate();
        }
        if (datasourceSetInfo() != null) {
            datasourceSetInfo().validate();
        }
        if (datasourceAuthCredentials() != null) {
            datasourceAuthCredentials().validate();
        }
    }
}