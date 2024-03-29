package com.datahan.exception;

/**
 * 业务异常父类
 * @author Jim
 */
public class BizException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String msg;
    private String code;

    public BizException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public BizException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public BizException(String msg, String code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public BizException(String msg, String code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}