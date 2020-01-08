package org.lw.base.model;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;


@Getter
@Setter
@ToString
public class SubjectInfo {

    private Long id;

    private String name;

    private Long parentId;

    private String desc;

    private String status;

    private String createdBy;

    private Date createdAt;

    private String updatedBy;

    private Date updatedAt;

}