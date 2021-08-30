// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the load balancer backend addresses. */
@Fluent
public final class LoadBalancerBackendAddressPropertiesFormat {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LoadBalancerBackendAddressPropertiesFormat.class);

    /*
     * Reference to an existing virtual network.
     */
    @JsonProperty(value = "virtualNetwork")
    private SubResource virtualNetwork;

    /*
     * Reference to an existing subnet.
     */
    @JsonProperty(value = "subnet")
    private SubResource subnet;

    /*
     * IP Address belonging to the referenced virtual network.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /*
     * Reference to IP address defined in network interfaces.
     */
    @JsonProperty(value = "networkInterfaceIPConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource networkInterfaceIpConfiguration;

    /*
     * Reference to the frontend ip address configuration defined in regional
     * loadbalancer.
     */
    @JsonProperty(value = "loadBalancerFrontendIPConfiguration")
    private SubResource loadBalancerFrontendIpConfiguration;

    /**
     * Get the virtualNetwork property: Reference to an existing virtual network.
     *
     * @return the virtualNetwork value.
     */
    public SubResource virtualNetwork() {
        return this.virtualNetwork;
    }

    /**
     * Set the virtualNetwork property: Reference to an existing virtual network.
     *
     * @param virtualNetwork the virtualNetwork value to set.
     * @return the LoadBalancerBackendAddressPropertiesFormat object itself.
     */
    public LoadBalancerBackendAddressPropertiesFormat withVirtualNetwork(SubResource virtualNetwork) {
        this.virtualNetwork = virtualNetwork;
        return this;
    }

    /**
     * Get the subnet property: Reference to an existing subnet.
     *
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Reference to an existing subnet.
     *
     * @param subnet the subnet value to set.
     * @return the LoadBalancerBackendAddressPropertiesFormat object itself.
     */
    public LoadBalancerBackendAddressPropertiesFormat withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the ipAddress property: IP Address belonging to the referenced virtual network.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: IP Address belonging to the referenced virtual network.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the LoadBalancerBackendAddressPropertiesFormat object itself.
     */
    public LoadBalancerBackendAddressPropertiesFormat withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the networkInterfaceIpConfiguration property: Reference to IP address defined in network interfaces.
     *
     * @return the networkInterfaceIpConfiguration value.
     */
    public SubResource networkInterfaceIpConfiguration() {
        return this.networkInterfaceIpConfiguration;
    }

    /**
     * Get the loadBalancerFrontendIpConfiguration property: Reference to the frontend ip address configuration defined
     * in regional loadbalancer.
     *
     * @return the loadBalancerFrontendIpConfiguration value.
     */
    public SubResource loadBalancerFrontendIpConfiguration() {
        return this.loadBalancerFrontendIpConfiguration;
    }

    /**
     * Set the loadBalancerFrontendIpConfiguration property: Reference to the frontend ip address configuration defined
     * in regional loadbalancer.
     *
     * @param loadBalancerFrontendIpConfiguration the loadBalancerFrontendIpConfiguration value to set.
     * @return the LoadBalancerBackendAddressPropertiesFormat object itself.
     */
    public LoadBalancerBackendAddressPropertiesFormat withLoadBalancerFrontendIpConfiguration(
        SubResource loadBalancerFrontendIpConfiguration) {
        this.loadBalancerFrontendIpConfiguration = loadBalancerFrontendIpConfiguration;
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