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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Detailed information about a remote peer that communicates with Asterisk.
 */
@ApiModel(description = "Detailed information about a remote peer that communicates with Asterisk.")

public class Peer {
  @SerializedName("peer_status")
  private String peerStatus = null;

  @SerializedName("cause")
  private String cause = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("port")
  private String port = null;

  @SerializedName("time")
  private String time = null;

  public Peer peerStatus(String peerStatus) {
    this.peerStatus = peerStatus;
    return this;
  }

   /**
   * The current state of the peer. Note that the values of the status are dependent on the underlying peer technology.
   * @return peerStatus
  **/
  @ApiModelProperty(required = true, value = "The current state of the peer. Note that the values of the status are dependent on the underlying peer technology.")
  public String getPeerStatus() {
    return peerStatus;
  }

  public void setPeerStatus(String peerStatus) {
    this.peerStatus = peerStatus;
  }

  public Peer cause(String cause) {
    this.cause = cause;
    return this;
  }

   /**
   * An optional reason associated with the change in peer_status.
   * @return cause
  **/
  @ApiModelProperty(value = "An optional reason associated with the change in peer_status.")
  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

  public Peer address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The IP address of the peer.
   * @return address
  **/
  @ApiModelProperty(value = "The IP address of the peer.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Peer port(String port) {
    this.port = port;
    return this;
  }

   /**
   * The port of the peer.
   * @return port
  **/
  @ApiModelProperty(value = "The port of the peer.")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public Peer time(String time) {
    this.time = time;
    return this;
  }

   /**
   * The last known time the peer was contacted.
   * @return time
  **/
  @ApiModelProperty(value = "The last known time the peer was contacted.")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Peer peer = (Peer) o;
    return Objects.equals(this.peerStatus, peer.peerStatus) &&
        Objects.equals(this.cause, peer.cause) &&
        Objects.equals(this.address, peer.address) &&
        Objects.equals(this.port, peer.port) &&
        Objects.equals(this.time, peer.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(peerStatus, cause, address, port, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Peer {\n");
    
    sb.append("    peerStatus: ").append(toIndentedString(peerStatus)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
