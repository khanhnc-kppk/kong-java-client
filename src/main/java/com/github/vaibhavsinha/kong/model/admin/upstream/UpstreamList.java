package com.github.vaibhavsinha.kong.model.admin.upstream;

import com.github.vaibhavsinha.kong.model.common.AbstractEntityList;
import java.util.List;
import lombok.Data;

/**
 * Created by vaibhav on 13/06/17.
 */
@Data
public class UpstreamList extends AbstractEntityList {

  private List<Upstream> data;

  private String next;

  private String offset;

  public String getOffset() {
    if (this.offset != null) {
      return offset;
    } else {
      return super.getOffset();
    }
  }

  public void setNext(String next) {
    this.next = next;
  }

  public void setOffset(String offset) {
    this.offset = offset;
  }

  public List<Upstream> getData() {
    return data;
  }

  public void setData(List<Upstream> data) {
    this.data = data;
  }
}
