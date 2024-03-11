package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://cloud.appwrite.io/v1";
        
        configuration.jWT  = "YOUR API KEY";
        
        configuration.locale  = "YOUR API KEY";
        
        configuration.project  = "YOUR API KEY";
        
        configuration.session  = "YOUR API KEY";
        AppwriteClient client = new AppwriteClient(configuration);
        assertNotNull(client);
    }
}
