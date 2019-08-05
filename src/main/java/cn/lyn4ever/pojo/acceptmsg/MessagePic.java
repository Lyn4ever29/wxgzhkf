package cn.lyn4ever.pojo.acceptmsg;

import cn.lyn4ever.pojo.BaseMessage;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @Author: 007
 * @Date: 2019/8/1 18:45
 * @Version: 1.0
 */
public class MessagePic extends BaseMessage {
    @XStreamAlias("PicUrl")
    private String picUrl;
    @XStreamAlias("Media")
    private String mediaId;

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public MessagePic(String toUserName, String fromUserName, String createTime, String msgType, String msgId, String picUrl, String mediaId) {
        super(toUserName, fromUserName, createTime, msgType, msgId);
        this.picUrl = picUrl;
        this.mediaId = mediaId;
    }

    public MessagePic() {
    }

    @Override
    public String toString() {
        return super.toString()+"MessagePic{" +
                "picUrl='" + picUrl + '\'' +
                ", mediaId='" + mediaId + '\'' +
                '}';
    }
}
