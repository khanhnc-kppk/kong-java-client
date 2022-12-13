package com.github.vaibhavsinha.kong.model.plugin.authentication.basic;

import com.github.vaibhavsinha.kong.model.common.IdObject;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by vaibhav on 15/06/17.
 */
@Data
@NoArgsConstructor
public class BasicAuthCredential {

    @SerializedName("id")
    private String id;
    @SerializedName("username")
    private String username;
    @SerializedName("password")
    private String password;
    @SerializedName("consumer_id")
    @Deprecated
    private String consumerId;
    @SerializedName("consumer")
    private IdObject consumer;
    @SerializedName("created_at")
    private Long createdAt;

    public BasicAuthCredential(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
