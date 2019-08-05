package cn.lyn4ever.controller;

import ch.qos.logback.core.joran.spi.XMLUtil;
import cn.lyn4ever.pojo.BaseMessage;
import cn.lyn4ever.pojo.acceptmsg.MessageText;
import cn.lyn4ever.utils.XmlUtils;
import com.sun.javaws.jnl.XMLUtils;
import com.sun.xml.internal.rngom.parse.host.Base;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * @Author: 007
 * @Date: 2019/8/1 16:59
 * @Version: 1.0
 */
@RestController
@RequestMapping("/lyn4ever")
public class WXController {
    @RequestMapping(value = "/wxAccount", method = RequestMethod.GET)
    public String secnodMethod(HttpServletRequest request,
                               HttpServletResponse response) throws Exception {

        // 从请求中得到数据，然后进行加密验证
        String msgSignature = request.getParameter("signature");
        String msgTimestamp = request.getParameter("timestamp");
        String msgNonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
//                "yyyy-MM-dd HH:mm:ss");
//        System.out.println("前端传来的时间" + simpleDateFormat.parse(msgTimestamp));
//        System.out.println("没有做消息验证，这个放着以后写");

//        Map<String, String[]> parameterMap = request.getParameterMap();
//
//        Set<String> strings = parameterMap.keySet();
//        for (String string : strings) {
//            System.out.println(string + "===" + parameterMap.get(string.toString()));
//        }

//        https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code
//        authorization_code
//
//        String code = (String) request.getParameter("code");
//        System.out.println(code);

//        String s =RequestUtils.sendGet("https://api.weixin.qq.com/sns/jscode2session", "appid=wx7ecd406d76f8f179" +
//                "&secret=87e9b9102b9e142172d1f2aa715f6956&js_code="+code+"&grant_type=authorization_code");
//        System.out.println(s);
        // 返回给微信服务器，只有返回这个才能验证成功
        System.out.println(echostr);
//        response.getWriter().print(echostr);
        return echostr;
    }


    /**
     * post请求，用来接收微信其他请求
     *
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping(value = "/wxAccount", method = RequestMethod.POST)
    public String postByWX(HttpServletRequest request,
                         HttpServletResponse response) throws Exception {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");


        InputStream is = request.getInputStream();
        byte[] bytes = new byte[1024];
        int _length = 0;
        StringBuffer sb = new StringBuffer();
        while (-1 != (_length = is.read(bytes))) {
            sb.append(new String(bytes, 0, bytes.length));
        }
        System.out.println(sb.toString());

        BaseMessage baseMessage = XmlUtils.xmlToBean(sb.toString().trim(), MessageText.class);
        System.out.println(baseMessage.toString());


        BaseMessage newMessage = new MessageText();
        newMessage.setFromUserName(baseMessage.getToUserName());
        newMessage.setToUserName(baseMessage.getFromUserName());
        ((MessageText) newMessage).setContent("你说的对");
        newMessage.setMsgType("text");
        newMessage.setCreateTime(String.valueOf(System.currentTimeMillis() / 1000L));

        String s = XmlUtils.beanToXml(newMessage);
        System.out.println(s);
        return s.trim();


//        <xml>
//  <ToUserName><![CDATA[toUser]]></ToUserName>
//  <FromUserName><![CDATA[fromUser]]></FromUserName>
//  <CreateTime>12345678</CreateTime>
//  <MsgType><![CDATA[text]]></MsgType>
//  <Content><![CDATA[你好]]></Content>
//</xml>


//        https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN
//        请求参数

//        属性	类型	默认值	必填	说明
//        access_token	string		是	接口调用凭证
//        touser	string		是	用户的 OpenID
//        msgtype	string		是	消息类型
//        content	string		是	文本消息内容，msgtype="text" 时必填
//        image	Object		是	图片消息，msgtype="image" 时必填
//        link	Object		是	图片消息，msgtype="link" 时必填
//        miniprogrampage	Object		是	小程序卡片，msgtype="miniprogrampage" 时必填
//        private String appid = "wx7ecd406d76f8f179";
//        private String secret = "87e9b9102b9e142172d1f2aa715f6956";
//        private String url = "https://api.weixin.qq.com/cgi-bin/token";
//        https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code
//        String para = "appid=wx7ecd406d76f8f179&secret=87e9b9102b9e142172d1f2aa715f6956"+
//
//
//        response.getWriter().print("success");
//        Enumeration<String> attributeNames = request.getAttributeNames();
//        Map<String, String[]> parameterMap = request.getParameterMap();
//
//        Set<String> strings = parameterMap.keySet();
//        for (String string : strings) {
//            System.out.println(string + "===" + parameterMap.get(string.toString()));
//        }
//        String enctypt_type = request.getParameter("enctypt_type");
//        System.out.println(enctypt_type);
//        String msg_signature = request.getParameter("msg_signature");
//
//        System.out.println(msg_signature);
    }

}
