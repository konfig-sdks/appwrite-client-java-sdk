/*
 * Appwrite
 * Appwrite backend as a service cuts up to 70% of the time and costs required for building a modern application. We abstract and simplify common development tasks behind a REST APIs, to help you develop your app in a fast and secure way. For full API documentation and tutorials go to [https://appwrite.io/docs](https://appwrite.io/docs)
 *
 * The version of the OpenAPI document: 1.5.0
 * Contact: team@appwrite.io
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.MessagingAddNewSubscriberRequest;
import com.konfigthis.client.model.Subscriber;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class MessagingApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MessagingApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public MessagingApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getProject() == null) {
            throw new IllegalArgumentException("\"X-Appwrite-Project\" is required but no API key was provided. Please set \"X-Appwrite-Project\" with ApiClient#setProject(String).");
        }
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call addNewSubscriberCall(String topicId, MessagingAddNewSubscriberRequest messagingAddNewSubscriberRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = messagingAddNewSubscriberRequest;

        // create path and map variables
        String localVarPath = "/messaging/topics/{topicId}/subscribers"
            .replace("{" + "topicId" + "}", localVarApiClient.escapeString(topicId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT", "Project", "Session" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addNewSubscriberValidateBeforeCall(String topicId, MessagingAddNewSubscriberRequest messagingAddNewSubscriberRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new ApiException("Missing the required parameter 'topicId' when calling addNewSubscriber(Async)");
        }

        return addNewSubscriberCall(topicId, messagingAddNewSubscriberRequest, _callback);

    }


    private ApiResponse<Subscriber> addNewSubscriberWithHttpInfo(String topicId, MessagingAddNewSubscriberRequest messagingAddNewSubscriberRequest) throws ApiException {
        okhttp3.Call localVarCall = addNewSubscriberValidateBeforeCall(topicId, messagingAddNewSubscriberRequest, null);
        Type localVarReturnType = new TypeToken<Subscriber>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call addNewSubscriberAsync(String topicId, MessagingAddNewSubscriberRequest messagingAddNewSubscriberRequest, final ApiCallback<Subscriber> _callback) throws ApiException {

        okhttp3.Call localVarCall = addNewSubscriberValidateBeforeCall(topicId, messagingAddNewSubscriberRequest, _callback);
        Type localVarReturnType = new TypeToken<Subscriber>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class AddNewSubscriberRequestBuilder {
        private final String subscriberId;
        private final String targetId;
        private final String topicId;

        private AddNewSubscriberRequestBuilder(String subscriberId, String targetId, String topicId) {
            this.subscriberId = subscriberId;
            this.targetId = targetId;
            this.topicId = topicId;
        }

        /**
         * Build call for addNewSubscriber
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Subscriber </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            MessagingAddNewSubscriberRequest messagingAddNewSubscriberRequest = buildBodyParams();
            return addNewSubscriberCall(topicId, messagingAddNewSubscriberRequest, _callback);
        }

        private MessagingAddNewSubscriberRequest buildBodyParams() {
            MessagingAddNewSubscriberRequest messagingAddNewSubscriberRequest = new MessagingAddNewSubscriberRequest();
            messagingAddNewSubscriberRequest.subscriberId(this.subscriberId);
            messagingAddNewSubscriberRequest.targetId(this.targetId);
            return messagingAddNewSubscriberRequest;
        }

        /**
         * Execute addNewSubscriber request
         * @return Subscriber
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Subscriber </td><td>  -  </td></tr>
         </table>
         */
        public Subscriber execute() throws ApiException {
            MessagingAddNewSubscriberRequest messagingAddNewSubscriberRequest = buildBodyParams();
            ApiResponse<Subscriber> localVarResp = addNewSubscriberWithHttpInfo(topicId, messagingAddNewSubscriberRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute addNewSubscriber request with HTTP info returned
         * @return ApiResponse&lt;Subscriber&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Subscriber </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Subscriber> executeWithHttpInfo() throws ApiException {
            MessagingAddNewSubscriberRequest messagingAddNewSubscriberRequest = buildBodyParams();
            return addNewSubscriberWithHttpInfo(topicId, messagingAddNewSubscriberRequest);
        }

        /**
         * Execute addNewSubscriber request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Subscriber </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Subscriber> _callback) throws ApiException {
            MessagingAddNewSubscriberRequest messagingAddNewSubscriberRequest = buildBodyParams();
            return addNewSubscriberAsync(topicId, messagingAddNewSubscriberRequest, _callback);
        }
    }

    /**
     * Create subscriber
     * Create a new subscriber.
     * @param topicId Topic ID. The topic ID to subscribe to. (required)
     * @return AddNewSubscriberRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Subscriber </td><td>  -  </td></tr>
     </table>
     */
    public AddNewSubscriberRequestBuilder addNewSubscriber(String subscriberId, String targetId, String topicId) throws IllegalArgumentException {
        if (subscriberId == null) throw new IllegalArgumentException("\"subscriberId\" is required but got null");
            

        if (targetId == null) throw new IllegalArgumentException("\"targetId\" is required but got null");
            

        if (topicId == null) throw new IllegalArgumentException("\"topicId\" is required but got null");
            

        return new AddNewSubscriberRequestBuilder(subscriberId, targetId, topicId);
    }
    private okhttp3.Call deleteSubscriberByIdCall(String topicId, String subscriberId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/messaging/topics/{topicId}/subscribers/{subscriberId}"
            .replace("{" + "topicId" + "}", localVarApiClient.escapeString(topicId.toString()))
            .replace("{" + "subscriberId" + "}", localVarApiClient.escapeString(subscriberId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT", "Project", "Session" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteSubscriberByIdValidateBeforeCall(String topicId, String subscriberId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new ApiException("Missing the required parameter 'topicId' when calling deleteSubscriberById(Async)");
        }

        // verify the required parameter 'subscriberId' is set
        if (subscriberId == null) {
            throw new ApiException("Missing the required parameter 'subscriberId' when calling deleteSubscriberById(Async)");
        }

        return deleteSubscriberByIdCall(topicId, subscriberId, _callback);

    }


    private ApiResponse<Void> deleteSubscriberByIdWithHttpInfo(String topicId, String subscriberId) throws ApiException {
        okhttp3.Call localVarCall = deleteSubscriberByIdValidateBeforeCall(topicId, subscriberId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call deleteSubscriberByIdAsync(String topicId, String subscriberId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteSubscriberByIdValidateBeforeCall(topicId, subscriberId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class DeleteSubscriberByIdRequestBuilder {
        private final String topicId;
        private final String subscriberId;

        private DeleteSubscriberByIdRequestBuilder(String topicId, String subscriberId) {
            this.topicId = topicId;
            this.subscriberId = subscriberId;
        }

        /**
         * Build call for deleteSubscriberById
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteSubscriberByIdCall(topicId, subscriberId, _callback);
        }


        /**
         * Execute deleteSubscriberById request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            deleteSubscriberByIdWithHttpInfo(topicId, subscriberId);
        }

        /**
         * Execute deleteSubscriberById request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return deleteSubscriberByIdWithHttpInfo(topicId, subscriberId);
        }

        /**
         * Execute deleteSubscriberById request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return deleteSubscriberByIdAsync(topicId, subscriberId, _callback);
        }
    }

    /**
     * Delete subscriber
     * Delete a subscriber by its unique ID.
     * @param topicId Topic ID. The topic ID subscribed to. (required)
     * @param subscriberId Subscriber ID. (required)
     * @return DeleteSubscriberByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
     </table>
     */
    public DeleteSubscriberByIdRequestBuilder deleteSubscriberById(String topicId, String subscriberId) throws IllegalArgumentException {
        if (topicId == null) throw new IllegalArgumentException("\"topicId\" is required but got null");
            

        if (subscriberId == null) throw new IllegalArgumentException("\"subscriberId\" is required but got null");
            

        return new DeleteSubscriberByIdRequestBuilder(topicId, subscriberId);
    }
}
