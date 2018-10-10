package com.aiit.model.vo.response;

/**
 * 响应消息
 * @author jfjiang
 */
public class ResponseMsg {
    /**
     * 返回码、返回描述
     */
    private KeyValuePair codeDesc;
    /**
     * 返回数据
     */
    private Object data;

    public ResponseMsg() {

    }

    public ResponseMsg(KeyValuePair codeDesc, Object data) {
        this.codeDesc = codeDesc;
        this.data = data;
    }

    public KeyValuePair getCodeDesc() {
        return codeDesc;
    }

    public void setCodeDesc(KeyValuePair codeDesc) {
        this.codeDesc = codeDesc;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
