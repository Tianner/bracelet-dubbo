package com.icare.dubbo.rest;

import com.alibaba.dubbo.config.annotation.Reference;
import com.icare.dubbo.api.UserService;
import com.icare.dubbo.common.ResponseResult;
import com.icare.dubbo.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *    author  : tianhaibo
 *    email   : tianhaibo@jshuii.com
 *    time    : 2019/3/13   11:34
 *    desc    :
 *    version : v1.0
 * </pre>
 */
@Slf4j
@RestController
@RequestMapping("/dubbo/")
public class DubboRest {

    @Reference(group = "bracelet-dubbo-serivce")
    private UserService userService;

    @GetMapping("getUserById")
    public ResponseResult<UserDto> getUserById(@RequestParam("id")Long id){
        ResponseResult<UserDto> responseResult = userService.getUserById(id);
        return responseResult;
    }
}
