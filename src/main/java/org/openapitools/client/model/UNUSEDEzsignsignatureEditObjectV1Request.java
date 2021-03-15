/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.35
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignsignatureRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for the /1/object/ezsignsignature/editObject API Request
 **/
@ApiModel(description = "Request for the /1/object/ezsignsignature/editObject API Request")
public class UNUSEDEzsignsignatureEditObjectV1Request {
  
  @SerializedName("objEzsignsignature")
  private EzsignsignatureRequest objEzsignsignature = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsignsignatureRequest getObjEzsignsignature() {
    return objEzsignsignature;
  }
  public void setObjEzsignsignature(EzsignsignatureRequest objEzsignsignature) {
    this.objEzsignsignature = objEzsignsignature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UNUSEDEzsignsignatureEditObjectV1Request uNUSEDEzsignsignatureEditObjectV1Request = (UNUSEDEzsignsignatureEditObjectV1Request) o;
    return (this.objEzsignsignature == null ? uNUSEDEzsignsignatureEditObjectV1Request.objEzsignsignature == null : this.objEzsignsignature.equals(uNUSEDEzsignsignatureEditObjectV1Request.objEzsignsignature));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignsignature == null ? 0: this.objEzsignsignature.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UNUSEDEzsignsignatureEditObjectV1Request {\n");
    
    sb.append("  objEzsignsignature: ").append(objEzsignsignature).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
