package cn.ibubbo.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author: uncle
 * @apdateTime: 2017/10/23
 * @describe:
 */
@Controller
@RequestMapping(value = "/swagger/")
public class SwaggerController {

    @ApiOperation(value = "测试方法一", notes = "", httpMethod = "GET")
    @RequestMapping(value = "test01")
    public String test01(@ApiParam(name = "name", value = "姓名", required = true) String name,
                         @ApiParam(name = "age", value = "年龄", required = true) Integer age) {

        return "";
    }

    @ApiOperation(value = "测试方法二", notes = "", httpMethod = "POST")
    @RequestMapping(value = "test02")
    public String test02(@ApiParam(name = "name", required = true) String name,
                         @ApiParam(name = "session", required = true) HttpSession session) {

        return "";
    }
}
