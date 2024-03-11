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
import com.konfigthis.client.model.DatabasesCreateDocumentRequest;
import com.konfigthis.client.model.DatabasesUpdateDocumentByIdRequest;
import com.konfigthis.client.model.Document;
import com.konfigthis.client.model.DocumentList;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DatabasesApi
 */
@Disabled
public class DatabasesApiTest {

    private static DatabasesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DatabasesApi(apiClient);
    }

    /**
     * Create document
     *
     * Create a new Document. Before using this route, you should create a new collection resource using either a [server integration](https://appwrite.io/docs/server/databases#databasesCreateCollection) API or directly from your database console.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createDocumentTest() throws ApiException {
        String documentId = null;
        Object data = null;
        String databaseId = null;
        String collectionId = null;
        List<String> permissions = null;
        Document response = api.createDocument(documentId, data, databaseId, collectionId)
                .permissions(permissions)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete document
     *
     * Delete a document by its unique ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDocumentByIdTest() throws ApiException {
        String databaseId = null;
        String collectionId = null;
        String documentId = null;
        api.deleteDocumentById(databaseId, collectionId, documentId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get document
     *
     * Get a document by its unique ID. This endpoint response returns a JSON object with the document data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDocumentByIdTest() throws ApiException {
        String databaseId = null;
        String collectionId = null;
        String documentId = null;
        List<String> queries = null;
        Document response = api.getDocumentById(databaseId, collectionId, documentId)
                .queries(queries)
                .execute();
        // TODO: test validations
    }

    /**
     * List documents
     *
     * Get a list of all the user&#39;s documents in a given collection. You can use the query params to filter your results.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserDocumentsTest() throws ApiException {
        String databaseId = null;
        String collectionId = null;
        List<String> queries = null;
        DocumentList response = api.listUserDocuments(databaseId, collectionId)
                .queries(queries)
                .execute();
        // TODO: test validations
    }

    /**
     * Update document
     *
     * Update a document by its unique ID. Using the patch method you can pass only specific fields that will get updated.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDocumentByIdTest() throws ApiException {
        String databaseId = null;
        String collectionId = null;
        String documentId = null;
        Object data = null;
        List<String> permissions = null;
        Document response = api.updateDocumentById(databaseId, collectionId, documentId)
                .data(data)
                .permissions(permissions)
                .execute();
        // TODO: test validations
    }

}