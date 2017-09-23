/*************************************************************************
 * (c) Copyright 2017 Hewlett Packard Enterprise Development Company LP
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 ************************************************************************/
package com.eucalyptus.loadbalancing.common.msgs;

public class DisableAvailabilityZonesForLoadBalancerResponseType extends LoadBalancingMessage {

  private DisableAvailabilityZonesForLoadBalancerResult disableAvailabilityZonesForLoadBalancerResult = new DisableAvailabilityZonesForLoadBalancerResult( );
  private ResponseMetadata responseMetadata = new ResponseMetadata( );

  public DisableAvailabilityZonesForLoadBalancerResponseType( ) {
  }

  public DisableAvailabilityZonesForLoadBalancerResult getDisableAvailabilityZonesForLoadBalancerResult( ) {
    return disableAvailabilityZonesForLoadBalancerResult;
  }

  public void setDisableAvailabilityZonesForLoadBalancerResult( DisableAvailabilityZonesForLoadBalancerResult disableAvailabilityZonesForLoadBalancerResult ) {
    this.disableAvailabilityZonesForLoadBalancerResult = disableAvailabilityZonesForLoadBalancerResult;
  }

  public ResponseMetadata getResponseMetadata( ) {
    return responseMetadata;
  }

  public void setResponseMetadata( ResponseMetadata responseMetadata ) {
    this.responseMetadata = responseMetadata;
  }
}
