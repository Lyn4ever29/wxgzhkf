package cn.lyn4ever.pojo.sendmsg;

import cn.lyn4ever.pojo.BaseMessage;
import cn.lyn4ever.pojo.sendmsg.inmessage.InPicMessage;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @Author: 007
 * @Date: 2019/8/1 19:01
 * @Version: 1.0
 */
public class PicMessage extends BaseMessage {
    @XStreamAlias("Image")
    private InPicMessage image;


}
