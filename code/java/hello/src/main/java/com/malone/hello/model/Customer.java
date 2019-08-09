package com.malone.hello.model;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
//@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Customer implements Serializable {

    private Integer id;

    private String name;

    private String phone;

    private Date ct;

}