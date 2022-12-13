package com.github.vaibhavsinha.kong.api.plugin.security;

import com.github.vaibhavsinha.kong.model.plugin.security.acl.Acl;
import com.github.vaibhavsinha.kong.model.plugin.security.acl.AclList;

/**
 * Created by vaibhav on 18/06/17.
 *
 * Upated by dvilela on 22/10/17.
 *
 * Updated by tsingye on 2019-08-28.
 */
public interface AclService {
    Acl associateConsumer(String usernameOrId, String group);
    void deleteGroupAssociatedToSpecificConsumer(String consumerId, String aclId);
    AclList listAcls(String usernameOrId, Long size, String offset);
}
