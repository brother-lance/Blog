package org.lw.base.mapper;

import org.lw.base.model.SubjectInfo;

public interface SubjectInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SubjectInfo record);

    int insertSelective(SubjectInfo record);

    SubjectInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SubjectInfo record);

    int updateByPrimaryKey(SubjectInfo record);
}