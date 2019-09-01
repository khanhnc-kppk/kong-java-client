package com.github.vaibhavsinha.kong.model.admin.upstream;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Data;

/**
 * Created by vaibhav on 13/06/17.
 *
 * Updated by tsingye on 2019-08-27.
 */
@Data
public class Upstream {

  @SerializedName("id")
  private String id;

  /**
   * The number of slots in the loadbalancer algorithm (10-65536). Defaults to 10000.
   */
  @SerializedName("slots")
  private Integer slots;
  /**
   * This is a hostname, which must be equal to the host of a Service.
   */
  @SerializedName("name")
  private String name;

  @SerializedName("orderlist")
  @Deprecated
  private List<Integer> orderList;

  @SerializedName("created_at")
  private Long createdAt;

  /**
   * Which load balancing algorithm to use. One of: round-robin, consistent-hashing, or
   * least-connections. Defaults to "round-robin".
   */
  @SerializedName("algorithm")
  private String algorithm;

  /**
   * What to use as hashing input: none (resulting in a weighted-round-robin scheme with no
   * hashing), consumer, ip, header, or cookie. Defaults to "none".
   */
  @SerializedName("hash_on")
  private String hashOn;

  /**
   * What to use as hashing input if the primary hash_on does not return a hash (eg. header is
   * missing, or no consumer identified). One of: none, consumer, ip, header, or cookie. Not
   * available if hash_on is set to cookie. Defaults to "none".
   */
  @SerializedName("hash_fallback")
  private String hashFallback;

  /**
   * The header name to take the value from as hash input. Only required when hash_on is set to
   * header.
   */
  @SerializedName("hash_on_header")
  private String hashOnHeader;

  /**
   * The header name to take the value from as hash input. Only required when hash_fallback is set
   * to header.
   */
  @SerializedName("hash_fallback_header")
  private String hashFallbackHeader;

  /**
   * The cookie name to take the value from as hash input. Only required when hash_on or
   * hash_fallback is set to cookie. If the specified cookie is not in the request, Kong will
   * generate a value and set the cookie in the response.
   */
  @SerializedName("hash_on_cookie")
  private String hashOnCookie;

  /**
   * The cookie path to set in the response headers. Only required when hash_on or hash_fallback is
   * set to cookie. Defaults to "/".
   */
  @SerializedName("hash_on_cookie_path")
  private String hashOnCookiePath;

  @SerializedName("healthchecks")
  private HealthCheck healthChecks;

  /**
   * An optional set of strings associated with the Upstream, for grouping and filtering.
   */
  @SerializedName("tags")
  private String[] tags;

}
