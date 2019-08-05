package cn.lyn4ever.pojo.acceptmsg;

import cn.lyn4ever.pojo.BaseMessage;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @Author: 007
 * @Date: 2019/7/31 15:37
 * @Version: 1.0
 */

public class MessageText extends BaseMessage {

//    @XStreamAlias("ToUserName")
//    private String toUserName;
//    @XStreamAlias("FromUserName")
//    private String fromUserName;
//    //由于微信服务端需要的时间整形是以秒为单位的，故需要除以1000L
//    // this.setCreateTime(String.valueOf(System.currentTimeMillis() / 1000L));
//    @XStreamAlias("CreateTime")
//    private String createTime;
//    @XStreamAlias("MsgType")
//    private String msgType;
    @XStreamAlias("Content")
    private String content;

    public MessageText() {
    }

    public MessageText(String toUserName, String fromUserName, String createTime, String msgType, String msgId, String content) {
        super(toUserName, fromUserName, createTime, msgType, msgId);
        this.content = content;
    }

    @Override
    public String toString() {
        return super.toString()+"->MessageText{" +
                "content='" + content + '\'' +
                '}';
    }



    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}