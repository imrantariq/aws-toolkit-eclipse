/*
 * Copyright 2011-2012 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.eclipse.core.regions;

import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * Metadata for an AWS region, including it's name, unique ID and what services
 * are available.
 */
public interface Region {

    /**
     * The display name for this region. This is the value that should be shown
     * in UIs when this region is used.
     *
     * @return The display name for this region.
     */
    String getName();

    /**
     * The unique system ID for this region; ex: us-east-1.
     *
     * @return The unique system ID for this region.
     */
    String getId();

    /**
     * Returns a map of the available services in this region and their
     * endpoints. The keys of the map are service abbreviations, as defined in
     * {@link ServiceAbbreviations}, and the values are the endpoint URLs.
     *
     * @return A map of the available services in this region.
     */
    Map<String, String> getServiceEndpoints();

    /**
     * Returns the endpoint for the service given.
     *
     * @see ServiceAbbreviations
     */
    String getServiceEndpoint(String serviceName);

    /**
     * Returns whether the given service is supported in this region.
     *
     * @see ServiceAbbreviations
     */
    boolean isServiceSupported(String serviceName);

    /**
     * Returns the relative path to a small flag icon representing this region.
     */
    String getFlagIconPath();

    /**
     * Returns the image for this region's flag.
     */
    Image getFlagImage();

    /**
     * Returns the flag's image descriptor.
     */
    ImageDescriptor getFlagImageDescriptor();
}
