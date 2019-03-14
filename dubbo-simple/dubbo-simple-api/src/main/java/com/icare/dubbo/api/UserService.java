package com.icare.dubbo.api;

import com.icare.dubbo.common.ResponseResult;
import com.icare.dubbo.dto.UserDto;

/**
 * <pre>
 *    author  : tianhaibo
 *    email   : tianhaibo@jshuii.com
 *    time    : 2019/3/13   10:29
 *    desc    : 用户业务接口
 *    version : v1.0
 * </pre>
 */

public interface UserService {

    ResponseResult<UserDto> getUserById(Long id);
}
