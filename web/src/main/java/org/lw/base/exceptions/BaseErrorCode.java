package org.lw.base.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 项目名称：Blog
 * 类 名 称：BaseErrorCode
 * 类 描 述：错误码
 * 创建时间：2019-12-11 11:37
 * 创 建 人：Lance.WU
 */
@Getter
@AllArgsConstructor
public enum BaseErrorCode implements org.lw.base.exceptions.ErrorCode {

    SUCCESS("0000", "成功"),
    SYSTEM_ERROR("SYSTEM_ERROR", "系统异常"),
    PARAMETER_INVALID("PARAMETER_INVALID", "参数校验不通过"),


    ;

    /*
     * 错误码
     */
    private String errorCode;

    /**
     * 错误描述
     */
    private String errorDesc;


    @Override
    public String getErrorCode() {
        return errorCode;
    }

    @Override
    public String getErrorDesc() {
        return errorDesc;
    }

    @Override
    public void setErrorDesc(String errorMsg) {
        this.errorDesc = errorMsg;
    }

    public BaseErrorCode setErrorDescParam(String... strs) {
        this.errorDesc = String.format(this.getErrorDesc(), strs);
        return this;
    }

    public BaseErrorCode setErrorDesc(String errorMsg, String... strs) {
        this.errorDesc = String.format(errorMsg, strs);
        return this;
    }
}
