package com.github.vaibhavsinha.kong.internal.admin;

import com.github.vaibhavsinha.kong.model.admin.plugin.EnabledPlugins;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by fanhua on 2017-08-05.
 */
public interface RetrofitPluginRepoService {

  //region Retrieve Enabled Plugins
  @GET("plugins/enabled")
  Call<EnabledPlugins> retrieveEnabledPlugins();
  //endregion

  //region Retrieve Plugin Schema
  @GET("plugins/schema/{pluginName}")
  Call<Object> retrievePluginSchema(@Path("pluginName") String pluginName);
  //endregion
}
