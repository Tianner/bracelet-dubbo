package com.icare.dubbo.domain;

import lombok.Data;

import java.util.Date;

/**
 * <pre>
 *    author  : tianhaibo
 *    email   : tianhaibo@jshuii.com
 *    time    : 2019/3/13   10:28
 *    desc    : 用户实体
 *    version : v1.0
 * </pre>
 */
@Data
public class User {

    private Long id;

    private String name;

    private Byte sex;

    private Date birthday;

    private String address;
}
