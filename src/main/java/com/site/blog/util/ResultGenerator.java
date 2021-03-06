package com.site.blog.util;

import com.site.blog.constants.HttpStatusEnum;
import com.site.blog.dto.Result;
import org.springframework.util.StringUtils;

/**
 * 响应结果生成工具
 *
 * @author nanjie
 */
public class ResultGenerator {

    private ResultGenerator() {
    }

    public static <T> Result<T> getResultByHttp(HttpStatusEnum constants, String msg, T data) {
        Result<T> result = new Result<>();
        result.setResultCode(constants.getStatus());
        result.setMessage(msg);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> getResultByHttp(HttpStatusEnum constants, T data) {
        Result<T> result = new Result<>();
        result.setResultCode(constants.getStatus());
        result.setMessage(constants.getContent());
        result.setData(data);
        return result;
    }

    /**
     * @Description: 根据传入的常量返回对应result
     * @Param: [constants] http状态
     * @return: com.南街.blog.dto.Result
     * @date: 2019/8/24 16:25
     */
    public static Result<String> getResultByHttp(HttpStatusEnum constants) {
        Result<String> result = new Result<>();
        result.setResultCode(constants.getStatus());
        result.setMessage(constants.getContent());
        return result;
    }
}
