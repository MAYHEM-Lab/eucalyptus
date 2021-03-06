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
package com.eucalyptus.cloudformation.resources.standard.propertytypes;

import java.util.Objects;
import com.eucalyptus.cloudformation.resources.annotations.Property;
import com.eucalyptus.cloudformation.resources.annotations.Required;
import com.google.common.base.MoreObjects;

public class AutoScalingTag {

  @Property
  @Required
  private String key;

  @Property
  @Required
  private String value;

  @Property
  @Required
  private Boolean propagateAtLaunch;

  public String getKey( ) {
    return key;
  }

  public void setKey( String key ) {
    this.key = key;
  }

  public Boolean getPropagateAtLaunch( ) {
    return propagateAtLaunch;
  }

  public void setPropagateAtLaunch( Boolean propagateAtLaunch ) {
    this.propagateAtLaunch = propagateAtLaunch;
  }

  public String getValue( ) {
    return value;
  }

  public void setValue( String value ) {
    this.value = value;
  }

  @Override
  public boolean equals( final Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    final AutoScalingTag that = (AutoScalingTag) o;
    return Objects.equals( getKey( ), that.getKey( ) ) &&
        Objects.equals( getValue( ), that.getValue( ) ) &&
        Objects.equals( getPropagateAtLaunch( ), that.getPropagateAtLaunch( ) );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( getKey( ), getValue( ), getPropagateAtLaunch( ) );
  }

  @Override
  public String toString( ) {
    return MoreObjects.toStringHelper( this )
        .add( "key", key )
        .add( "value", value )
        .add( "propagateAtLaunch", propagateAtLaunch )
        .toString( );
  }
}
