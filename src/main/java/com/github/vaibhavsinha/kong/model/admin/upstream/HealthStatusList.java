package com.github.vaibhavsinha.kong.model.admin.upstream;

import java.util.List;
import lombok.Data;

@Data
public class HealthStatusList {

  private Integer total;

  private String nodeId;

  private List<HealthStatus> data;

}
