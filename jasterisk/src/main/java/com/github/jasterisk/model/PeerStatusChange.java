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
import com.github.jasterisk.model.Endpoint;
import com.github.jasterisk.model.Peer;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The state of a peer associated with an endpoint has changed.
 */
@ApiModel(description = "The state of a peer associated with an endpoint has changed.")

public class PeerStatusChange {
  @SerializedName("endpoint")
  private Endpoint endpoint = null;

  @SerializedName("peer")
  private Peer peer = null;

  public PeerStatusChange endpoint(Endpoint endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @ApiModelProperty(required = true, value = "")
  public Endpoint getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(Endpoint endpoint) {
    this.endpoint = endpoint;
  }

  public PeerStatusChange peer(Peer peer) {
    this.peer = peer;
    return this;
  }

   /**
   * Get peer
   * @return peer
  **/
  @ApiModelProperty(required = true, value = "")
  public Peer getPeer() {
    return peer;
  }

  public void setPeer(Peer peer) {
    this.peer = peer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeerStatusChange peerStatusChange = (PeerStatusChange) o;
    return Objects.equals(this.endpoint, peerStatusChange.endpoint) &&
        Objects.equals(this.peer, peerStatusChange.peer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoint, peer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeerStatusChange {\n");
    
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    peer: ").append(toIndentedString(peer)).append("\n");
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

