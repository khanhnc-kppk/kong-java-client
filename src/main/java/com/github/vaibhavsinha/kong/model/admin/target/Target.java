package com.github.vaibhavsinha.kong.model.admin.target;

import com.github.vaibhavsinha.kong.model.common.IdObject;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Created by vaibhav on 14/06/17.
 *
 * Updated by tsingye on 2019-08-27.
 */
@Data
public class Target {

    @SerializedName("id")
    private String id;
    @SerializedName("target")
    private String target;
    @SerializedName("weight")
    private Long weight;
    @SerializedName("upstream")
    private IdObject upstream;
    @SerializedName("created_at")
    private Long createdAt;
    @SerializedName("tags")
    private String[] tags;
}
