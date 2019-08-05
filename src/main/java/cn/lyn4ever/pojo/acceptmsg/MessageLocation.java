package cn.lyn4ever.pojo.acceptmsg;

import cn.lyn4ever.pojo.BaseMessage;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @Author: 007
 * @Date: 2019/8/1 18:55
 * @Version: 1.0
 */
public class MessageLocation extends BaseMessage {
    @XStreamAlias("Location_X")
    private String location_X;
    @XStreamAlias("Location_Y")
    private String location_y;
    @XStreamAlias("Ccale")
    private String scale;
    @XStreamAlias("Label")
    private String label;

    @Override
    public String toString() {
        return super.toString()+"MessageLocation{" +
                "location_X='" + location_X + '\'' +
                ", location_y='" + location_y + '\'' +
                ", scale='" + scale + '\'' +
                ", label='" + label + '\'' +
                '}';
    }

    public String getLocation_X() {
        return location_X;
    }

    public void setLocation_X(String location_X) {
        this.location_X = location_X;
    }

    public String getLocation_y() {
        return location_y;
    }

    public void setLocation_y(String location_y) {
        this.location_y = location_y;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public MessageLocation(String toUserName, String fromUserName, String createTime, String msgType, String msgId, String location_X, String location_y, String scale, String label) {

        super(toUserName, fromUserName, createTime, msgType, msgId);
        this.location_X = location_X;
        this.location_y = location_y;
        this.scale = scale;
        this.label = label;
    }

    public MessageLocation() {

    }
}
