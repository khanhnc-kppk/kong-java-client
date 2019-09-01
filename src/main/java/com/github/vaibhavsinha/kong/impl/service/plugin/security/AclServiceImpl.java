package com.github.vaibhavsinha.kong.impl.service.plugin.security;

import com.github.vaibhavsinha.kong.api.plugin.security.AclService;
import com.github.vaibhavsinha.kong.exception.KongClientException;
import com.github.vaibhavsinha.kong.internal.plugin.security.RetrofitAclService;
import com.github.vaibhavsinha.kong.model.plugin.security.acl.Acl;
import com.github.vaibhavsinha.kong.model.plugin.security.acl.AclList;

import java.io.IOException;

/**
 * Created by vaibhav on 18/06/17.
 *
 * Updated by fanhua on 2017-08-07.
 *
 * Upated by dvilela on 22/10/17.
 *
 * Updated by tsingye on 2019-08-28.
 */
public class AclServiceImpl implements AclService {

    private RetrofitAclService retrofitAclService;

    public AclServiceImpl(RetrofitAclService retrofitAclService) {
        this.retrofitAclService = retrofitAclService;
    }
    @Override
    public Acl associateConsumer(String usernameOrId, String group) {
        try {
            return retrofitAclService.associateConsumer(usernameOrId, new Acl(group))
                .execute()
                .body();
        } catch (IOException e) {
            throw new KongClientException(e.getMessage());
        }
    }

    @Override
    public void deleteGroupAssociatedToSpecificConsumer(String consumerId, String aclId) {
        try {
            retrofitAclService.deleteGroupAssociatedToSpecificConsumer(consumerId, aclId)
                .execute()
                .body();
        } catch (IOException e) {
            throw new KongClientException(e.getMessage());
        }
    }

    @Override
    public AclList listAcls(String usernameOrId, Long size, String offset) {
        try {
            return retrofitAclService.listAcls(usernameOrId, size, offset).execute().body();
        } catch (IOException e) {
            throw new KongClientException(e.getMessage());
        }
    }
}
