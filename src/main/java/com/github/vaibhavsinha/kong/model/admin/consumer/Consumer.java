package com.github.vaibhavsinha.kong.model.admin.consumer;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Created by vaibhav on 12/06/17.
 *
 * Updated by tsingye on 2019-08-26.
 */
@Data
public class Consumer {

  @SerializedName("id")
  private String id;

  @SerializedName("created_at")
  private Long createdAt;

  @SerializedName("custom_id")
  private String customId;

  @SerializedName("tags")
  private String[] tags;

  @SerializedName("username")
  private String username;

}
