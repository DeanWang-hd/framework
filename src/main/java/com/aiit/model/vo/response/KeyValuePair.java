package com.aiit.model.vo.response;

/**
 * 键值对
 * @author jfjiang
 */
public class KeyValuePair {
    /**
     * 键
     */
    private String key;
    /**
     * 值
     */
    private String value;

    public KeyValuePair(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
