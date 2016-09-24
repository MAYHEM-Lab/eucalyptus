/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.eucalyptus.loadbalancing.workflow;

import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientBase;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

class EnableAvailabilityZoneWorkflowClientImpl extends WorkflowClientBase implements EnableAvailabilityZoneWorkflowClient {

    public EnableAvailabilityZoneWorkflowClientImpl(WorkflowExecution workflowExecution, WorkflowType workflowType,  
            StartWorkflowOptions options, DataConverter dataConverter, GenericWorkflowClient genericClient) {
        super(workflowExecution, workflowType, options, dataConverter, genericClient);
    }
    
    @Override
    public final Promise<Void> enableAvailabilityZone(String accountId, String loadbalancer, java.util.List<java.lang.String> availabilityZones, java.util.Map<java.lang.String,java.lang.String> zoneToSubnetIdMap) { 
        return enableAvailabilityZone(Promise.asPromise(accountId), Promise.asPromise(loadbalancer), Promise.asPromise(availabilityZones), Promise.asPromise(zoneToSubnetIdMap), (StartWorkflowOptions)null);
    }
    
    @Override
    public final Promise<Void> enableAvailabilityZone(String accountId, String loadbalancer, java.util.List<java.lang.String> availabilityZones, java.util.Map<java.lang.String,java.lang.String> zoneToSubnetIdMap, Promise<?>... waitFor) {
        return enableAvailabilityZone(Promise.asPromise(accountId), Promise.asPromise(loadbalancer), Promise.asPromise(availabilityZones), Promise.asPromise(zoneToSubnetIdMap), (StartWorkflowOptions)null, waitFor);
    }
    
    
    @Override
    
    public final Promise<Void> enableAvailabilityZone(String accountId, String loadbalancer, java.util.List<java.lang.String> availabilityZones, java.util.Map<java.lang.String,java.lang.String> zoneToSubnetIdMap, StartWorkflowOptions optionsOverride, Promise<?>... waitFor) {
        return enableAvailabilityZone(Promise.asPromise(accountId), Promise.asPromise(loadbalancer), Promise.asPromise(availabilityZones), Promise.asPromise(zoneToSubnetIdMap), optionsOverride, waitFor);
    }

    @Override
    public final Promise<Void> enableAvailabilityZone(Promise<String> accountId, Promise<String> loadbalancer, Promise<java.util.List<java.lang.String>> availabilityZones, Promise<java.util.Map<java.lang.String,java.lang.String>> zoneToSubnetIdMap) {
        return enableAvailabilityZone(accountId, loadbalancer, availabilityZones, zoneToSubnetIdMap, (StartWorkflowOptions)null);
    }

    @Override
    public final Promise<Void> enableAvailabilityZone(Promise<String> accountId, Promise<String> loadbalancer, Promise<java.util.List<java.lang.String>> availabilityZones, Promise<java.util.Map<java.lang.String,java.lang.String>> zoneToSubnetIdMap, Promise<?>... waitFor) {
        return enableAvailabilityZone(accountId, loadbalancer, availabilityZones, zoneToSubnetIdMap, (StartWorkflowOptions)null, waitFor);
    }

    @Override
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public final Promise<Void> enableAvailabilityZone(Promise<String> accountId, Promise<String> loadbalancer, Promise<java.util.List<java.lang.String>> availabilityZones, Promise<java.util.Map<java.lang.String,java.lang.String>> zoneToSubnetIdMap, StartWorkflowOptions optionsOverride, Promise<?>... waitFor) {
        Promise[] _input_ = new Promise[4];
        _input_[0] = accountId;
        _input_[1] = loadbalancer;
        _input_[2] = availabilityZones;
        _input_[3] = zoneToSubnetIdMap;
        return (Promise) startWorkflowExecution(_input_, optionsOverride, Void.class, waitFor);
    }
    	

}