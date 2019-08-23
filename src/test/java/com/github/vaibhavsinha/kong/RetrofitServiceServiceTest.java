package com.github.vaibhavsinha.kong;

import com.github.vaibhavsinha.kong.model.admin.service.ServiceList;
import org.junit.Test;

public class RetrofitServiceServiceTest extends BaseTest {

  @Test
  public void testList() {
    ServiceList serviceList = kongClient.getServiceService().listAllService();
    System.out.println(gson.toJson(serviceList));
  }
}
