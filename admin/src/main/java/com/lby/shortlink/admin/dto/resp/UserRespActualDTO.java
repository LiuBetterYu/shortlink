package com.lby.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * 用户返回参数响应
 * @author lby
 */
@Data
public class UserRespActualDTO {

    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mail;
}
