package com.github.vaibhavsinha.kong.internal.admin;

import com.github.vaibhavsinha.kong.model.admin.upstream.HealthStatusList;
import com.github.vaibhavsinha.kong.model.admin.upstream.Upstream;
import com.github.vaibhavsinha.kong.model.admin.upstream.UpstreamList;
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
 * Updated by tsingye on 2019-08-27.
 */
public interface RetrofitUpstreamService {

  //region Add Upstream
  @POST("upstreams/")
  Call<Upstream> createUpstream(@Body Upstream request);
  //endregion

  //region List Upstreams
  @GET("upstreams/")
  Call<UpstreamList> listAllUpstreams(@Query("size") Long size, @Query("offset") String offset);
  //endregion

  //region Retrieve Upstream
  @GET("upstreams/{nameOrId}")
  Call<Upstream> retrieveUpstream(@Path("nameOrId") String nameOrId);

  @GET("targets/{targetHostPortOrId}/upstream")
  Call<Upstream> retrieveUpstreamAssociatedToSpecificTarget(
      @Path("targetHostPortOrId") String targetHostPortOrId);
  //endregion

  //region Update Upstream
  @PATCH("upstreams/{nameOrId}")
  Call<Upstream> updateUpstream(@Path("nameOrId") String nameOrId, @Body Upstream request);

  @PATCH("targets/{targetHostPortOrId}/upstream")
  Call<Upstream> updateUpstreamAssociatedToSpecificTarget(
      @Path("targetHostPortOrId") String targetHostPortOrId, @Body Upstream request);
  //endregion

  //region Update Or Create Upstream
  @PUT("upstreams/{nameOrId}")
  Call<Upstream> createOrUpdateUpstream(@Path("nameOrId") String nameOrId, @Body Upstream request);


  @PUT("targets/{targetHostPortOrId}/upstream")
  Call<Upstream> createOrUpdateUpstreamAssociatedToSpecificTarget(
      @Path("targetHostPortOrId") String targetHostPortOrId, @Body Upstream request);
  //endregion

  //region Delete Upstream
  @DELETE("upstreams/{nameOrId}")
  Call<Void> deleteUpstream(@Path("nameOrId") String nameOrId);

  @DELETE("targets/{targetHostPortOrId}/upstream")
  Call<Upstream> deleteUpstreamAssociatedToSpecificTarget(
      @Path("targetHostPortOrId") String targetHostPortOrId);
  //endregion

  //region Show Upstream Health for Node
  @GET("upstreams/{nameOrId}/health/")
  Call<HealthStatusList> showUpstreamHealthForNode(@Path("nameOrId") String nameOrId);
  //endregion

}
