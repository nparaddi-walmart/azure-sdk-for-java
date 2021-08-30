// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.GalleryImageVersionPropertiesProvisioningState;
import com.azure.resourcemanager.compute.models.GalleryImageVersionPublishingProfile;
import com.azure.resourcemanager.compute.models.GalleryImageVersionStorageProfile;
import com.azure.resourcemanager.compute.models.ReplicationStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the properties of a gallery image version. */
@Fluent
public final class GalleryImageVersionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryImageVersionProperties.class);

    /*
     * The publishing profile of a gallery image Version.
     */
    @JsonProperty(value = "publishingProfile")
    private GalleryImageVersionPublishingProfile publishingProfile;

    /*
     * The current state of the gallery image version. The provisioning state,
     * which only appears in the response.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private GalleryImageVersionPropertiesProvisioningState provisioningState;

    /*
     * This is the storage profile of a Gallery Image Version.
     */
    @JsonProperty(value = "storageProfile", required = true)
    private GalleryImageVersionStorageProfile storageProfile;

    /*
     * This is the replication status of the gallery image version.
     */
    @JsonProperty(value = "replicationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicationStatus replicationStatus;

    /**
     * Get the publishingProfile property: The publishing profile of a gallery image Version.
     *
     * @return the publishingProfile value.
     */
    public GalleryImageVersionPublishingProfile publishingProfile() {
        return this.publishingProfile;
    }

    /**
     * Set the publishingProfile property: The publishing profile of a gallery image Version.
     *
     * @param publishingProfile the publishingProfile value to set.
     * @return the GalleryImageVersionProperties object itself.
     */
    public GalleryImageVersionProperties withPublishingProfile(GalleryImageVersionPublishingProfile publishingProfile) {
        this.publishingProfile = publishingProfile;
        return this;
    }

    /**
     * Get the provisioningState property: The current state of the gallery image version. The provisioning state, which
     * only appears in the response.
     *
     * @return the provisioningState value.
     */
    public GalleryImageVersionPropertiesProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the storageProfile property: This is the storage profile of a Gallery Image Version.
     *
     * @return the storageProfile value.
     */
    public GalleryImageVersionStorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: This is the storage profile of a Gallery Image Version.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the GalleryImageVersionProperties object itself.
     */
    public GalleryImageVersionProperties withStorageProfile(GalleryImageVersionStorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the replicationStatus property: This is the replication status of the gallery image version.
     *
     * @return the replicationStatus value.
     */
    public ReplicationStatus replicationStatus() {
        return this.replicationStatus;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publishingProfile() != null) {
            publishingProfile().validate();
        }
        if (storageProfile() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property storageProfile in model GalleryImageVersionProperties"));
        } else {
            storageProfile().validate();
        }
        if (replicationStatus() != null) {
            replicationStatus().validate();
        }
    }
}