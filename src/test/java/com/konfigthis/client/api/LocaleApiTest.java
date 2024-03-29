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
import com.konfigthis.client.model.ContinentList;
import com.konfigthis.client.model.CountryList;
import com.konfigthis.client.model.CurrencyList;
import com.konfigthis.client.model.LanguageList;
import com.konfigthis.client.model.Locale;
import com.konfigthis.client.model.LocaleCodeList;
import com.konfigthis.client.model.PhoneList;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocaleApi
 */
@Disabled
public class LocaleApiTest {

    private static LocaleApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new LocaleApi(apiClient);
    }

    /**
     * List currencies
     *
     * List of all currencies, including currency symbol, name, plural, and decimal digits for all major and minor currencies. You can use the locale header to get the data in a supported language.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrenciesTest() throws ApiException {
        CurrencyList response = api.getCurrencies()
                .execute();
        // TODO: test validations
    }

    /**
     * List EU countries
     *
     * List of all countries that are currently members of the EU. You can use the locale header to get the data in a supported language.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEUCountriesTest() throws ApiException {
        CountryList response = api.getEUCountries()
                .execute();
        // TODO: test validations
    }

    /**
     * Get user locale
     *
     * Get the current user location based on IP. Returns an object with user country code, country name, continent name, continent code, ip address and suggested currency. You can use the locale header to get the data in a supported language.  ([IP Geolocation by DB-IP](https://db-ip.com))
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserLocaleTest() throws ApiException {
        Locale response = api.getUserLocale()
                .execute();
        // TODO: test validations
    }

    /**
     * List Locale Codes
     *
     * List of all locale codes in [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCodesTest() throws ApiException {
        LocaleCodeList response = api.listCodes()
                .execute();
        // TODO: test validations
    }

    /**
     * List continents
     *
     * List of all continents. You can use the locale header to get the data in a supported language.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listContinentsTest() throws ApiException {
        ContinentList response = api.listContinents()
                .execute();
        // TODO: test validations
    }

    /**
     * List countries
     *
     * List of all countries. You can use the locale header to get the data in a supported language.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCountriesTest() throws ApiException {
        CountryList response = api.listCountries()
                .execute();
        // TODO: test validations
    }

    /**
     * List countries phone codes
     *
     * List of all countries phone codes. You can use the locale header to get the data in a supported language.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCountriesPhonesTest() throws ApiException {
        PhoneList response = api.listCountriesPhones()
                .execute();
        // TODO: test validations
    }

    /**
     * List languages
     *
     * List of all languages classified by ISO 639-1 including 2-letter code, name in English, and name in the respective language.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listLanguagesTest() throws ApiException {
        LanguageList response = api.listLanguages()
                .execute();
        // TODO: test validations
    }

}
