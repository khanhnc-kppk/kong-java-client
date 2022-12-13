package com.github.vaibhavsinha.kong.model.admin.route;

import com.github.vaibhavsinha.kong.model.common.IdObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Since;
import lombok.Data;

@Data
public class Route {

  @SerializedName("id")
  private String id;

  @SerializedName("created_at")
  private Long createdAt;

  @SerializedName("updated_at")
  private Long updatedAt;

  @SerializedName("name")
  private String name;

  @SerializedName("protocols")
  private String[] protocols;

  @SerializedName("methods")
  private String[] methods;

  @SerializedName("hosts")
  private String[] hosts;

  @SerializedName("paths")
  private String[] paths;

  @Since(1.3)
  @SerializedName("headers") // sometimes array, sometimes map
  private Object headers;

  @SerializedName("https_redirect_status_code") // one of  426, 301, 302, 307, 308, default 426
  private String httpsRedirectStatusCode;

  @SerializedName("regex_priority")
  private Integer regexPriority; // 0

  @SerializedName("strip_path")
  private Boolean stripPath; // true

  @SerializedName("preserve_host")
  private Boolean preserveHost; // false

  @SerializedName("tags")
  private String[] tags;

  @SerializedName("service")  // should be a map
  private IdObject service; // like "service":{"id":"<service_id>"} when using JSON

}
