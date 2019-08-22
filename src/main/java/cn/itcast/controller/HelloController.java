package cn.itcast.controller;

import cn.itcast.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人 xgh
 * @创建时间 2019/8/1610:18
 * @描述
 */
@RestController
@Slf4j
public class HelloController {
    @Autowired
    private User user;

    //@RequestMapping("/hello")
    @GetMapping("/user/hello")
    public String sayHello(){
        return "这是我的第一个springboot项目";
    }
    @GetMapping("hello/hello")
    public String sayHello1(){
        return "这是我的userspringboot项目";
    }
}
