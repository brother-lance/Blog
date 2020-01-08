package org.lw.base.api;

import java.util.List;

import org.lw.base.exceptions.BaseErrorCode;
import org.lw.base.exceptions.BaseException;
import org.lw.base.mapper.SubjectInfoMapper;
import org.lw.base.model.SubjectInfo;
import org.lw.base.utils.BeanCopyUtil;
import org.lw.base.utils.VerifyHelper;
import org.lw.base.vo.ResultRespVO;
import org.lw.base.vo.SubjectInfoVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 项目名称：Blog
 * 类 名 称：SubjectAPI
 * 类 描 述：主题
 * 创建时间：2019-12-11 11:24
 * 创 建 人：Lance.WU
 */
@RestController
@RequestMapping("/v1/subject")
public class SubjectAPI {


    @Resource
    private SubjectInfoMapper subjectInfoMapper;

    /**
     * 查询
     *
     * @param subjectVO 查询参数
     * @return 返回列表
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public Object list(SubjectInfoVO subjectVO) {

        ResultRespVO<List<SubjectInfoVO>> resp = new ResultRespVO<>();


        return resp;
    }

    /**
     * 添加
     *
     * @param subjectVO 添加对像
     * @return 返回
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Object add(@RequestBody SubjectInfoVO subjectVO) {

        ResultRespVO<SubjectInfoVO> resp = new ResultRespVO<>();

        try {

            VerifyHelper.validateObject(subjectVO);

            // 判断名称是否重复

            // 添加数据库
            SubjectInfo subjectInfo = BeanCopyUtil.objConvert(subjectVO, SubjectInfo.class);
            subjectInfoMapper.insert(subjectInfo);
            subjectVO=BeanCopyUtil.objConvert(subjectInfo, SubjectInfoVO.class);
            resp.setResult(subjectVO);

        } catch (BaseException e) {

            resp.error(e);

        } catch (Throwable e) {

            resp.error(BaseErrorCode.SYSTEM_ERROR);

        }

        return resp;
    }

    /**
     * 修改
     *
     * @param subjectVO 修改对像
     * @return 返回
     */
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public Object update(@RequestBody SubjectInfoVO subjectVO) {

        ResultRespVO<Boolean> resp = new ResultRespVO<>();

        // 判断对像是否存在

        // 修改数据库

        return resp;
    }

    /**
     * 删除
     *
     * @param id 删除编号
     */
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public Object delete(@PathVariable("id") long id) {

        ResultRespVO<Boolean> resp = new ResultRespVO<>();

        // 判断对像是否存在

        // 删除数据库

        return resp;
    }

    /**
     * 查询单个对像
     *
     * @param id 编号
     * @return 返回对像
     */
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Object get(@PathVariable("id") long id) {

        ResultRespVO<SubjectInfoVO> resp = new ResultRespVO<>();


        return resp;
    }

}
