package cn.lyn4ever.pojo.sendmsg;

import cn.lyn4ever.pojo.BaseMessage;
import cn.lyn4ever.pojo.sendmsg.inmessage.InVideoMessage;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @Author: 007
 * @Date: 2019/8/1 19:21
 * @Version: 1.0
 */
public class VideoMessage extends BaseMessage {
    @XStreamAlias("Video")
    private InVideoMessage inVideoMessage;
}
