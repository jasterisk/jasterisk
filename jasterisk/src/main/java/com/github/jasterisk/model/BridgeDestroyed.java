/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.jasterisk.model;

import java.util.Objects;
import com.github.jasterisk.model.Bridge;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Notification that a bridge has been destroyed.
 */
@ApiModel(description = "Notification that a bridge has been destroyed.")

public class BridgeDestroyed {
  @SerializedName("bridge")
  private Bridge bridge = null;

  public BridgeDestroyed bridge(Bridge bridge) {
    this.bridge = bridge;
    return this;
  }

   /**
   * Get bridge
   * @return bridge
  **/
  @ApiModelProperty(required = true, value = "")
  public Bridge getBridge() {
    return bridge;
  }

  public void setBridge(Bridge bridge) {
    this.bridge = bridge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BridgeDestroyed bridgeDestroyed = (BridgeDestroyed) o;
    return Objects.equals(this.bridge, bridgeDestroyed.bridge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bridge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BridgeDestroyed {\n");
    
    sb.append("    bridge: ").append(toIndentedString(bridge)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

