package org.lw.base.utils;

import lombok.extern.slf4j.Slf4j;
import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;
import org.lw.base.exceptions.BaseErrorCode;
import org.lw.base.exceptions.BaseException;

import java.util.List;

/**
 * 项目名称：Blog
 * 类 名 称：VerifyHelper
 * 类 描 述：
 * 创建时间：2019-12-11 16:05
 * 创 建 人：Lance.WU
 */
@Slf4j
public class VerifyHelper {

    private VerifyHelper() {
    }

    private static Validator validator = new Validator();

    /**
     * 请求参数非空、格式验证，请求对象
     *
     * @param object 请求校验参数
     */
    public static void validateObject(Object object) {
        List<ConstraintViolation> list = validator.validate(object);
        if (null != list && !list.isEmpty()) {
            throw new BaseException(BaseErrorCode.PARAMETER_INVALID,
                    list.get(0).getMessage());
        }
    }

    /**
     * 校验参数是否非空
     *
     * @param object 待验证对象
     */
    public static void validateNull(Object object) {
        if (object == null) {
            log.error("参数为空 异常");
            throw new BaseException(BaseErrorCode.PARAMETER_INVALID);
        }
    }
}


