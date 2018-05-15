package com.github.kotall.weixin.framework.event;

import com.github.kotall.weixin.framework.core.WxEventRequest;
import com.github.kotall.weixin.framework.core.WxRequest;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

/**
 * @author: zpwang
 * @version: 1.0.0
 * @date: 2018/5/6
 */
@Data
@XStreamAlias("xml")
public class WxLocationSelectEventReq extends WxEventRequest {

    @XStreamAlias("EventKey")
    private String eventKey;

    @XStreamAlias("SendLocationInfo")
    private SendLocationInfo sendLocationInfo = new SendLocationInfo();

    @Data
    public class SendLocationInfo {

        @XStreamAlias("Location_X")
        private String locationX;

        @XStreamAlias("Location_Y")
        private String locationY;

        @XStreamAlias("Scale")
        private String scale;

        @XStreamAlias("Label")
        private String label;

        @XStreamAlias("Poiname")
        private String poiname;
    }

    public WxLocationSelectEventReq(WxRequest request) {
        super(request);
        this.eventKey = request.getParameter("//EventKey");

        this.sendLocationInfo.setLocationX(request.getParameter("//SendLocationInfo/Location_X"));
        this.sendLocationInfo.setLocationY(request.getParameter("//SendLocationInfo/Location_Y"));
        this.sendLocationInfo.setScale(request.getParameter("//SendLocationInfo/Scale"));
        this.sendLocationInfo.setLabel(request.getParameter("//SendLocationInfo/Label"));
        this.sendLocationInfo.setPoiname(request.getParameter("//SendLocationInfo/Poiname"));
    }

}
