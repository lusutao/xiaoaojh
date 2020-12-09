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
    public String huashanzm(String name){
	system.out.println("我会华山剑法");
        return "华山派掌门："+name;
	
    }

    @GetMapping("/world")
    public void linghuchong(String name){
        tohello(name);
	system.out.println("我会华山剑法,还会独孤九剑！！！");
    }
}
