/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.eucalyptus.loadbalancing.workflow;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowSelfClient;

/**
 * Generated from {@link com.eucalyptus.loadbalancing.workflow.DisableAvailabilityZoneWorkflow}. 
 * Used to continue a workflow execution as a new run.
 * Must be used from a worklfow scope. 
 */
public interface DisableAvailabilityZoneWorkflowSelfClient extends WorkflowSelfClient
{

    /**
     * Generated from {@link com.eucalyptus.loadbalancing.workflow.DisableAvailabilityZoneWorkflow#disableAvailabilityZone}
     */
    void disableAvailabilityZone(String accountId, String loadbalancer, java.util.List<java.lang.String> availabilityZones);

    /**
     * Generated from {@link com.eucalyptus.loadbalancing.workflow.DisableAvailabilityZoneWorkflow#disableAvailabilityZone}
     */
    void disableAvailabilityZone(String accountId, String loadbalancer, java.util.List<java.lang.String> availabilityZones, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.loadbalancing.workflow.DisableAvailabilityZoneWorkflow#disableAvailabilityZone}
     */
    void disableAvailabilityZone(String accountId, String loadbalancer, java.util.List<java.lang.String> availabilityZones, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.loadbalancing.workflow.DisableAvailabilityZoneWorkflow#disableAvailabilityZone}
     */
    void disableAvailabilityZone(Promise<String> accountId, Promise<String> loadbalancer, Promise<java.util.List<java.lang.String>> availabilityZones);

    /**
     * Generated from {@link com.eucalyptus.loadbalancing.workflow.DisableAvailabilityZoneWorkflow#disableAvailabilityZone}
     */
    void disableAvailabilityZone(Promise<String> accountId, Promise<String> loadbalancer, Promise<java.util.List<java.lang.String>> availabilityZones, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.loadbalancing.workflow.DisableAvailabilityZoneWorkflow#disableAvailabilityZone}
     */
    void disableAvailabilityZone(Promise<String> accountId, Promise<String> loadbalancer, Promise<java.util.List<java.lang.String>> availabilityZones, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);
}