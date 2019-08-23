package com.github.vaibhavsinha.kong.internal.admin;

import com.github.vaibhavsinha.kong.model.admin.target.Target;
import com.github.vaibhavsinha.kong.model.admin.target.TargetList;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by vaibhav on 13/06/17.
 *
 * Updated by tsingye on 2019-08-27.
 */
public interface RetrofitTargetService {

  //region Add Target
  @POST("upstreams/{upstreamHostPortOrId}/targets")
  Call<Target> createTargetAssociatedToSpecificUpstream(
      @Path("upstreamHostPortOrId") String upstreamHostPortOrId, @Body Target request);
  //endregion

  //region List Targets
  @GET("upstreams/{upstreamHostPortOrId}/targets")
  Call<TargetList> listTargetsAssociatedToSpecificUpstream(
      @Path("upstreamHostPortOrId") String upstreamHostPortOrId);
  //endregion

  //region Delete Target
  @DELETE("upstreams/{upstreamNameOrId}/targets/{hostPortOrId}")
  Call<Void> deleteTarget(@Path("upstreamNameOrId") String upstreamNameOrId,
      @Path("hostPortOrId") String hostPortOrId
  );
  //endregion

  //region Set Target Address As Healthy
  @POST("upstreams/{upstreamNameOrId}/targets/{targetOrId}/{address}/healthy")
  Call<Void> setTargetAddressAsHealthy(@Path("upstreamNameOrId") String upstreamNameOrId,
      @Path("targetOrId") String targetOrId, @Path("address") String address
  );
  //endregion

  //region Set Target Address As Unhealthy
  @POST("upstreams/{upstreamNameOrId}/targets/{targetOrId}/{address}/unhealthy")
  Call<Void> setTargetAddressAsUnhealthy(@Path("upstreamNameOrId") String upstreamNameOrId,
      @Path("targetOrId") String targetOrId, @Path("address") String address);
  //endregion

  //region Set Target As Healthy
  @POST("upstreams/{upstreamNameOrId}/targets/{targetOrId}/healthy")
  Call<Void> setTargetAsHealthy(@Path("upstreamNameOrId") String upstreamNameOrId,
      @Path("targetOrId") String targetOrId
  );
  //endregion

  //region Set Target As Unhealthy
  @POST("upstreams/{upstreamNameOrId}/targets/{targetOrId}/unhealthy")
  Call<Void> setTargetAsUnhealthy(@Path("upstreamNameOrId") String upstreamNameOrId,
      @Path("targetOrId") String targetOrId
  );
  //endregion

  //region List All Targets
  @GET("upstreams/{upstreamNameOrId}/targets")
  Call<TargetList> listTargets(@Path("upstreamNameOrId") String upstreamNameOrId,
      @Query("size") Long size, @Query("offset") String offset);
  //endregion

}
