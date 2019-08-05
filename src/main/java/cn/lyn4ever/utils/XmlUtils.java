package cn.lyn4ever.utils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.io.xml.XppDriver;

import java.io.Writer;

/**
 * @Author: 007
 * @Date: 2019/7/31 15:27
 * @Version: 1.0
 */
public class XmlUtils {

    /**
     * 在bean转xml时，得到XStream对象，这个对象是自动添加了转义内容的
     * xstream扩展,bean转xml自动加上![CDATA[]]
     *
     * @return 添加了前后缀的对象
     */
    private static XStream getMyXStream() {
//        这里可以用 new StaxDriver（），但是这类个类会生成xml头 <?xml version="1.0" ?>
        return new XStream(new XppDriver() {
            @Override
            public HierarchicalStreamWriter createWriter(Writer out) {
                return new PrettyPrintWriter(out) {
                    // 对所有xml节点都增加CDATA标记
                    boolean cdata = true;
                    String _name = "";

                    @Override
                    public void startNode(String name, Class clazz) {
                        _name=name;
                        super.startNode(name, clazz);
                    }

                    @Override
                    protected void writeText(QuickWriter writer, String text) {
                        if (cdata) {
                            if ("CreateTime".equals(_name)) {
                                writer.write(text);
                            } else {
                                writer.write("<![CDATA[");
                                writer.write(text);
                                writer.write("]]>");
                            }
                        } else {
                            writer.write(text);
                        }
                    }

                };
            }
        });
    }

    public static <T> T xmlToBean(String resultXml, Class clazz) {
        // XStream对象设置默认安全防护，同时设置允许的类
        XStream stream = new XStream(new DomDriver());
//        XStream.setupDefaultSecurity(stream);
        stream.allowTypes(new Class[]{clazz});
        stream.allowTypes(new Class[]{clazz.getSuperclass()});

        stream.processAnnotations(new Class[]{clazz});
        stream.processAnnotations(new Class[]{clazz.getSuperclass()});

//        stream.setMode(XStream.NO_REFERENCES);
        stream.alias("xml", clazz);
        return (T) stream.fromXML(resultXml);
    }


    /**
     * 由bean生成xml
     *
     * @param object
     * @return
     */
    public static String beanToXml(Object object) {
        XStream xstream = getMyXStream();
        xstream.alias("xml", object.getClass());//为类名节点重命名
        //对指定的类使用Annotations 进行序列化，这步非常关键,也就是按照类上的注解来生成xml标签
        xstream.processAnnotations(object.getClass());
        return xstream.toXML(object);
    }
}
