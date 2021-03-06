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
package com.eucalyptus.tokens.common.msgs;

import com.eucalyptus.auth.policy.PolicySpec;
import com.eucalyptus.auth.policy.annotation.PolicyAction;
import com.eucalyptus.binding.HttpParameterMapping;

@PolicyAction( vendor = PolicySpec.VENDOR_STS, action = PolicySpec.STS_GETIMPERSONATIONTOKEN )
public class GetImpersonationTokenType extends TokenMessage {
  @HttpParameterMapping( parameter = "UserId" )
  private String impersonatedUserId;
  private String accountAlias;
  private String userName;
  private int durationSeconds;

  public String getImpersonatedUserId() {
    return impersonatedUserId;
  }

  public void setImpersonatedUserId( String impersonatedUserId ) {
    this.impersonatedUserId = impersonatedUserId;
  }

  public String getAccountAlias() {
    return accountAlias;
  }

  public void setAccountAlias( String accountAlias ) {
    this.accountAlias = accountAlias;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName( String userName ) {
    this.userName = userName;
  }

  public int getDurationSeconds() {
    return durationSeconds;
  }

  public void setDurationSeconds( int durationSeconds ) {
    this.durationSeconds = durationSeconds;
  }
}
