/*************************************************************************
 * Copyright 2009-2014 Ent. Services Development Corporation LP
 *
 * Redistribution and use of this software in source and binary forms,
 * with or without modification, are permitted provided that the
 * following conditions are met:
 *
 *   Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 *   Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer
 *   in the documentation and/or other materials provided with the
 *   distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 ************************************************************************/
package com.eucalyptus.cluster.common.msgs;

import java.util.Date;
import com.eucalyptus.compute.common.internal.vm.VmInstance;
import com.eucalyptus.compute.common.internal.vm.VmStandardVolumeAttachment;
import com.google.common.base.Function;
import edu.ucsb.eucalyptus.msgs.EucalyptusData;

public class AttachedVolume extends EucalyptusData implements Comparable<AttachedVolume> {

  private String volumeId;
  private String instanceId;
  private String device;
  private String remoteDevice;
  private String status;
  private Date attachTime = new Date( );

  public AttachedVolume( final String volumeId, final String instanceId, final String device, final String remoteDevice ) {
    this.volumeId = volumeId;
    this.instanceId = instanceId;
    this.device = device;
    this.remoteDevice = remoteDevice;
    this.status = "attaching";
  }

  public AttachedVolume( String volumeId ) {
    this.volumeId = volumeId;
  }

  public AttachedVolume( ) {
  }

  public static Function<AttachedVolume, VmStandardVolumeAttachment> toStandardVolumeAttachment( final VmInstance vm ) {
    return new Function<AttachedVolume, VmStandardVolumeAttachment>( ) {
      @Override
      public VmStandardVolumeAttachment apply( AttachedVolume vol ) {
        return new VmStandardVolumeAttachment( vm, vol.getVolumeId( ), vol.getDevice( ), vol.getRemoteDevice( ), vol.getStatus( ), vol.getAttachTime( ), false, Boolean.FALSE );
      }

    };
  }

  public boolean equals( final Object o ) {
    if ( this == o ) return true;
    if ( o == null || !getClass( ).equals( o.getClass( ) ) ) return false;
    AttachedVolume that = (AttachedVolume) o;
    return volumeId != null ? volumeId.equals( that.volumeId ) : that.volumeId == null;
  }

  public int hashCode( ) {
    return volumeId != null ? volumeId.hashCode( ) : 0;
  }

  public int compareTo( AttachedVolume that ) {
    return this.volumeId.compareTo( that.volumeId );
  }

  public String toString( ) {
    return "AttachedVolume " + volumeId + " " + instanceId + " " + status + " " + device + " " + remoteDevice + " " + String.valueOf( attachTime );
  }

  public String getVolumeId( ) {
    return volumeId;
  }

  public void setVolumeId( String volumeId ) {
    this.volumeId = volumeId;
  }

  public String getInstanceId( ) {
    return instanceId;
  }

  public void setInstanceId( String instanceId ) {
    this.instanceId = instanceId;
  }

  public String getDevice( ) {
    return device;
  }

  public void setDevice( String device ) {
    this.device = device;
  }

  public String getRemoteDevice( ) {
    return remoteDevice;
  }

  public void setRemoteDevice( String remoteDevice ) {
    this.remoteDevice = remoteDevice;
  }

  public String getStatus( ) {
    return status;
  }

  public void setStatus( String status ) {
    this.status = status;
  }

  public Date getAttachTime( ) {
    return attachTime;
  }

  public void setAttachTime( Date attachTime ) {
    this.attachTime = attachTime;
  }
}
