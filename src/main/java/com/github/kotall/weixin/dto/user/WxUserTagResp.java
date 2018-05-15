package com.github.kotall.weixin.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: zpwang
 * @version: 1.0.0
 * @date: 2018/5/11
 */
@Data
public class WxUserTagResp implements Serializable {

    private String id;

    private String name;
}
