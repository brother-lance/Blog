package org.lw.base.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 项目名称：Blog
 * 类 名 称：SubjectVO
 * 类 描 述：主题对像
 * 创建时间：2019-12-11 11:26
 * 创 建 人：Lance.WU
 */
@Getter
@Setter
@ToString
public class SubjectInfoVO extends ResultPageReqVO {

    private long id;

    private String name;

    private long parentId;

    private String desc;

    private String status;

    private String createdBy;

    private Date createdAt;

    private String updatedBy;

    private Date updatedAt;
}
