package cn.lyn4ever.pojo.sendmsg;

import cn.lyn4ever.pojo.BaseMessage;
import cn.lyn4ever.pojo.sendmsg.inmessage.InVoiceMessage;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @Author: 007
 * @Date: 2019/8/1 19:19
 * @Version: 1.0
 */
public class VoiceMessage extends BaseMessage {
    @XStreamAlias("Voice")
    private InVoiceMessage inVoiceMessage;
}
