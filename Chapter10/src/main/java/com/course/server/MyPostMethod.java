package com.course.server;


import com.course.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@Api(value="/",description = "这是我全部到的post请求")
@RequestMapping("/v1")
public class MyPostMethod {
    //这个变量用来装我们的cookies信息的
    private static Cookie cookie;
    //用户登录成功获取到cookies，然后在访问其他接口获取列表
    @RequestMapping(value="/login",method = RequestMethod.POST)
    @ApiOperation(value="登录接口，成功后获取cookies信息",httpMethod = "POST")
    public String login(HttpServletResponse response,
                        @RequestParam(value ="username",required = true) String username,
                        @RequestParam(value ="password",required = true) String password){

        if(username.equals("zhangsan")&&password.equals("123456")){
            cookie = new Cookie("login","true");
            response.addCookie(cookie);
            return "恭喜你登录成功了";
        }
        return "用户名或者密码错误";
    }
    @RequestMapping(value="/getUserList",method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表",httpMethod = "POST")
    public String getUserList(HttpServletRequest request,
                            @RequestBody User u){
        //获取cookies
        Cookie[] cookies = request.getCookies();
        User user;
        //验证cookies是否合法
        for(Cookie c : cookies){
            if(c.getName().equals("login")
                    &&c.getValue().equals("true")
                    &&u.getUsername().equals("zhangsan")
                    &&u.getPassword().equals("123456")){
                user = new User();
                user.setName("lisi");
                user.setAge("18");
                user.setSex("man");
                return user.toString();
            }
        }
        return "参数不合法";
    }

}
