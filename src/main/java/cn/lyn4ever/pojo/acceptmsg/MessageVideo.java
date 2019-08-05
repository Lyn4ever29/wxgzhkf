package cn.lyn4ever.pojo.acceptmsg;

import cn.lyn4ever.pojo.BaseMessage;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @Author: 007
 * @Date: 2019/8/1 18:51
 * @Version: 1.0
 */
public class MessageVideo extends BaseMessage {
    @XStreamAlias("MediaId")
    private String mediaId;
    @XStreamAlias("ThumbMediaId")
    private String thumbMediaId;

    @Override
    public String toString() {
        return super.toString()+"MessageVideo{" +
                "mediaId='" + mediaId + '\'' +
                ", thumbMediaId='" + thumbMediaId + '\'' +
                '}';
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }

    public MessageVideo(String toUserName, String fromUserName, String createTime, String msgType, String msgId, String mediaId, String thumbMediaId) {

        super(toUserName, fromUserName, createTime, msgType, msgId);
        this.mediaId = mediaId;
        this.thumbMediaId = thumbMediaId;
    }

    public MessageVideo() {

    }
}
