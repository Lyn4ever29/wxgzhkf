package cn.lyn4ever.pojo.sendmsg.inmessage;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @Author: 007
 * @Date: 2019/8/1 19:25
 * @Version: 1.0
 */
public class InMusicMessage {
    @XStreamAlias("Title")
    private String title;
    @XStreamAlias("Description")
    private String description;
    @XStreamAlias("MusicUrl")
    private String musicUrl;
    @XStreamAlias("HQMusicUrl")
    private String hQMusicUrl;
    @XStreamAlias("ThumbMediaId")
    private String thumbMediaId;

}
