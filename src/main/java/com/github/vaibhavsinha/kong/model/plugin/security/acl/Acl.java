package com.github.vaibhavsinha.kong.model.plugin.security.acl;

import com.github.vaibhavsinha.kong.model.common.IdObject;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by vaibhav on 18/06/17.
 */
@Data
@NoArgsConstructor
public class Acl {
    @SerializedName("id")
    private String id;
    @SerializedName("group")
    private String group;
    @SerializedName("consumer_id")
    @Deprecated
    private String consumerId;
    @SerializedName("consumer")
    private IdObject consumer;
    @SerializedName("created_at")
    private Long createdAt;

    public Acl(String group) {
        this.group = group;
    }
}
