package org.lw.base.vo;/**
 * @author Lance.Wu
 * <p>
 * CREATE_DATE: 2018/10/15  20:06
 **/

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.lw.base.exceptions.BaseException;
import org.lw.base.exceptions.ErrorCode;

/**
 * 描述：公共返回对像Vo
 *
 * @author : Lance.Wu
 * @version 1.0.0 Create: 2018/10/15 20:06
 **/
@Getter
@Setter
@ToString
public class ResultRespVO<T> {

    public ResultRespVO() {
        this.status = "0000";
        this.message = "交易成功";
    }

    private String status;

    private String message;

    private int total;

    private T result;

    private int limit = 10;

    private int curPage;
    //总页数
    private int pages;

    public int getPages() {

        return (total - 1) / limit + 1;
    }


    public void clear() {
        this.result = null;
        this.total = 0;
    }

    public void error(String msg) {
        this.total = 0;
        this.status = "SYSTME_ERROR";
        this.message = msg;
    }

    public void error(String code, String msg) {
        this.total = 0;
        this.status = code;
        this.message = msg;
    }


    public void error(BaseException e) {
        this.total = 0;
        this.status = e.getErrorCode().getErrorCode();
        this.message = e.getMessage();
    }

    public void error(ErrorCode e) {
        this.total = 0;
        this.status = e.getErrorCode();
        this.message = e.getErrorDesc();
    }


    @Override
    public String toString() {
        return JSONObject.toJSON(this).toString();
    }
}
