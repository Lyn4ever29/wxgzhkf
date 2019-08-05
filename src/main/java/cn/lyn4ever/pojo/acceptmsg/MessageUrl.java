package cn.lyn4ever.pojo.acceptmsg;

import cn.lyn4ever.pojo.BaseMessage;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @Author: 007
 * @Date: 2019/8/1 18:57
 * @Version: 1.0
 */
public class MessageUrl extends BaseMessage {

    @XStreamAlias("Title")
    private String title;
    @XStreamAlias("Description")
    private String description;
    @XStreamAlias("Url")
    private String url;

    @Override
    public String toString() {
        return super.toString()+"MessageUrl{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public MessageUrl(String toUserName, String fromUserName, String createTime, String msgType, String msgId, String title, String description, String url) {

        super(toUserName, fromUserName, createTime, msgType, msgId);
        this.title = title;
        this.description = description;
        this.url = url;
    }

    public MessageUrl() {

    }
}
