/**
 * eZmax API Definition
 * TODO Api description
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.Response1ObjectActivesessionGetCurrentAllOf;
import org.openapitools.client.model.ResponseGeneric;
import org.openapitools.client.model.SchemaGenericObjDebug;
import org.openapitools.client.model.SchemaGenericObjDebugPayload;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for the /1/object/activesession/getCurrent API Request.
 **/
@ApiModel(description = "Response for the /1/object/activesession/getCurrent API Request.")
public class Response1ObjectActivesessionGetCurrent {
  
  @SerializedName("pipi")
  private String pipi = null;
  @SerializedName("objDebugPayload")
  private SchemaGenericObjDebugPayload objDebugPayload = null;
  @SerializedName("objDebug")
  private SchemaGenericObjDebug objDebug = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPipi() {
    return pipi;
  }
  public void setPipi(String pipi) {
    this.pipi = pipi;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SchemaGenericObjDebugPayload getObjDebugPayload() {
    return objDebugPayload;
  }
  public void setObjDebugPayload(SchemaGenericObjDebugPayload objDebugPayload) {
    this.objDebugPayload = objDebugPayload;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SchemaGenericObjDebug getObjDebug() {
    return objDebug;
  }
  public void setObjDebug(SchemaGenericObjDebug objDebug) {
    this.objDebug = objDebug;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response1ObjectActivesessionGetCurrent response1ObjectActivesessionGetCurrent = (Response1ObjectActivesessionGetCurrent) o;
    return (this.pipi == null ? response1ObjectActivesessionGetCurrent.pipi == null : this.pipi.equals(response1ObjectActivesessionGetCurrent.pipi)) &&
        (this.objDebugPayload == null ? response1ObjectActivesessionGetCurrent.objDebugPayload == null : this.objDebugPayload.equals(response1ObjectActivesessionGetCurrent.objDebugPayload)) &&
        (this.objDebug == null ? response1ObjectActivesessionGetCurrent.objDebug == null : this.objDebug.equals(response1ObjectActivesessionGetCurrent.objDebug));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pipi == null ? 0: this.pipi.hashCode());
    result = 31 * result + (this.objDebugPayload == null ? 0: this.objDebugPayload.hashCode());
    result = 31 * result + (this.objDebug == null ? 0: this.objDebug.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response1ObjectActivesessionGetCurrent {\n");
    
    sb.append("  pipi: ").append(pipi).append("\n");
    sb.append("  objDebugPayload: ").append(objDebugPayload).append("\n");
    sb.append("  objDebug: ").append(objDebug).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}