package com.aiit.controller;

import com.aiit.model.vo.response.ResponseCode;
import com.aiit.model.vo.response.ResponseMsg;
import com.aiit.service.impl.TestServiceImpl;
import com.aiit.util.ReturnVal;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 王海东
 * @date 2018/1/7 2:58
 */
@RestController
@RequestMapping(value = "Test", produces = {"application/json;charset=UTF-8", "text/plain;charset=UTF-8"})
@Api(value = "", description = "测试接口")
public class TestController {

    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Resource
    private TestServiceImpl testService;

    @ApiOperation(value = "测试")
    @RequestMapping(value="selectCount",method = RequestMethod.GET)
    public ResponseMsg selectCount(@ApiParam(value = "数字",name = "number")@RequestParam Integer number){
        ResponseMsg responseMsg = new ResponseMsg();
        if(number != null) {
            responseMsg.setCodeDesc(ResponseCode.SUCCESS);
            responseMsg.setData(number);
        }else {
            responseMsg.setCodeDesc(ResponseCode.SELECT_NULL);
        }
        return responseMsg;
    }

    @ApiOperation(value = "测试service")
    @ResponseBody
    @RequestMapping(value = "testService",method = RequestMethod.POST)
    public String testService(@ApiParam(value = "输入的内容",name = "content") @RequestParam String content){
        String msg = "你好，你输入的内容是：";
        msg += content;
        return msg;
    }

    @ApiOperation(value = "测试test")
    @RequestMapping(value = "testGet",method = RequestMethod.GET)
    public String testGet(@ApiParam(value = "姓名",name = "name") @RequestParam String name){

        return name;
    }

    @ApiOperation(value = "测试json")
    @ResponseBody
    @RequestMapping(value="selectData",method = RequestMethod.POST)
    public Map<String,Object> selectData(HttpServletResponse response, @ApiParam(value = "编号",name = "number")@RequestParam Integer number,
                                         @ApiParam(value = "姓名",name = "name")@RequestParam String name,
                                         @ApiParam(value = "性别",name = "sex")@RequestParam String sex){
        response.setHeader("Access-Control-Allow-Origin", "*");
        Map<String,Object> result = new HashMap<>(16);
        result.put("id",number);
        result.put("name",name);
        result.put("sex",sex);
        return result;
    }

    @ApiOperation(value = "测试lisJson")
    @ResponseBody
    @RequestMapping(value = "listJson",method = RequestMethod.POST)
    public List<Object> listJson(@ApiParam(value = "编号1",name = "number1")@RequestParam String number1,
                                 @ApiParam(value = "姓名1",name = "name1")@RequestParam String name1,
                                 @ApiParam(value = "性别1",name = "sex1")@RequestParam String sex1,
                                 @ApiParam(value = "编号2",name = "number2")@RequestParam String number2,
                                 @ApiParam(value = "姓名2",name = "name2")@RequestParam String name2,
                                 @ApiParam(value = "性别2",name = "sex2")@RequestParam String sex2) {
        List<Object> listResult = new ArrayList<>();
        //人员一
        Map<String,Object> map1 = new HashMap<>(16);
        map1.put("id",number1);
        map1.put("name",name1);
        map1.put("sex",sex1);
        //人员二
        Map<String,Object> map2 = new HashMap<>(16);
        map2.put("id",number2);
        map2.put("name",name2);
        map2.put("sex",sex2);

        listResult.add(map1);
        listResult.add(map2);
        return listResult;
    }

    @RequestMapping(value = "hello", method = RequestMethod.POST)
    @ApiOperation(value = "测试")
    public ResponseMsg selectUser(HttpServletRequest request,
                                  @ApiParam(value = "姓名",name = "name")@RequestParam String name) {
        //logger.info("======user查询开始======");
        //logger.info("user：" + user.getName());
        //logger.info("======user查询结束======");
        String dataBase = (String) request.getAttribute("dataBase");
        return ReturnVal.returnVal(testService.getUser(dataBase, name));
    }
}
