package com.icare.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.icare.dubbo.api.UserService;
import com.icare.dubbo.common.ResponseResult;
import com.icare.dubbo.dto.UserDto;

import java.util.Date;

/**
 * <pre>
 *    author  : tianhaibo
 *    email   : tianhaibo@jshuii.com
 *    time    : 2019/3/13   10:33
 *    desc    : 用户业务实现
 *    version : v1.0
 * </pre>
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public ResponseResult<UserDto> getUserById(Long id) {
        UserDto user = new UserDto();
        user.setId(id);
        user.setName("测试用户");
        user.setSex(Byte.parseByte("1"));
        user.setBirthday(new Date());
        return ResponseResult.responseSuccess(user);
    }
}
