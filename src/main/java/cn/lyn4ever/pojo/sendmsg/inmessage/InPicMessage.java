package cn.lyn4ever.pojo.sendmsg.inmessage;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @Author: 007
 * @Date: 2019/8/1 19:13
 * @Version: 1.0
 */
public class InPicMessage  {
    @XStreamAlias("MediaId")
    private String mediaId;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public InPicMessage() {
    
    }

    public InPicMessage(String mediaId) {
    
        this.mediaId = mediaId;
    }
}
