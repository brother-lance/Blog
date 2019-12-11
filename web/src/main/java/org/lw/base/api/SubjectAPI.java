package org.lw.base.api;

import java.util.List;

import org.lw.base.vo.ResultRespVO;
import org.lw.base.vo.SubjectVO;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 查询
     * @param subjectVO 查询参数
     * @return 返回列表
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public Object list(SubjectVO subjectVO) {

        ResultRespVO<List<SubjectVO>> resp = new ResultRespVO<>();


        return resp;
    }

    /**
     * 添加
     *
     * @param subjectVO 添加对像
     * @return 返回
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Object add(@RequestBody SubjectVO subjectVO) {

        ResultRespVO<SubjectVO> resp = new ResultRespVO<>();


        return resp;
    }

    /**
     * 修改
     *
     * @param subjectVO 修改对像
     * @return 返回
     */
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public Object update(SubjectVO subjectVO) {

        ResultRespVO<Boolean> resp = new ResultRespVO<>();


        return resp;
    }

    /**
     * 删除
     * @param id 删除编号
     */
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public Object delete(@PathVariable("id") long id) {

        ResultRespVO<Boolean> resp = new ResultRespVO<>();


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

        ResultRespVO<SubjectVO> resp = new ResultRespVO<>();


        return resp;
    }

}
