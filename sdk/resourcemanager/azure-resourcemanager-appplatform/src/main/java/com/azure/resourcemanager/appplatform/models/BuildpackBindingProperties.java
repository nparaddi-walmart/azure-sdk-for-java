// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a buildpack binding. */
@Fluent
public final class BuildpackBindingProperties {
    /*
     * Buildpack Binding Type
     */
    @JsonProperty(value = "bindingType")
    private BindingType bindingType;

    /*
     * State of the Buildpack Binding.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private BuildpackBindingProvisioningState provisioningState;

    /*
     * The object describes the buildpack binding launch properties
     */
    @JsonProperty(value = "launchProperties")
    private BuildpackBindingLaunchProperties launchProperties;

    /**
     * Get the bindingType property: Buildpack Binding Type.
     *
     * @return the bindingType value.
     */
    public BindingType bindingType() {
        return this.bindingType;
    }

    /**
     * Set the bindingType property: Buildpack Binding Type.
     *
     * @param bindingType the bindingType value to set.
     * @return the BuildpackBindingProperties object itself.
     */
    public BuildpackBindingProperties withBindingType(BindingType bindingType) {
        this.bindingType = bindingType;
        return this;
    }

    /**
     * Get the provisioningState property: State of the Buildpack Binding.
     *
     * @return the provisioningState value.
     */
    public BuildpackBindingProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the launchProperties property: The object describes the buildpack binding launch properties.
     *
     * @return the launchProperties value.
     */
    public BuildpackBindingLaunchProperties launchProperties() {
        return this.launchProperties;
    }

    /**
     * Set the launchProperties property: The object describes the buildpack binding launch properties.
     *
     * @param launchProperties the launchProperties value to set.
     * @return the BuildpackBindingProperties object itself.
     */
    public BuildpackBindingProperties withLaunchProperties(BuildpackBindingLaunchProperties launchProperties) {
        this.launchProperties = launchProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (launchProperties() != null) {
            launchProperties().validate();
        }
    }
}
