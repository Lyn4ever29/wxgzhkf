package cn.lyn4ever.pojo.sendmsg.inmessage;

import cn.lyn4ever.pojo.BaseMessage;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @Author: 007
 * @Date: 2019/8/1 19:27
 * @Version: 1.0
 */
public class MusicMessage extends BaseMessage {
    @XStreamAlias("Music")
    private InMusicMessage inMusicMessage;
}
