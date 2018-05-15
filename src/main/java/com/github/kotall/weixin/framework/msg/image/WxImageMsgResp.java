package com.github.kotall.weixin.framework.msg.image;

import com.github.kotall.weixin.framework.core.WxResponse;
import com.github.kotall.weixin.framework.core.WxResponseWrapper;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;
import lombok.ToString;

/**
 * @author : aracwong
 * @version : 1.0.0
 * @date : 2018/4/29 0029 上午 10:32
 */
@Data
@ToString(callSuper = true)
@XStreamAlias("xml")
public class WxImageMsgResp extends WxResponseWrapper {

    @XStreamAlias("MediaId")
    private String mediaId;

    public WxImageMsgResp(WxResponse response) {
        super(response);
    }
}
