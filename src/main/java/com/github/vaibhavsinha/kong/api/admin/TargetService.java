package com.github.vaibhavsinha.kong.api.admin;

import com.github.vaibhavsinha.kong.model.admin.target.Target;
import com.github.vaibhavsinha.kong.model.admin.target.TargetList;

/**
 * Created by vaibhav on 13/06/17.
 */
public interface TargetService {

  //region Add Target
  Target createTargetAssociatedToSpecificUpstream(String upstreamHostPortOrId, Target request);
  //endregion

  //region List Targets
  TargetList listTargetsAssociatedToSpecificUpstream(String upstreamHostPortOrId);
  //endregion

  //region Delete Target
  void deleteTarget(String upstreamNameOrId, String hostPortOrId);
  //endregion

  //region Set Target Address As Healthy

  /**
   * Set the current health status of an individual address resolved by a target in the load
   * balancer to “healthy” in the entire Kong cluster.
   * <p>
   * This endpoint can be used to manually re-enable an address resolved by a target that was
   * previously disabled by the upstream’s health checker. Upstreams only forward requests to
   * healthy nodes, so this call tells Kong to start using this address again.
   * </p>
   * <p>
   * This resets the health counters of the health checkers running in all workers of the Kong node,
   * and broadcasts a cluster-wide message so that the “healthy” status is propagated to the whole
   * Kong cluster.
   * </p>
   *
   * @param upstreamNameOrId The unique identifier or the name of the upstream.
   * @param targetOrId The host/port combination element of the target to set as healthy, or the id
   * of an existing target entry.
   * @param address The host/port combination element of the address to set as healthy.
   */
  void setTargetAddressAsHealthy(String upstreamNameOrId, String targetOrId, String address);
  //endregion

  //region Set Target Address As Unhealthy

  /**
   * Set the current health status of an individual address resolved by a target in the load
   * balancer to “unhealthy” in the entire Kong cluster.
   * <p>
   * This endpoint can be used to manually disable an address and have it stop responding to
   * requests. Upstreams only forward requests to healthy nodes, so this call tells Kong to start
   * skipping this address.
   * </p><p>
   * This call resets the health counters of the health checkers running in all workers of the Kong
   * node, and broadcasts a cluster-wide message so that the “unhealthy” status is propagated to the
   * whole Kong cluster.
   * </p><p>
   * Active health checks continue to execute for unhealthy addresses. Note that if active health
   * checks are enabled and the probe detects that the address is actually healthy, it will
   * automatically re-enable it again. To permanently remove a target from the balancer, you should
   * delete a target instead.
   * </p>
   *
   * @param upstreamNameOrId The unique identifier or the name of the upstream.
   * @param targetOrId The host/port combination element of the target to set as unhealthy, or the
   * id of an existing target entry.
   * @param address The host/port combination element of the address to set as unhealthy.
   */
  void setTargetAddressAsUnhealthy(String upstreamNameOrId, String targetOrId, String address);
  //endregion

  //region Set Target As Healthy
  void setTargetAsHealthy(String upstreamNameOrId, String targetOrId);
  //endregion

  //region Set Target As Unhealthy
  void setTargetAsUnhealthy(String upstreamNameOrId, String targetOrId);
  //endregion

  //region List All Targets
  TargetList listTargets(String upstreamNameOrId, Long size, String offset);
  //endregion

}
