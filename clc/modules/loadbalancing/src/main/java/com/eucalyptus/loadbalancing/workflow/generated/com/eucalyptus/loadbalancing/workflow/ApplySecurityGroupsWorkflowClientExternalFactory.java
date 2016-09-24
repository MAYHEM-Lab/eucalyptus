/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.eucalyptus.loadbalancing.workflow;

import com.amazonaws.services.simpleworkflow.flow.WorkflowClientFactoryExternal;

/**
 * Generated from {@link com.eucalyptus.loadbalancing.workflow.ApplySecurityGroupsWorkflow}. 
 * Used to create external workflow client used to start workflow executions or send signals from outside of the scope of a workflow.
 * <p>
 * When starting child workflow from a parent workflow use {@link ApplySecurityGroupsWorkflowClientFactory} instead.
 */
public interface ApplySecurityGroupsWorkflowClientExternalFactory extends WorkflowClientFactoryExternal<ApplySecurityGroupsWorkflowClientExternal> {

}