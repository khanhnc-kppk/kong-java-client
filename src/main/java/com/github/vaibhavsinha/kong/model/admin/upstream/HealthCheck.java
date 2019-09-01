package com.github.vaibhavsinha.kong.model.admin.upstream;

import lombok.Data;

@Data
public class HealthCheck {

  private Active active;

  private Passive passive;

  //region Active & Passive class
  @Data
  public static class Active {

    private Boolean httpsVerifyCertificate;
    private Unhealthy unhealthy;
    private String httpPath;
    private Integer timeout;
    private Healthy healthy;
    private String httpsSni;
    private Integer concurrency;
    private String type;

  }

  @Data
  public static class Passive {

    private Unhealthy unhealthy;
    private Healthy healthy;
    private String type;

  }
  //endregion

}
