package org.lw.base.vo;/**
 * @author Lance.Wu
 * <p>
 * CREATE_DATE: 2018/10/15  20:06
 **/

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 描述：公共返回对像Vo
 *
 * @author : Lance.Wu
 * @version 1.0.0 Create: 2018/10/15 20:06
 **/
@Getter
@Setter
@ToString(callSuper = true)
public class ResultPageReqVO  implements Serializable {

    private long id;

    private int curPage=1;

    private int pageSize = 1000;

    /**
     * 分页标识
     */
    private boolean pageFlag = false;


    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startCreateAt;

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endCreateAt;

    public int getPage() {
        if (curPage == 0) {
            return 1;
        }
        return curPage;
    }


}
