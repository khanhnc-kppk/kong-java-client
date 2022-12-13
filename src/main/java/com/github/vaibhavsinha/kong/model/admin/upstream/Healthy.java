package com.github.vaibhavsinha.kong.model.admin.upstream;

import com.google.gson.annotations.SerializedName;

public class Healthy {

  @SerializedName("http_statuses")
  private Integer[] httpStatuses;

  @SerializedName("interval")
  private Integer interval;

  @SerializedName("successes")
  private Integer successes;

}
