package com.cskt.common.vo;

import com.cskt.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: 匡涛
 * Date: 2020/11/6 15:50
 *
 * @author 匡涛
 */
@ApiModel(description = "统一返回结果实体类")
@Data
public class ReturnResult implements Serializable {

    private static final long serialVersionUID = 8498339568530432116L;

    @ApiModelProperty(value = "是否成功")
    private boolean success;
    @ApiModelProperty(value = "错误码")
    private String errorCode;
    @ApiModelProperty(value = "返回消息")
    private String msg;
    @ApiModelProperty(value = "返回数据")
    private Object data;

    public ReturnResult(boolean success, String errorCode, String msg, Object data) {
        this.success = success;
        this.errorCode = errorCode;
        this.msg = msg;
        this.data = data;
    }


    /**
     * 操作成功，指定返回信息和数据
     *
     * @param msg
     * @param data
     * @return
     */
    public static ReturnResult ok(String msg, Object data) {
        return new ReturnResult(true, ErrorCodeEnum.OK.getErrorCode(), msg, data);
    }

    /**
     * 操作成功，指定返回数据
     *
     * @param data
     * @return
     */
    public static ReturnResult ok(Object data) {
        return ReturnResult.ok(ErrorCodeEnum.OK.getMsg(), data);
    }

    /**
     * 操作成功，无返回数据
     *
     * @return
     */
    public static ReturnResult ok() {
        return ReturnResult.ok(null);
    }

    /**
     * 操作失败，指定错误码，响应信息，响应数据
     *
     * @param errorCode
     * @param msg
     * @param data
     * @return
     */
    public static ReturnResult error(String errorCode, String msg, Object data) {
        return new ReturnResult(false, errorCode, msg, data);
    }

    /**
     * 操作失败，指定错误枚举对象
     *
     * @param errorCodeEnum
     * @return
     */
    public static ReturnResult error(ErrorCodeEnum errorCodeEnum) {
        return error(errorCodeEnum.getErrorCode(), errorCodeEnum.getMsg(), null);
    }

    /**
     * 操作失败，通用
     *
     * @return
     */
    public static ReturnResult error() {
        return error(ErrorCodeEnum.FAILED);
    }
}
