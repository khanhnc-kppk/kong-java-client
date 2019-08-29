package com.github.vaibhavsinha.kong.model.plugin.authentication.hmac;

import com.github.vaibhavsinha.kong.model.common.IdObject;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by vaibhav on 15/06/17.
 */
@Data
@NoArgsConstructor
public class HmacAuthCredential {

    @SerializedName("id")
    private String id;
    @SerializedName("username")
    private String username;
    @SerializedName("secret")
    private String secret;
    @SerializedName("consumer_id")
    @Deprecated
    private String consumerId;
    @SerializedName("consumer")
    private IdObject consumer;
    @SerializedName("created_at")
    private Long createdAt;

    public HmacAuthCredential(String username, String secret) {
        this.username = username;
        this.secret = secret;
    }
}
