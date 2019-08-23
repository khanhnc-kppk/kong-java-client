package com.github.vaibhavsinha.kong.model.admin.upstream;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * An object which referenced in Upstream's 'healthchecks' field
 */
@Data
public class Unhealthy {

  @SerializedName("http_statuses")
  private Integer[] httpStatuses;

  @SerializedName("tcp_failures")
  private Integer tcpFailures;

  @SerializedName("timeouts")
  private Integer timeouts;

  @SerializedName("http_failures")
  private Integer httpFailures;

  @SerializedName("interval")
  private Integer interval;

}
