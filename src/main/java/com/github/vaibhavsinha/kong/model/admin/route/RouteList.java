package com.github.vaibhavsinha.kong.model.admin.route;

import com.github.vaibhavsinha.kong.model.common.AbstractEntityList;
import java.util.List;

public class RouteList extends AbstractEntityList {

  private List<Route> data;

  private String next;

  private String offset;

  public List<Route> getData() {
    return data;
  }

  public void setData(List<Route> data) {
    this.data = data;
  }


  public void setNext(String next) {
    this.next = next;
  }

  public void setOffset(String offset) {
    this.offset = offset;
  }
}
