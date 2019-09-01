package com.github.vaibhavsinha.kong.model.admin.plugin;

import com.github.vaibhavsinha.kong.model.common.IdObject;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Created by vaibhav on 13/06/17.
 * <p>
 * You can add a plugin in four different ways:
 *  For every API and Consumer. Don't set api_id and consumer_id.
 *  For every API and a specific Consumer. Only set consumer_id.
 *  For every Consumer and a specific API. Only set api_id.
 *  For a specific Consumer and API. Set both api_id and consumer_id.
 * Note that not all plugins allow to specify consumer_id. Check the plugin documentation.
 * </p>
 * Updated by tsingye on 2019-08-27.
 *
 * For current version (Kong 1.3.x), we use 'service' and 'route' to define APIs. Here is Kong's
 * documents about plugin below.
 *
 * <p>
 * A plugin will always be run once and only once per request. But the configuration with which it
 * will run depends on the entities it has been configured for.
 *
 * Plugins can be configured for various entities, combination of entities, or even globally. This
 * is useful, for example, when you wish to configure a plugin a certain way for most requests, but
 * make authenticated requests behave slightly differently.
 *
 * Therefore, there exists an order of precedence for running a plugin when it has been applied to
 * different entities with different configurations. The rule of thumb is: the more specific a
 * plugin is with regards to how many entities it has been configured on, the higher its priority.
 *
 * The complete order of precedence when a plugin has been configured multiple times is:
 * </p>
 * <ul>
 * <li>
 *   Plugins configured on a combination of: a Route, a Service, and a Consumer. (Consumer means the request must be authenticated).
 * </li>
 * <li>
 *   Plugins configured on a combination of a Route and a Consumer. (Consumer means the request must be authenticated).
 * </li>
 * <li>
 *   Plugins configured on a combination of a Service and a Consumer. (Consumer means the request must be authenticated).
 * </li>
 * <li>
 *   Plugins configured on a combination of a Route and a Service.
 * </li>
 * <li>
 *   Plugins configured on a Consumer. (Consumer means the request must be authenticated).
 * </li>
 * <li>
 *   Plugins configured on a Route.
 * </li>
 * <li>
 *   Plugins configured on a Service.
 * </li>
 * <li>
 *   Plugins configured to run globally.
 * </li>
 * </ul>
 */
@Data
public class Plugin {

  @SerializedName("id")
  private String id;

  @SerializedName("api_id")
  @Deprecated
  private String apiId;

  @SerializedName("consumer_id")
  @Deprecated
  private String consumerId;

  @SerializedName("name")
  private String name;    //must

  @SerializedName("config")
  private Object config;  //must

  @SerializedName("enabled")
  private Boolean enabled;

  @SerializedName("created_at")
  private Long createdAt;

  @SerializedName("route")
  private IdObject route;

  @SerializedName("service")
  private IdObject service;

  @SerializedName("consumer")
  private IdObject consumer;

  @SerializedName("run_on")
  private String runOn;

  @SerializedName("protocols")
  private String[] protocols;

  @SerializedName("tags")
  private String[] tags;
}
