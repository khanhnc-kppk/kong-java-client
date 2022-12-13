package com.github.vaibhavsinha.kong.internal.admin;

import com.github.vaibhavsinha.kong.model.admin.consumer.Consumer;
import com.github.vaibhavsinha.kong.model.admin.consumer.ConsumerList;
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
 */
public interface RetrofitConsumerService {

  //region Add Consumer
  @POST("consumers/")
  Call<Consumer> createConsumer(@Body Consumer request);
  //endregion

  //region List Consumer
  @GET("consumers/")
  Call<ConsumerList> listConsumers();

  @GET("consumers/")
  Call<ConsumerList> listConsumers(@Query("size") Integer size);

  @GET("consumers/")
  Call<ConsumerList> listConsumers(@Query("size") Integer size, @Query("offset") String offset);
  //endregion

  //region Retrieve Consumer
  @GET("consumers/{usernameOrId}")
  Call<Consumer> retrieveConsumer(@Path("usernameOrId") String usernameOrId);

  @GET("plugins/{pluginId}/consumer")
  Call<Consumer> retrieveConsumerAssociatedToSpecificPlugin(@Path("pluginId") String pluginId);
  //endregion

  //region Update Consumer
  @PATCH("consumers/{usernameOrId}")
  Call<Consumer> updateConsumer(@Path("usernameOrId") String usernameOrId, @Body Consumer request);

  @PATCH("plugins/{pluginId}/consumer")
  Call<Consumer> updateConsumerAssociatedToSpecificPlugin(@Path("pluginId") String pluginId,
      @Body Consumer request);
  //endregion

  //region Update Or Create Consumer
  @PUT("consumers/{usernameOrId}")
  Call<Consumer> createOrUpdateConsumer(@Path("usernameOrId") String usernameOrId,
      @Body Consumer request);

  @PUT("plugins/{pluginId}/consumer")
  Call<Consumer> createOrUpdateConsumerAssociatedToSpecificPlugin(@Path("pluginId") String pluginId,
      @Body Consumer request);
  //endregion

  //region Delete Consumer
  @DELETE("consumers/{usernameOrId}")
  Call<Void> deleteConsumer(@Path("usernameOrId") String usernameOrId);
  //endregion

}
