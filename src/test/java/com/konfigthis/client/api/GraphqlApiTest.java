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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GraphqlApi
 */
@Disabled
public class GraphqlApiTest {

    private static GraphqlApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new GraphqlApi(apiClient);
    }

    /**
     * GraphQL endpoint
     *
     * Execute a GraphQL mutation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void executeMutationTest() throws ApiException {
        Map<String, Object> response = api.executeMutation()
                .execute();
        // TODO: test validations
    }

    /**
     * GraphQL endpoint
     *
     * Execute a GraphQL mutation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void executeMutationOperationTest() throws ApiException {
        Map<String, Object> response = api.executeMutationOperation()
                .execute();
        // TODO: test validations
    }

}
