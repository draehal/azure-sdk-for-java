/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.network.TopologyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Topology of the specified resource group.
 */
public class TopologyInner {
    /**
     * GUID representing the operation id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The datetime when the topology was initially created for the resource
     * group.
     */
    @JsonProperty(value = "createdDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdDateTime;

    /**
     * The datetime when the topology was last modified.
     */
    @JsonProperty(value = "lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModified;

    /**
     * The resources property.
     */
    @JsonProperty(value = "resources")
    private List<TopologyResource> resources;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the createdDateTime value.
     *
     * @return the createdDateTime value
     */
    public DateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Get the lastModified value.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Get the resources value.
     *
     * @return the resources value
     */
    public List<TopologyResource> resources() {
        return this.resources;
    }

    /**
     * Set the resources value.
     *
     * @param resources the resources value to set
     * @return the TopologyInner object itself.
     */
    public TopologyInner withResources(List<TopologyResource> resources) {
        this.resources = resources;
        return this;
    }

}
