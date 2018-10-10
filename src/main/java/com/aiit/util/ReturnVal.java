package com.aiit.util;


import com.aiit.model.vo.response.ResponseCode;
import com.aiit.model.vo.response.ResponseMsg;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author 王海东
 * @date 2017/11/25
 */
public class ReturnVal {

    /**
     * 返回查询结果的状态
     * @param list 传入的集合
     * @return ResponseMsg
     */
    public static ResponseMsg returnVal(List<?> list) {
        ResponseMsg responseMsg = new ResponseMsg();
        if (list.size() == 0) {
            responseMsg.setCodeDesc(ResponseCode.SELECT_NULL);
        }else {
            responseMsg.setCodeDesc(ResponseCode.SUCCESS);
            responseMsg.setData(list);
        }
        return responseMsg;
    }

    /**
     * 返回{"num":"num", "name":"name"}格式
     * @param num 编号
     * @param name 名称
     * @return json字符串
     */
    public static JSONObject data(String num, String name){
        JSONObject json = new JSONObject();
        json.put("num", num);
        json.put("name", name);
        return json;
    }

    /**
     * 返回{"num":"num", "name":"name", "projectId":"projectId"}格式
     * @param num 编号
     * @param name 名称
     * @param projectId 培养方案id
     * @return json字符串
     */
    public static JSONObject dataCourse(String num, String name, String projectId){
        JSONObject json = new JSONObject();
        json.put("num", num);
        json.put("name", name);
        json.put("projectId", projectId);
        return json;
    }

    /**
     * 根据自然年获取学期(以2月份为分界点)
     * @param date 年份
     */
    public static int getTermByYear(Date date) {
        if (date != null) {
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            int term = 1;
            int month = c.get(Calendar.MONTH) + 1;
            if (month < 8 && month >= 2) {
                term = 2;
            }
            return term;
        } else {
            return 0000;
        }
    }

    /**
     * 获取系统当前年份、月份、时分秒
     */
    public static String getCurrYear() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return sdf.format(date);
    }

    /**
     * 格式：yyyy/MM/dd
     *
     * @param src 参数
     * @return date
     */
    public static Date getFmDate(String src) {
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Date date = null;
        try {
            date = format.parse(src);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 比较日期大小
     *
     * @param date1 第一个日期
     * @param date2 第二个日期
     * @return int 返回对比结果
     */
    public static int compareDate(String date1, String date2) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date dt1 = df.parse(date1);
            Date dt2 = df.parse(date2);
            if (dt1.getTime() > dt2.getTime()) {
                System.out.println("dt1 在dt2前");
                return 1;
            } else if (dt1.getTime() < dt2.getTime()) {
                System.out.println("dt1在dt2后");
                return -1;
            } else {
                return 0;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }

    /**
     * json 转 List<T>
     */
    public static <T> List<T> jsonToList(String jsonString, Class<T> clazz) {
        @SuppressWarnings("unchecked")
        List<T> ts = (List<T>) JSONArray.parseArray(jsonString, clazz);
        return ts;
    }


}