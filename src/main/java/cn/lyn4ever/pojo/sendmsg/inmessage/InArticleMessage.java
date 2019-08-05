package cn.lyn4ever.pojo.sendmsg.inmessage;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @Author: 007
 * @Date: 2019/8/1 19:28
 * @Version: 1.0
 */
public class InArticleMessage {
    @XStreamAlias("Title")
    private String title;
    @XStreamAlias("Description")
    private String description;

    @XStreamAlias("PicUrl")
    private String picurl;

    @XStreamAlias("Url")
    private String url;

}
