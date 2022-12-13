package com.github.vaibhavsinha.kong.internal.admin;

import com.github.vaibhavsinha.kong.model.admin.service.Service;
import com.github.vaibhavsinha.kong.model.admin.service.ServiceList;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * some API of '/services'
 */
public interface RetrofitServiceService {

  //region Add Service
  @POST("services")
  Call<Service> createService(@Body Service service);
  //endregion

  //region List Services
  @GET("services")
  Call<ServiceList> listAllService();
  @GET("services")
  Call<ServiceList> listAllService(@Query("size") Integer size);
  @GET("services")
  Call<ServiceList> listAllService(@Query("size") Integer size, @Query("offset") String offset);
  //endregion

  //region Retrieve Service
  @GET("services/{nameOrId}")
  Call<Service> retrieveService(@Path("nameOrId") String serviceNameOrId);

  @GET("routes/{routeNameOrId}/service")
  Call<Service> retrieveServiceAssociatedToSpecificRoute(
      @Path("routeNameOrId") String routeNameOrId);

  @GET("plugins/{pluginId}/service")
  Call<Service> retrieveServiceAssociatedToSpecificPlugin(@Path("pluginId") String pluginId);
  //endregion

  //region Update Service
  @PATCH("services/{nameOrId}")
  Call<Service> updateService(@Path("nameOrId") String serviceNameOrId, @Body Service service);

  @PATCH("routes/{routeNameOrId}/service")
  Call<Service> updateServiceAssociatedToSpecificRoute(@Path("routeNameOrId") String routeNameOrId,
      @Body Service service);

  @PATCH("plugins/{pluginId}/service")
  Call<Service> updateServiceAssociatedToSpecificPlugin(@Path("pluginId") String pluginId,
      @Body Service service);
  //endregion

  //region Delete Service
  @DELETE("services/{nameOrId}")
  Call<Void> deleteService(String serviceNameOrId);

  @DELETE("routes/{routeNameOrId}/service")
  Call<Void> deleteServiceToSpecificRoute(String routeNameOrId);
  //endregion

}
