package org.lw.base.exceptions;

/**
 * 项目名称：Blog
 * 类 名 称：ErrorCode
 * 类 描 述：测试码
 * 创建时间：2019-12-11 11:30
 * 创 建 人：Lance.WU
 */
public interface ErrorCode {

    /**
     * 获取错误码
     *
     * @return 错误编码
     */
    String getErrorCode();

    /**
     * 获取错误描述
     *
     * @return 错误描述
     */
    String getErrorDesc();

    /**
     * 设置错误描述信息
     *
     * @param errorMsg 错误信息
     */
    void setErrorDesc(String errorMsg);
}
