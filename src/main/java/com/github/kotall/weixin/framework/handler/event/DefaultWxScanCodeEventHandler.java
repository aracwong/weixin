package com.github.kotall.weixin.framework.handler.event;

import com.github.kotall.weixin.framework.constant.WxMsgType;
import com.github.kotall.weixin.framework.core.WxDelegateRequestFilter;
import com.github.kotall.weixin.framework.core.WxRequest;
import com.github.kotall.weixin.framework.core.WxResponse;
import com.github.kotall.weixin.framework.event.WxScanCodeEventReq;
import lombok.extern.slf4j.Slf4j;

/**
 * 扫描推事件/扫描推且弹出 "消息接受中" 事件
 *
 * 场景: 微信自定义菜单-扫码菜单 扫码后推送事件
 * @author : aracwong
 * @version : 1.0.0
 * @date : 2018/4/29 0029 下午 7:14
 */
@Slf4j
public class DefaultWxScanCodeEventHandler extends WxDelegateRequestFilter<WxScanCodeEventReq> {

    @Override
    public boolean support(WxRequest request) {
        String msgType = request.getMsgType();
        String event = request.getParameter("//Event");
        boolean isScanCodePushEvent = WxMsgType.EVENT_SCANCODE_PUSH.equals(event) || WxMsgType.EVENT_SCANCODE_PUSH_WAITMSG.equals(event);
        if (WxMsgType.EVENT.equals(msgType)
                && isScanCodePushEvent) {
           return true;
        }
        return false;
    }


    @Override
    public void handle(WxScanCodeEventReq request, WxResponse response) {
        log.info("自定义菜单扫描推事件: {}", request);
    }


}
