// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.KeyVaultContractProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties of the Certificate contract. */
@Fluent
public final class CertificateContractProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CertificateContractProperties.class);

    /*
     * Subject attribute of the certificate.
     */
    @JsonProperty(value = "subject", required = true)
    private String subject;

    /*
     * Thumbprint of the certificate.
     */
    @JsonProperty(value = "thumbprint", required = true)
    private String thumbprint;

    /*
     * Expiration date of the certificate. The date conforms to the following
     * format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     */
    @JsonProperty(value = "expirationDate", required = true)
    private OffsetDateTime expirationDate;

    /*
     * KeyVault location details of the certificate.
     */
    @JsonProperty(value = "keyVault")
    private KeyVaultContractProperties keyVault;

    /**
     * Get the subject property: Subject attribute of the certificate.
     *
     * @return the subject value.
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Set the subject property: Subject attribute of the certificate.
     *
     * @param subject the subject value to set.
     * @return the CertificateContractProperties object itself.
     */
    public CertificateContractProperties withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get the thumbprint property: Thumbprint of the certificate.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: Thumbprint of the certificate.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the CertificateContractProperties object itself.
     */
    public CertificateContractProperties withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the expirationDate property: Expiration date of the certificate. The date conforms to the following format:
     * `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Set the expirationDate property: Expiration date of the certificate. The date conforms to the following format:
     * `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @param expirationDate the expirationDate value to set.
     * @return the CertificateContractProperties object itself.
     */
    public CertificateContractProperties withExpirationDate(OffsetDateTime expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * Get the keyVault property: KeyVault location details of the certificate.
     *
     * @return the keyVault value.
     */
    public KeyVaultContractProperties keyVault() {
        return this.keyVault;
    }

    /**
     * Set the keyVault property: KeyVault location details of the certificate.
     *
     * @param keyVault the keyVault value to set.
     * @return the CertificateContractProperties object itself.
     */
    public CertificateContractProperties withKeyVault(KeyVaultContractProperties keyVault) {
        this.keyVault = keyVault;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subject() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property subject in model CertificateContractProperties"));
        }
        if (thumbprint() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property thumbprint in model CertificateContractProperties"));
        }
        if (expirationDate() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property expirationDate in model CertificateContractProperties"));
        }
        if (keyVault() != null) {
            keyVault().validate();
        }
    }
}