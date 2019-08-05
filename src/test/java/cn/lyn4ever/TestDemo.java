package cn.lyn4ever;

import cn.lyn4ever.pojo.BaseMessage;
import cn.lyn4ever.pojo.acceptmsg.MessageText;
import cn.lyn4ever.pojo.sendmsg.PicMessage;
import cn.lyn4ever.utils.XmlUtils;
import com.sun.xml.internal.rngom.parse.host.Base;


public class TestDemo {


    public static void main(String[] args) {

        String xml = "<xml>" +
                "<ToUserName><![CDATA[213131]]></ToUserName>" +
                "<FromUserName><![CDATA[fromusername]]></FromUserName>" +
                "<CreateTime>Tue Sep 25 15:10:09 CST 2018</CreateTime>" +
                "<MsgType><![CDATA[image]]></MsgType>" +
                "<Image><MediaId><![CDATA[image]]></MediaId></Image>" + "</xml>";
        BaseMessage entity = XmlUtils.xmlToBean(xml, PicMessage.class);


        //XStream xstream = new XStream();//需要XPP3库
        //XStream xstream = new XStream(new DomDriver());//不需要XPP3库
//        XStream xstream = new XStream(new StaxDriver());//不需要XPP3库开始使用Java6
//        //XML序列化
//        //XML反序列化
//        MessageText bean=(MessageText)xstream.fromXML(xml);
        System.out.println(entity);
        String s = XmlUtils.beanToXml(entity);
        System.out.println(s);

//        BaseMessage messageText = new MessageText();
//        ((MessageText) messageText).setContent("hello");
//        messageText.setFromUserName("afefhui");
//        messageText.setMsgId("123123");
//
//        String s = XmlUtils.beanToXml(messageText);
//        System.out.println(s);
    }

}
