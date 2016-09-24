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
 * Generated from {@link com.eucalyptus.loadbalancing.workflow.CreateLoadBalancerListenersWorkflow}. 
 * Used to start workflow executions or send signals from outside of the scope of a workflow.
 * Created through {@link CreateLoadBalancerListenersWorkflowClientExternalFactory#getClient}.
 * <p>
 * When starting child workflow from a parent workflow use {@link CreateLoadBalancerListenersWorkflowClient} instead.
 */
public interface CreateLoadBalancerListenersWorkflowClientExternal extends WorkflowClientExternal
{

    /**
     * Generated from {@link com.eucalyptus.loadbalancing.workflow.CreateLoadBalancerListenersWorkflow#createLoadBalancerListeners}
     */
    void createLoadBalancerListeners(String accountId, String loadbalancer, com.eucalyptus.loadbalancing.common.msgs.Listener[] listeners);

    /**
     * Generated from {@link com.eucalyptus.loadbalancing.workflow.CreateLoadBalancerListenersWorkflow#createLoadBalancerListeners}
     */
    void createLoadBalancerListeners(String accountId, String loadbalancer, com.eucalyptus.loadbalancing.common.msgs.Listener[] listeners, StartWorkflowOptions optionsOverride);

    /**
     * Generated from {@link com.eucalyptus.loadbalancing.workflow.CreateLoadBalancerListenersWorkflow#getState}
     */
    com.eucalyptus.loadbalancing.workflow.ElbWorkflowState getState() ;
}