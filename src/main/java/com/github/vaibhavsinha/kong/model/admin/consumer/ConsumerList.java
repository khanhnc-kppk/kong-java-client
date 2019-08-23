package com.github.vaibhavsinha.kong.model.admin.consumer;

import com.github.vaibhavsinha.kong.model.common.AbstractEntityList;
import lombok.Data;

import java.util.List;
import lombok.EqualsAndHashCode;

/**
 * Created by vaibhav on 13/06/17.
 *
 * Updated by tsingye on 2019-08-26.
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class ConsumerList extends AbstractEntityList {
    private Long total;
    private String next;
    private String offset;
    private List<Consumer> data;
}
