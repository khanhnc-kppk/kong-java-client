package com.github.vaibhavsinha.kong.model.admin.service;

import com.github.vaibhavsinha.kong.model.common.IdObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Since;
import lombok.Data;

/**
 * new version of Kong deprecated API objects, use SERVICE and ROUTE object instead
 */
@Data
public class Service {

  @SerializedName("id")
  private String id;

  @SerializedName("created_at")
  private Long createdAt;

  @SerializedName("updated_at")
  private Long updatedAt;

  @SerializedName("name")
  private String name;

  @SerializedName("retries")
  private Integer retries;

  @SerializedName("protocol")
  private String protocol;

  @SerializedName("host")
  private String host;

  @SerializedName("port")
  private Integer port;

  @SerializedName("path")
  private String path;

  @SerializedName("connect_timeout")
  private Integer connectTimeout;

  @SerializedName("write_timeout")
  private Integer writeTimeout;

  @SerializedName("read_timeout")
  private Integer readTimeout;

  @SerializedName("tags")
  private String[] tags;

  @Since(1.3)
  @SerializedName("client_certificate")
  private IdObject clientCertificate;

}
