package com.konfigthis.client;

import com.konfigthis.client.api.AccountApi;
import com.konfigthis.client.api.AvatarsApi;
import com.konfigthis.client.api.DatabasesApi;
import com.konfigthis.client.api.FunctionsApi;
import com.konfigthis.client.api.GraphqlApi;
import com.konfigthis.client.api.LocaleApi;
import com.konfigthis.client.api.MessagingApi;
import com.konfigthis.client.api.StorageApi;
import com.konfigthis.client.api.TeamsApi;

public class AppwriteClient {
    private ApiClient apiClient;
    public final AccountApi account;
    public final AvatarsApi avatars;
    public final DatabasesApi databases;
    public final FunctionsApi functions;
    public final GraphqlApi graphql;
    public final LocaleApi locale;
    public final MessagingApi messaging;
    public final StorageApi storage;
    public final TeamsApi teams;

    public AppwriteClient() {
        this(null);
    }

    public AppwriteClient(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.account = new AccountApi(this.apiClient);
        this.avatars = new AvatarsApi(this.apiClient);
        this.databases = new DatabasesApi(this.apiClient);
        this.functions = new FunctionsApi(this.apiClient);
        this.graphql = new GraphqlApi(this.apiClient);
        this.locale = new LocaleApi(this.apiClient);
        this.messaging = new MessagingApi(this.apiClient);
        this.storage = new StorageApi(this.apiClient);
        this.teams = new TeamsApi(this.apiClient);
    }

}
