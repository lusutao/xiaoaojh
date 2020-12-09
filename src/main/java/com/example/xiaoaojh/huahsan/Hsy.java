package com.example.xiaoaojh.huahsan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * 方法描述
 *
 * $param$ 参数描述
 * @author create by 作者 on $date$ $time$
 * @return $return$
 */
@RestController
public class Hsy {

    @GetMapping("/hello")
    public String tohello(String name){
        return "hello!"+name;
    }

    @GetMapping("/world")
    public void world(String name){
        tohello(name);
    }
}
