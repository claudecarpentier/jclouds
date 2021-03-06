/**
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jclouds.vcloud.director.v1_5.features;

import java.net.URI;

import javax.ws.rs.PUT;

import org.jclouds.io.Payload;
import org.jclouds.rest.annotations.EndpointParam;
import org.jclouds.rest.annotations.RequestFilters;
import org.jclouds.vcloud.director.v1_5.filters.AddVCloudAuthorizationAndCookieToRequest;

import com.google.common.util.concurrent.ListenableFuture;

/**
 * @see UploadApi
 * @author danikov
 */
@RequestFilters(AddVCloudAuthorizationAndCookieToRequest.class)
public interface UploadAsyncApi {

   /**
    * @see UploadApi#put
    */
   @PUT
   ListenableFuture<Void> upload(@EndpointParam URI location, Payload payload);
}
