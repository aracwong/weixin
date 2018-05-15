package com.github.kotall.weixin.api;

import com.github.kotall.weixin.dto.qrcode.WxQrCodeReqDto;
import com.github.kotall.weixin.dto.qrcode.WxQrCodeRespDto;

/**
 * @author: zpwang
 * @version: 1.0.0
 * @date: 2018/5/6
 */
public interface WxQrCodeApi {

    WxQrCodeRespDto create(String appId, WxQrCodeReqDto wxQrCodeReqDto);

}
