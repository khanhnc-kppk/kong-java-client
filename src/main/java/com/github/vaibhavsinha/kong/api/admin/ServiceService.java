package com.github.vaibhavsinha.kong.api.admin;

import com.github.vaibhavsinha.kong.model.admin.service.Service;
import com.github.vaibhavsinha.kong.model.admin.service.ServiceList;

/**
 * some API of '/services'
 */
public interface ServiceService {

  //region Add service
  Service createService(Service service);
  //endregion

  //region List services
  ServiceList listAllService();
  ServiceList listAllService(Integer size);
  ServiceList listAllService(Integer size, String offset);
  //endregion

  //region Retrieve Service
  Service retrieveService(String serviceNameOrId);
  Service retrieveServiceAssociatedToSpecificRoute(String routeNameOrId);
  Service retrieveServiceAssociatedToSpecificPlugin(String pluginId);
  //endregion

  //region Update Service
  Service updateService(String serviceNameOrId, Service service);
  Service updateServiceAssociatedToSpecificRoute(String routeNameOrId, Service service);
  Service updateServiceAssociatedToSpecificPlugin(String pluginId, Service service);
  //endregion

  //region Update Or Create Service
  @Deprecated
  Service createOrUpdateService(Service service);
  @Deprecated
  Service createOrUpdateServiceToSpecificRoute(String routeNameOrId, Service service);
  @Deprecated
  Service createOrUpdateServiceToSpecificPlugin(String pluginId, Service service);
  //endregion

  //region Delete Service
  void deleteService(String serviceNameOrId);
  void deleteServiceToSpecificRoute(String routeNameOrId);
  //endregion

}
