package ren.shuaipeng.gateway.common.enums;

/**
 * 网关API公共枚举
 */
public enum GatewayApiRetEnum implements BaseEnum {

    OK("200", "OK"), SYSTEM_EXCEPTION("500", "服务异常"), TOO_MANY_REQUESTS("429", "限流 请求太多"),
    ;

    private String code;
    private String message;

    GatewayApiRetEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getContent() {
        return this.message;
    }
}
