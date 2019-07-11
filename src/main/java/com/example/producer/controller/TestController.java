package com.example.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * simple description
 *
 * @Description: java class description
 * @Author: 张昊
 * @CreateDate: 2019/7/11 8:34
 * @Version: 1.0
 * <p>Copyright: 内蒙古金财信息技术有限公司 (c) 2019</p>
 */
@RestController
public class TestController {

    @RequestMapping("/helloPerson")
    public String helloPerson(@RequestParam String name){
        return "hello " + name + " welcome our home";
    }
}
