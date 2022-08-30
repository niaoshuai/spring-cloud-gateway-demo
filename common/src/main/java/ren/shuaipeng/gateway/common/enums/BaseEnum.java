package ren.shuaipeng.gateway.common.enums;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 公共枚举
 */
public interface BaseEnum {

    /**
     * 获取枚举的实际值
     *
     * @return
     */
    @JsonValue
    String getCode();

    /**
     * 获取枚举的描述
     *
     * @return
     */
    String getContent();
}
