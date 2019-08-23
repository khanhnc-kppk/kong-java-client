package com.github.vaibhavsinha.kong.api.admin;

import com.github.vaibhavsinha.kong.model.admin.route.Route;
import com.github.vaibhavsinha.kong.model.admin.route.RouteList;

public interface RouteService {

  //region Add Route
  Route createRoute(Route route);

  Route createRouteAssociatedToSpecificService(String serviceNameOrId, Route route);
  //endregion

  //region List Routes
  RouteList listAllRoutes();

  RouteList listAllRoutes(Integer size);

  RouteList listAllRoutes(Integer size, String offset);

  RouteList listRoutes(String serviceNameOrId);

  RouteList listRoutes(String serviceNameOrId, Integer size, String offset);
  //endregion

  //region Retrieve Route
  Route retrieveRoute(String routeNameOrId);

  Route retrieveRouteAssociatedToSpecificPlugin(String pluginId);
  //endregion

  //region Update Route
  Route updateRoute(String routeNameOrId, Route route);

  Route updateRouteAssociatedToSpecificPlugin(String pluginId, Route route);
  //endregion

  //region Update Or Create Route
  @Deprecated
  Route createOrUpdateRoute(String routeNameOrId, Route route);

  @Deprecated
  Route createOrUpdateRouteAssociatedToSpecificPlugin(String pluginId,
      Route route);
  //endregion

  //region Delete Route
  void deleteRoute(String routeNameOrId);
  //endregion

}
