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
 * AlgoScryptModified
 */
@ApiModel(description = "AlgoScryptModified")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AlgoScryptModified {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_SALT = "salt";
  @SerializedName(SERIALIZED_NAME_SALT)
  private String salt;

  public static final String SERIALIZED_NAME_SALT_SEPARATOR = "saltSeparator";
  @SerializedName(SERIALIZED_NAME_SALT_SEPARATOR)
  private String saltSeparator;

  public static final String SERIALIZED_NAME_SIGNER_KEY = "signerKey";
  @SerializedName(SERIALIZED_NAME_SIGNER_KEY)
  private String signerKey;

  public AlgoScryptModified() {
  }

  public AlgoScryptModified type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Algo type.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Algo type.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public AlgoScryptModified salt(String salt) {
    
    
    
    
    this.salt = salt;
    return this;
  }

   /**
   * Salt used to compute hash.
   * @return salt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Salt used to compute hash.")

  public String getSalt() {
    return salt;
  }


  public void setSalt(String salt) {
    
    
    
    this.salt = salt;
  }


  public AlgoScryptModified saltSeparator(String saltSeparator) {
    
    
    
    
    this.saltSeparator = saltSeparator;
    return this;
  }

   /**
   * Separator used to compute hash.
   * @return saltSeparator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Separator used to compute hash.")

  public String getSaltSeparator() {
    return saltSeparator;
  }


  public void setSaltSeparator(String saltSeparator) {
    
    
    
    this.saltSeparator = saltSeparator;
  }


  public AlgoScryptModified signerKey(String signerKey) {
    
    
    
    
    this.signerKey = signerKey;
    return this;
  }

   /**
   * Key used to compute hash.
   * @return signerKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Key used to compute hash.")

  public String getSignerKey() {
    return signerKey;
  }


  public void setSignerKey(String signerKey) {
    
    
    
    this.signerKey = signerKey;
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
   * @return the AlgoScryptModified instance itself
   */
  public AlgoScryptModified putAdditionalProperty(String key, Object value) {
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
    AlgoScryptModified algoScryptModified = (AlgoScryptModified) o;
    return Objects.equals(this.type, algoScryptModified.type) &&
        Objects.equals(this.salt, algoScryptModified.salt) &&
        Objects.equals(this.saltSeparator, algoScryptModified.saltSeparator) &&
        Objects.equals(this.signerKey, algoScryptModified.signerKey)&&
        Objects.equals(this.additionalProperties, algoScryptModified.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, salt, saltSeparator, signerKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlgoScryptModified {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    salt: ").append(toIndentedString(salt)).append("\n");
    sb.append("    saltSeparator: ").append(toIndentedString(saltSeparator)).append("\n");
    sb.append("    signerKey: ").append(toIndentedString(signerKey)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("salt");
    openapiFields.add("saltSeparator");
    openapiFields.add("signerKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("salt");
    openapiRequiredFields.add("saltSeparator");
    openapiRequiredFields.add("signerKey");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlgoScryptModified
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AlgoScryptModified.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlgoScryptModified is not found in the empty JSON string", AlgoScryptModified.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AlgoScryptModified.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("salt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salt").toString()));
      }
      if (!jsonObj.get("saltSeparator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `saltSeparator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("saltSeparator").toString()));
      }
      if (!jsonObj.get("signerKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signerKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signerKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlgoScryptModified.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlgoScryptModified' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlgoScryptModified> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlgoScryptModified.class));

       return (TypeAdapter<T>) new TypeAdapter<AlgoScryptModified>() {
           @Override
           public void write(JsonWriter out, AlgoScryptModified value) throws IOException {
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
           public AlgoScryptModified read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlgoScryptModified instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlgoScryptModified given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlgoScryptModified
  * @throws IOException if the JSON string is invalid with respect to AlgoScryptModified
  */
  public static AlgoScryptModified fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlgoScryptModified.class);
  }

 /**
  * Convert an instance of AlgoScryptModified to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

