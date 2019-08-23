package com.github.vaibhavsinha.kong.api.admin;

import com.github.vaibhavsinha.kong.model.admin.consumer.Consumer;
import com.github.vaibhavsinha.kong.model.admin.consumer.ConsumerList;

/**
 * Created by vaibhav on 13/06/17.
 *
 * Updated by tsingye on 2019-08-27.
 */
public interface ConsumerService {

  //region Add Consumer
  Consumer createConsumer(Consumer request);
  //endregion

  //region List Consumer
  ConsumerList listConsumers();

  ConsumerList listConsumers(Integer size);

  ConsumerList listConsumers(Integer size, String offset);
  //endregion

  //region Retrieve Consumer
  Consumer retrieveConsumer(String usernameOrId);

  Consumer retrieveConsumerAssociatedToSpecificPlugin(String pluginId);
  //endregion

  //region Update Consumer
  Consumer updateConsumer(String usernameOrId, Consumer request);

  Consumer updateConsumerAssociatedToSpecificPlugin(String pluginId,
      Consumer request);
  //endregion

  //region Update Or Create Consumer
  Consumer createOrUpdateConsumer(String usernameOrId,
      Consumer request);

  Consumer createOrUpdateConsumerAssociatedToSpecificPlugin(String pluginId,
      Consumer request);
  //endregion

  //region Delete Consumer
  void deleteConsumer(String usernameOrId);
  //endregion

}
