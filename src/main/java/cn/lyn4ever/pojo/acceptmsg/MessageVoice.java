package cn.lyn4ever.pojo.acceptmsg;

import cn.lyn4ever.pojo.BaseMessage;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @Author: 007
 * @Date: 2019/8/1 18:48
 * @Version: 1.0
 */
public class MessageVoice extends BaseMessage {

    @XStreamAlias("MediaId")
    private String mediaId;

    @XStreamAlias("Format")
    private String format;

    @XStreamAlias("Recognition")
    private String recognition;

    public MessageVoice(String toUserName, String fromUserName, String createTime, String msgType, String msgId, String mediaId, String format, String recognition) {
        super(toUserName, fromUserName, createTime, msgType, msgId);
        this.mediaId = mediaId;
        this.format = format;
        this.recognition = recognition;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getFormat() {
        return format;
    }

    public String getRecognition() {
        return recognition;
    }

    public void setRecognition(String recognition) {
        this.recognition = recognition;
    }

    @Override
    public String toString() {
        return super.toString()+"MessageVoice{" +
                "mediaId='" + mediaId + '\'' +
                ", format='" + format + '\'' +
                ", recognition='" + recognition + '\'' +
                '}';
    }

    public void setFormat(String format) {
        this.format = format;
    }



    public MessageVoice() {

    }
}
