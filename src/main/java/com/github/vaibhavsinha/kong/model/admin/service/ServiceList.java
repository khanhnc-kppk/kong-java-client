package com.github.vaibhavsinha.kong.model.admin.service;

import com.github.vaibhavsinha.kong.model.common.AbstractEntityList;
import java.util.List;

public class ServiceList extends AbstractEntityList {

  private List<Service> data;

  private String next;

  private String offset;

  public List<Service> getData() {
    return data;
  }

  public void setData(List<Service> data) {
    this.data = data;
  }


  public void setNext(String next) {
    this.next = next;
  }

  public void setOffset(String offset) {
    this.offset = offset;
  }
}
