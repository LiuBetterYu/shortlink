package com.lby.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lby.shortlink.admin.dao.entity.UserDO;
import com.lby.shortlink.admin.dto.req.UserLoginReqDTO;
import com.lby.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.lby.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.lby.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.lby.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 * @author lby
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @return 用户返回实体
     */
    UserRespDTO getUserByUsername(String username);

    /**
     * 查询用户名是否存在
     * @param username 用户名
     * @return 是否存在
     */
    Boolean hasUsername(String username);

    /**
     * 用户注册
     * @param requestParam 用户注册请求参数
     */
    void register(UserRegisterReqDTO requestParam);

    /**
     * 根据用户名修改用户
     * @param requestParam 用户修改请求参数
     */
    void update(UserUpdateReqDTO requestParam);

    /**
     * 用户登录
     * @param requestParam 用户登录请求参数
     * @return 用户登录返回参数
     */
    UserLoginRespDTO login(UserLoginReqDTO requestParam);

    /**
     * 检查用户是否登录
     * @param token 用户登录token
     * @return
     */
    Boolean checkLogin(String username, String token);

    /**
     * 退出登录
     * @param username
     * @param token
     */
    void logout(String username, String token);
}
