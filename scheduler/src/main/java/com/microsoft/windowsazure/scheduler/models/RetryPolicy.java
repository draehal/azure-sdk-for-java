/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.scheduler.models;

import javax.xml.datatype.Duration;

/**
 * Retry Policy for the job action.
 */
public class RetryPolicy
{
    private Integer retryCount;

    /**
     * Number of times a retry should be attempted.
     */
    public Integer getRetryCount()
    {
        return this.retryCount;
    }

    /**
     * Number of times a retry should be attempted.
     */
    public void setRetryCount(Integer retryCount)
    {
        this.retryCount = retryCount;
    }

    private Duration retryInterval;

    /**
     * The interval between retries.
     */
    public Duration getRetryInterval()
    {
        return this.retryInterval;
    }

    /**
     * The interval between retries.
     */
    public void setRetryInterval(Duration retryInterval)
    {
        this.retryInterval = retryInterval;
    }

    private RetryType retryType;

    /**
     * The Retry Type of the Retry Policy. Can be either Fixed or None.
     */
    public RetryType getRetryType()
    {
        return this.retryType;
    }

    /**
     * The Retry Type of the Retry Policy. Can be either Fixed or None.
     */
    public void setRetryType(RetryType retryType)
    {
        this.retryType = retryType;
    }

    /**
     * Initializes a new instance of the RetryPolicy class.
     * 
     */
    public RetryPolicy()
    {
    }
}