package cn.lyn4ever.pojo.sendmsg.inmessage;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @Author: 007
 * @Date: 2019/8/1 19:22
 * @Version: 1.0
 */
public class InVideoMessage {
    @XStreamAlias("MediaId")
    private String mediaId;

    @XStreamAlias("Title")
    private String title;

    @XStreamAlias("Description")
    private String description;

}
