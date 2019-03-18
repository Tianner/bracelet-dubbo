package com.icare.dubbo.dto;

import lombok.Data;

import java.io.Serializable;
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
public class UserDto implements Serializable {

    private static final long serialVersionUID = 3937856756034403433L;
    private Long id;

    private String name;

    private Byte sex;

    private Date birthday;

    private String address;
}
