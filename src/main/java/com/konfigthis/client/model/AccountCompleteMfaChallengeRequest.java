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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * AccountCompleteMfaChallengeRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AccountCompleteMfaChallengeRequest {
  public static final String SERIALIZED_NAME_CHALLENGE_ID = "challengeId";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_ID)
  private String challengeId;

  public static final String SERIALIZED_NAME_OTP = "otp";
  @SerializedName(SERIALIZED_NAME_OTP)
  private String otp;

  public AccountCompleteMfaChallengeRequest() {
  }

  public AccountCompleteMfaChallengeRequest challengeId(String challengeId) {
    
    
    
    
    this.challengeId = challengeId;
    return this;
  }

   /**
   * ID of the challenge.
   * @return challengeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID of the challenge.")

  public String getChallengeId() {
    return challengeId;
  }


  public void setChallengeId(String challengeId) {
    
    
    
    this.challengeId = challengeId;
  }


  public AccountCompleteMfaChallengeRequest otp(String otp) {
    
    
    
    
    this.otp = otp;
    return this;
  }

   /**
   * Valid verification token.
   * @return otp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Valid verification token.")

  public String getOtp() {
    return otp;
  }


  public void setOtp(String otp) {
    
    
    
    this.otp = otp;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AccountCompleteMfaChallengeRequest instance itself
   */
  public AccountCompleteMfaChallengeRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCompleteMfaChallengeRequest accountCompleteMfaChallengeRequest = (AccountCompleteMfaChallengeRequest) o;
    return Objects.equals(this.challengeId, accountCompleteMfaChallengeRequest.challengeId) &&
        Objects.equals(this.otp, accountCompleteMfaChallengeRequest.otp)&&
        Objects.equals(this.additionalProperties, accountCompleteMfaChallengeRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeId, otp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCompleteMfaChallengeRequest {\n");
    sb.append("    challengeId: ").append(toIndentedString(challengeId)).append("\n");
    sb.append("    otp: ").append(toIndentedString(otp)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("challengeId");
    openapiFields.add("otp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("challengeId");
    openapiRequiredFields.add("otp");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountCompleteMfaChallengeRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccountCompleteMfaChallengeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountCompleteMfaChallengeRequest is not found in the empty JSON string", AccountCompleteMfaChallengeRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccountCompleteMfaChallengeRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("challengeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `challengeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("challengeId").toString()));
      }
      if (!jsonObj.get("otp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `otp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("otp").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountCompleteMfaChallengeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountCompleteMfaChallengeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountCompleteMfaChallengeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountCompleteMfaChallengeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountCompleteMfaChallengeRequest>() {
           @Override
           public void write(JsonWriter out, AccountCompleteMfaChallengeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountCompleteMfaChallengeRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AccountCompleteMfaChallengeRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountCompleteMfaChallengeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountCompleteMfaChallengeRequest
  * @throws IOException if the JSON string is invalid with respect to AccountCompleteMfaChallengeRequest
  */
  public static AccountCompleteMfaChallengeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountCompleteMfaChallengeRequest.class);
  }

 /**
  * Convert an instance of AccountCompleteMfaChallengeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

