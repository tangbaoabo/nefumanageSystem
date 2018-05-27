package cn.edu.nefu.exception;

/**
 * 登陆状态
 *
 * @author 唐学俊
 * @create 2018/05/27
 **/
public enum LoginStatus {
    SUCCESS(0, "success"),
    INVALID_TOKEN(1500, "登陆信息已经过期,请重新登陆"),
    ILLEAGUE_PARAMS(5000, "未知异常"),;

    private int code;
    private String msg;

    LoginStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
