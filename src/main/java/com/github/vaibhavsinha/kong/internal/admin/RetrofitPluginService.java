package com.github.vaibhavsinha.kong.internal.admin;


import com.github.vaibhavsinha.kong.model.admin.plugin.Plugin;
import com.github.vaibhavsinha.kong.model.admin.plugin.PluginList;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by vaibhav on 12/06/17.
 *
 * Updated by fanhua on 2017-08-05.
 *
 * Updated by tsingye on 2019-08-27.
 */
public interface RetrofitPluginService {

  //region Add Plugin
  @POST("plugins/")
  Call<Plugin> createPlugin(@Body Plugin request);

  @POST("routes/{routeId}/plugins")
  Call<Plugin> createPluginAssociatedToSpecificRoute(@Path("routeId") String routeId,
      @Body Plugin request);

  @POST("services/{serviceId}/plugins")
  Call<Plugin> createPluginAssociatedToSpecificService(@Path("serviceId") String serviceId,
      @Body Plugin request);

  @POST("consumers/{consumerId}/plugins")
  Call<Plugin> createPluginAssociatedToSpecificConsumer(@Path("consumerId") String consumerId,
      @Body Plugin request);
  //endregion

  //region List Plugins
  @GET("plugins")
  Call<PluginList> listAllPlugins(@Query("size") Integer size, @Query("offset") String offset);

  @GET("routes/{routeId}/plugins")
  Call<PluginList> listPluginsAssociatedToSpecificRoute(@Path("routeId") String routeId);

  @GET("services/{serviceId}/plugins")
  Call<PluginList> listPluginsAssociatedToSpecificService(@Path("") String serviceId);

  @GET("consumers/{consumerId}/plugins")
  Call<PluginList> listPluginsAssociatedToSpecificConsumer(@Path("consumerId") String consumerId);
  //endregion

  //region Retrieve Plugin
  @GET("plugins/{pluginId}")
  Call<Plugin> retrievePlugin(@Path("pluginId") String pluginId);
  //endregion

  //region Update Plugin
  @PATCH("plugins/{pluginId}")
  Call<Plugin> updatePlugin(@Path("pluginId") String pluginId, @Body Plugin request);
  //endregion

  //region Update Or Create Plugin
  @PUT("plugins/{pluginId}")
  Call<Plugin> createOrUpdatePlugin(@Path("pluginId") String pluginId, @Body Plugin request);
  //endregion

  //region Delete Plugin
  @DELETE("plugins/{id}")
  Call<Void> deletePlugin(@Path("id") String nameOrId);
  //endregion

}
