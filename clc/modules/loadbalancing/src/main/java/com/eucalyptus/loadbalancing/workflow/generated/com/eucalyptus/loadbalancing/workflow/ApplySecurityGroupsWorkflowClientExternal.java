/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.eucalyptus.loadbalancing.workflow;

import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientExternal;

/**
 * Generated from {@link com.eucalyptus.loadbalancing.workflow.ApplySecurityGroupsWorkflow}. 
 * Used to start workflow executions or send signals from outside of the scope of a workflow.
 * Created through {@link ApplySecurityGroupsWorkflowClientExternalFactory#getClient}.
 * <p>
 * When starting child workflow from a parent workflow use {@link ApplySecurityGroupsWorkflowClient} instead.
 */
public interface ApplySecurityGroupsWorkflowClientExternal extends WorkflowClientExternal
{

    /**
     * Generated from {@link com.eucalyptus.loadbalancing.workflow.ApplySecurityGroupsWorkflow#applySecurityGroups}
     */
    void applySecurityGroups(String accountId, String loadbalancer, java.util.Map<java.lang.String,java.lang.String> groupIdToNameMap);

    /**
     * Generated from {@link com.eucalyptus.loadbalancing.workflow.ApplySecurityGroupsWorkflow#applySecurityGroups}
     */
    void applySecurityGroups(String accountId, String loadbalancer, java.util.Map<java.lang.String,java.lang.String> groupIdToNameMap, StartWorkflowOptions optionsOverride);

    /**
     * Generated from {@link com.eucalyptus.loadbalancing.workflow.ApplySecurityGroupsWorkflow#getState}
     */
    com.eucalyptus.loadbalancing.workflow.ElbWorkflowState getState() ;
}