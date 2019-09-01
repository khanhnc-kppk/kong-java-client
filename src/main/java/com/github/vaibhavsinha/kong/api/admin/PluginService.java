package com.github.vaibhavsinha.kong.api.admin;

import com.github.vaibhavsinha.kong.model.admin.plugin.Plugin;
import com.github.vaibhavsinha.kong.model.admin.plugin.PluginList;

/**
 * Created by vaibhav on 13/06/17.
 *
 * You can add a plugin in four different ways:
 *  For every API and Consumer. Don't set api_id and consumer_id.
 *  For every API and a specific Consumer. Only set consumer_id.
 *  For every Consumer and a specific API. Only set api_id.
 *  For a specific Consumer and API. Set both api_id and consumer_id.
 * Note that not all plugins allow to specify consumer_id. Check the plugin documentation.
 *
 * Updated by tsingye on 2019-08-27.
 */
public interface PluginService {

  //region Add Plugin
  Plugin createPlugin(Plugin request);

  Plugin createPluginAssociatedToSpecificRoute(String routeId,
      Plugin request);

  Plugin createPluginAssociatedToSpecificService(String serviceId,
      Plugin request);

  Plugin createPluginAssociatedToSpecificConsumer(String consumerId,
      Plugin request);
  //endregion

  //region List Plugins
  PluginList listAllPlugins(Integer size, String offset);

  PluginList listPluginsAssociatedToSpecificRoute(String routeId);

  PluginList listPluginsAssociatedToSpecificService(String serviceId);

  PluginList listPluginsAssociatedToSpecificConsumer(String consumerId);
  //endregion

  //region Retrieve Plugin
  Plugin retrievePlugin(String pluginId);
  //endregion

  //region Update Plugin
  Plugin updatePlugin(String pluginId, Plugin request);
  //endregion

  //region Update Or Create Plugin
  Plugin createOrUpdatePlugin(String pluginId, Plugin request);
  //endregion

  //region Delete Plugin
  void deletePlugin(String nameOrId);
  //endregion

}
