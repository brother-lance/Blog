package org.lw.base.exceptions;

import java.text.MessageFormat;

/**
 * 项目名称：Blog
 * 类 名 称：MessageHelper
 * 类 描 述：信息替换类
 * 创建时间：2019-12-11 11:31
 * 创 建 人：Lance.WU
 */
public class MessageHelper {

    /* 格式化含占位符的字符串
     *
     * @param msgTemplate    含占位符的字符串消息模板
     * @param positionValues 消息占位符取代变量，按参数顺序依次取代{0},{1},{2}...等
     * @return 用positionValues替换占位符后的字符串
     * @see java.text.MessageFormat#format(String, Object...)
     */
    public static String formatMsg(String msgTemplate, Object... positionValues) {

        try {
            return MessageFormat.format(msgTemplate, positionValues);
        } catch (Exception e) {
            StringBuilder buf = new StringBuilder("资源信息占位符替换异常，占位符参数信息：");
            for (int i = 0; i < positionValues.length; i++) {
                buf.append(" arg[" + i + "]=" + positionValues[i]);
            }
        }
        return msgTemplate;
    }
}
