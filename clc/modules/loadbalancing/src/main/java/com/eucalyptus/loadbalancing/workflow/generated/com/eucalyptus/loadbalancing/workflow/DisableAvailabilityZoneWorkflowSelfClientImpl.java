/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.eucalyptus.loadbalancing.workflow;

import com.amazonaws.services.simpleworkflow.flow.core.AndPromise;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Task;
import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowSelfClientBase;
import com.amazonaws.services.simpleworkflow.flow.generic.ContinueAsNewWorkflowExecutionParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;

public class DisableAvailabilityZoneWorkflowSelfClientImpl extends WorkflowSelfClientBase implements DisableAvailabilityZoneWorkflowSelfClient {

    public DisableAvailabilityZoneWorkflowSelfClientImpl() {
        this(null, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }

    public DisableAvailabilityZoneWorkflowSelfClientImpl(GenericWorkflowClient genericClient) {
        this(genericClient, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }

    public DisableAvailabilityZoneWorkflowSelfClientImpl(GenericWorkflowClient genericClient, 
            DataConverter dataConverter, StartWorkflowOptions schedulingOptions) {
            
        super(genericClient, dataConverter, schedulingOptions);
    }

    @Override
    public final void disableAvailabilityZone(String accountId, String loadbalancer, java.util.List<java.lang.String> availabilityZones) { 
        disableAvailabilityZoneImpl(Promise.asPromise(accountId), Promise.asPromise(loadbalancer), Promise.asPromise(availabilityZones), (StartWorkflowOptions)null);
    }

    @Override
    public final void disableAvailabilityZone(String accountId, String loadbalancer, java.util.List<java.lang.String> availabilityZones, Promise<?>... waitFor) { 
        disableAvailabilityZoneImpl(Promise.asPromise(accountId), Promise.asPromise(loadbalancer), Promise.asPromise(availabilityZones), (StartWorkflowOptions)null, waitFor);
    }
    
    @Override
    public final void disableAvailabilityZone(String accountId, String loadbalancer, java.util.List<java.lang.String> availabilityZones, StartWorkflowOptions optionsOverride, Promise<?>... waitFor) {
        disableAvailabilityZoneImpl(Promise.asPromise(accountId), Promise.asPromise(loadbalancer), Promise.asPromise(availabilityZones), optionsOverride, waitFor);
    }
    
    @Override
    public final void disableAvailabilityZone(Promise<String> accountId, Promise<String> loadbalancer, Promise<java.util.List<java.lang.String>> availabilityZones) {
        disableAvailabilityZoneImpl(accountId, loadbalancer, availabilityZones, (StartWorkflowOptions)null);
    }

    @Override
    public final void disableAvailabilityZone(Promise<String> accountId, Promise<String> loadbalancer, Promise<java.util.List<java.lang.String>> availabilityZones, Promise<?>... waitFor) {
        disableAvailabilityZoneImpl(accountId, loadbalancer, availabilityZones, (StartWorkflowOptions)null, waitFor);
    }

    @Override
    public final void disableAvailabilityZone(Promise<String> accountId, Promise<String> loadbalancer, Promise<java.util.List<java.lang.String>> availabilityZones, StartWorkflowOptions optionsOverride, Promise<?>... waitFor) {
        disableAvailabilityZoneImpl(accountId, loadbalancer, availabilityZones, optionsOverride, waitFor);
    }
    
    protected void disableAvailabilityZoneImpl(final Promise<String> accountId, final Promise<String> loadbalancer, final Promise<java.util.List<java.lang.String>> availabilityZones, final StartWorkflowOptions schedulingOptionsOverride, Promise<?>... waitFor) {
        new Task(new Promise[] { accountId, loadbalancer, availabilityZones, new AndPromise(waitFor) }) {
    		@Override
			protected void doExecute() throws Throwable {
                ContinueAsNewWorkflowExecutionParameters _parameters_ = new ContinueAsNewWorkflowExecutionParameters();
                Object[] _input_ = new Object[3];
                _input_[0] = accountId.get();
                _input_[1] = loadbalancer.get();
                _input_[2] = availabilityZones.get();
                String _stringInput_ = dataConverter.toData(_input_);
				_parameters_.setInput(_stringInput_);
				_parameters_ = _parameters_.createContinueAsNewParametersFromOptions(schedulingOptions, schedulingOptionsOverride);
                
                if (genericClient == null) {
                    genericClient = decisionContextProvider.getDecisionContext().getWorkflowClient();
                }
                genericClient.continueAsNewOnCompletion(_parameters_);
			}
		};
    }
}