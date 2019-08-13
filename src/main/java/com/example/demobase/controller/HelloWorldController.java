package com.example.demobase.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-08-12 16:51
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public Map<String,Object> getHello(){
        Map<String,Object> map=new HashMap<>();
        map.put("msg", "ok");
        return  map;
    }
}
