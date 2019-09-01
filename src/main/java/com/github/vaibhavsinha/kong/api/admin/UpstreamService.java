package com.github.vaibhavsinha.kong.api.admin;

import com.github.vaibhavsinha.kong.model.admin.upstream.HealthStatusList;
import com.github.vaibhavsinha.kong.model.admin.upstream.Upstream;
import com.github.vaibhavsinha.kong.model.admin.upstream.UpstreamList;

/**
 * Created by vaibhav on 13/06/17.
 *
 * Updated by tsingye on 2019-08-27.
 */
public interface UpstreamService {

  //region Add Upstream
  Upstream createUpstream(Upstream request);
  //endregion

  //region List Upstreams
  UpstreamList listAllUpstreams(Long size, String offset);
  //endregion

  //region Retrieve Upstream
  Upstream retrieveUpstream(String nameOrId);

  Upstream retrieveUpstreamAssociatedToSpecificTarget(
      String targetHostPortOrId);
  //endregion

  //region Update Upstream
  Upstream updateUpstream(String nameOrId, Upstream request);

  Upstream updateUpstreamAssociatedToSpecificTarget(String targetHostPortOrId, Upstream request);
  //endregion

  //region Update Or Create Upstream
  Upstream createOrUpdateUpstream(String nameOrId, Upstream request);


  Upstream createOrUpdateUpstreamAssociatedToSpecificTarget(String targetHostPortOrId,
      Upstream request);
  //endregion

  //region Delete Upstream
  void deleteUpstream(String nameOrId);

  Upstream deleteUpstreamAssociatedToSpecificTarget(String targetHostPortOrId);
  //endregion

  //region Show Upstream Health for Node
  HealthStatusList showUpstreamHealthForNode(String nameOrId);
  //endregion
}
