package com.github.vaibhavsinha.kong.model.admin.upstream;

import lombok.Data;

@Data
public class HealthStatus {

  private Long createdAt;

  private String id;

  private String health;

  private String target;

  private String upstreamId;

  private Integer weight;

}
