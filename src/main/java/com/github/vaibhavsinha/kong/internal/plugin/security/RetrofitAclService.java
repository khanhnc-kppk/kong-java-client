package com.github.vaibhavsinha.kong.internal.plugin.security;

import com.github.vaibhavsinha.kong.model.plugin.security.acl.Acl;
import com.github.vaibhavsinha.kong.model.plugin.security.acl.AclList;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * Created by vaibhav on 18/06/17.
 *
 * Upated by dvilela on 22/10/17.
 *
 * Updated by tsingye on 2019-08-28.
 */
public interface RetrofitAclService {
    @POST("consumers/{id}/acls")
    Call<Acl> associateConsumer(@Path("id") String consumerIdOrUsername, @Body Acl request);

    @DELETE("consumers/{consumerId}/acls/{aclId}")
    Call<Void> deleteGroupAssociatedToSpecificConsumer(@Path("consumerId") String consumerId, @Path("aclId") String aclId);

    @GET("consumers/{id}/acls")
    Call<AclList> listAcls(@Path("id") String consumerIdOrUsername, @Query("size") Long size, @Query("offset") String offset);
}
