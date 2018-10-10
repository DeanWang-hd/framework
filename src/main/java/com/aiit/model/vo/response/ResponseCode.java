package com.aiit.model.vo.response;

/**
 * 返回码及说明
 * @author jfjiang
 */
public final class ResponseCode {
    public final static KeyValuePair SUCCESS = new KeyValuePair("200", "请求成功");
    public final static KeyValuePair LOGIN_ERROR = new KeyValuePair("202", "登陆失败");
    public final static KeyValuePair LOGIN_EXPIRE = new KeyValuePair("203", "登陆过期");
    public final static KeyValuePair ARGS_ERROR = new KeyValuePair("501", "参数错误");
    public final static KeyValuePair UNKOWN_ERROR = new KeyValuePair("502", "未知错误");
    public final static KeyValuePair INSERT_ERROR = new KeyValuePair("503", "插入数据库失败");
    public final static KeyValuePair UPDATE_ERROR = new KeyValuePair("504", "更新数据库失败");
    public final static KeyValuePair ACCESS_LIMITED = new KeyValuePair("301", "权限受限");
    public final static KeyValuePair UPLOAD_ERROR = new KeyValuePair("506", "文件上传失败");
    public final static KeyValuePair DELETE_ERROR = new KeyValuePair("507", "删除失败");
    public final static KeyValuePair CODE_ERROR = new KeyValuePair("508", "验证码校验失败");
    public final static KeyValuePair SELECT_NULL = new KeyValuePair("509", "查询为空");
    public final static KeyValuePair USERNAME_ERROR = new KeyValuePair("510", "用户名已存在");
    public final static KeyValuePair SCHOOLNAME_ERROR = new KeyValuePair("511", "学校名称错误");
    public final static KeyValuePair NO_PAID_PLAN = new KeyValuePair("512", "用户未购买方案");
    public final static KeyValuePair INPUT_REPEAT = new KeyValuePair("513", "录入重复");
    public final static KeyValuePair INDEX_UP_ERROR = new KeyValuePair("514", "无法上移");
    public final static KeyValuePair INDEX_DOWN_ERROR = new KeyValuePair("515", "无法下移");
    public final static KeyValuePair SURVEY_NO_END = new KeyValuePair("516", "上一轮调查尚未结束");
    public final static KeyValuePair PASSWORD_IS_INCONSISTENT = new KeyValuePair("517", "密码不一致");
    public final static KeyValuePair PASSWORD_ERROR = new KeyValuePair("518", "密码错误");
    public final static KeyValuePair DOWNLOAD_ERROR = new KeyValuePair("519", "文件下载失败");
    public final static KeyValuePair SQLEXECUTE_ERROR = new KeyValuePair("520", "语句执行失败");
    public final static KeyValuePair DATA_EXCEPTION = new KeyValuePair("521", "数据异常UserCondition");
}