package ren.shuaipeng.gateway.common.vo;

import lombok.Data;
import ren.shuaipeng.gateway.common.enums.GatewayApiRetEnum;

@Data
public class GatewayApiRetVO<T> {

    private GatewayApiRetEnum code;
    private T data;
    private String message;
}
