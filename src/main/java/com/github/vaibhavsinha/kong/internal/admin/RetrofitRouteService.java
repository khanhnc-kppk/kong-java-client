package com.github.vaibhavsinha.kong.internal.admin;

import com.github.vaibhavsinha.kong.model.admin.route.Route;
import com.github.vaibhavsinha.kong.model.admin.route.RouteList;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitRouteService {

  //region Add Route
  @POST("routes")
  Call<Route> createRoute(@Body Route route);

  @POST("services/{serviceNameOrId}/routes")
  Call<Route> createRouteAssociatedToSpecificService(
      @Path("serviceNameOrId") String serviceNameOrId, @Body Route route);
  //endregion

  //region List Routes
  @GET("routes")
  Call<RouteList> listAllRoutes();
  @GET("routes")
  Call<RouteList> listAllRoutes(@Query("size") Integer size);
  @GET("routes")
  Call<RouteList> listAllRoutes(@Query("size") Integer size, @Query("offset") String offset);
  @GET("services/{serviceNameOrId}/routes")
  Call<RouteList> listRoutes(@Path("serviceNameOrId") String serviceNameOrId);
  @GET("services/{serviceNameOrId}/routes")
  Call<RouteList> listRoutes(@Path("serviceNameOrId") String serviceNameOrId,
      @Query("size") Integer size, @Query("offset") String offset);
  //endregion

  //region Retrieve Route
  @GET("routes/{routeNameOrId}")
  Call<Route> retrieveRoute(@Path("routeNameOrId") String routeNameOrId);

  @GET("plugins/{pluginId}/route")
  Call<Route> retrieveRouteAssociatedToSpecificPlugin(@Path("pluginId") String pluginId);
  //endregion

  //region Update Route
  @PATCH("routes/{routeNameOrId}")
  Call<Route> updateRoute(@Path("routeNameOrId") String routeNameOrId, @Body Route route);

  @PATCH("plugins/{pluginId}/route")
  Call<Route> updateRouteAssociatedToSpecificPlugin(@Path("pluginId") String pluginId,
      @Body Route route);
  //endregion

  //region Update Or Create Route
  @PUT("routes/{routeNameOrId}")
  Call<Route> createOrUpdateRoute(@Path("routeNameOrId") String routeNameOrId, @Body Route route);

  @PUT("plugins/{pluginId}/route")
  Call<Route> createOrUpdateRouteAssociatedToSpecificPlugin(@Path("pluginId") String pluginId,
      @Body Route route);
  //endregion

  //region Delete Route
  @DELETE("routes/{routeNameOrId}")
  Call<Void> deleteRoute(@Path("routeNameOrId") String routeNameOrId);
  //endregion

}
