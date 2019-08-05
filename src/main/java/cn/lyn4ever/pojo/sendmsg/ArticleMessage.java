package cn.lyn4ever.pojo.sendmsg;

import cn.lyn4ever.pojo.BaseMessage;
import cn.lyn4ever.pojo.sendmsg.inmessage.InArticleMessage;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @Author: 007
 * @Date: 2019/8/1 19:30
 * @Version: 1.0
 */
public class ArticleMessage extends BaseMessage {
    @XStreamAlias("ArticleCount")
    private String articlecount;
    @XStreamAlias("Articles")
    private InArticleMessage articles;

}
