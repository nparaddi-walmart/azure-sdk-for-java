// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for DataProtectionClient class. */
public interface DataProtectionClient {
    /**
     * Gets The subscription Id.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the BackupVaultsClient object to access its operations.
     *
     * @return the BackupVaultsClient object.
     */
    BackupVaultsClient getBackupVaults();

    /**
     * Gets the OperationResultsClient object to access its operations.
     *
     * @return the OperationResultsClient object.
     */
    OperationResultsClient getOperationResults();

    /**
     * Gets the OperationStatusClient object to access its operations.
     *
     * @return the OperationStatusClient object.
     */
    OperationStatusClient getOperationStatus();

    /**
     * Gets the BackupVaultOperationResultsClient object to access its operations.
     *
     * @return the BackupVaultOperationResultsClient object.
     */
    BackupVaultOperationResultsClient getBackupVaultOperationResults();

    /**
     * Gets the DataProtectionsClient object to access its operations.
     *
     * @return the DataProtectionsClient object.
     */
    DataProtectionsClient getDataProtections();

    /**
     * Gets the DataProtectionOperationsClient object to access its operations.
     *
     * @return the DataProtectionOperationsClient object.
     */
    DataProtectionOperationsClient getDataProtectionOperations();

    /**
     * Gets the BackupPoliciesClient object to access its operations.
     *
     * @return the BackupPoliciesClient object.
     */
    BackupPoliciesClient getBackupPolicies();

    /**
     * Gets the BackupInstancesClient object to access its operations.
     *
     * @return the BackupInstancesClient object.
     */
    BackupInstancesClient getBackupInstances();

    /**
     * Gets the RecoveryPointsClient object to access its operations.
     *
     * @return the RecoveryPointsClient object.
     */
    RecoveryPointsClient getRecoveryPoints();

    /**
     * Gets the JobsClient object to access its operations.
     *
     * @return the JobsClient object.
     */
    JobsClient getJobs();

    /**
     * Gets the RestorableTimeRangesClient object to access its operations.
     *
     * @return the RestorableTimeRangesClient object.
     */
    RestorableTimeRangesClient getRestorableTimeRanges();

    /**
     * Gets the ExportJobsClient object to access its operations.
     *
     * @return the ExportJobsClient object.
     */
    ExportJobsClient getExportJobs();

    /**
     * Gets the ExportJobsOperationResultsClient object to access its operations.
     *
     * @return the ExportJobsOperationResultsClient object.
     */
    ExportJobsOperationResultsClient getExportJobsOperationResults();

    /**
     * Gets the ResourceGuardsClient object to access its operations.
     *
     * @return the ResourceGuardsClient object.
     */
    ResourceGuardsClient getResourceGuards();
}