/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The result of the ServiceFabric runtime versions.
 */
@JsonFlatten
public class ClusterCodeVersionsResultInner {
    /**
     * The identification of the result.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The name of the result.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The result resource type.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The ServiceFabric runtime version of the cluster.
     */
    @JsonProperty(value = "properties.codeVersion")
    private String codeVersion;

    /**
     * The date of expiry of support of the version.
     */
    @JsonProperty(value = "properties.supportExpiryUtc")
    private String supportExpiryUtc;

    /**
     * Cluster operating system. Possible values include: 'Windows', 'Linux'.
     */
    @JsonProperty(value = "properties.environment")
    private String environment;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ClusterCodeVersionsResultInner object itself.
     */
    public ClusterCodeVersionsResultInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ClusterCodeVersionsResultInner object itself.
     */
    public ClusterCodeVersionsResultInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the ClusterCodeVersionsResultInner object itself.
     */
    public ClusterCodeVersionsResultInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the codeVersion value.
     *
     * @return the codeVersion value
     */
    public String codeVersion() {
        return this.codeVersion;
    }

    /**
     * Set the codeVersion value.
     *
     * @param codeVersion the codeVersion value to set
     * @return the ClusterCodeVersionsResultInner object itself.
     */
    public ClusterCodeVersionsResultInner withCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }

    /**
     * Get the supportExpiryUtc value.
     *
     * @return the supportExpiryUtc value
     */
    public String supportExpiryUtc() {
        return this.supportExpiryUtc;
    }

    /**
     * Set the supportExpiryUtc value.
     *
     * @param supportExpiryUtc the supportExpiryUtc value to set
     * @return the ClusterCodeVersionsResultInner object itself.
     */
    public ClusterCodeVersionsResultInner withSupportExpiryUtc(String supportExpiryUtc) {
        this.supportExpiryUtc = supportExpiryUtc;
        return this;
    }

    /**
     * Get the environment value.
     *
     * @return the environment value
     */
    public String environment() {
        return this.environment;
    }

    /**
     * Set the environment value.
     *
     * @param environment the environment value to set
     * @return the ClusterCodeVersionsResultInner object itself.
     */
    public ClusterCodeVersionsResultInner withEnvironment(String environment) {
        this.environment = environment;
        return this;
    }

}
