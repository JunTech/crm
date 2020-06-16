package top.juntech.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author juntech
 * @Descripe 描述
 * @date 2020/6/16 22:56
 * @ClassName 类名
 * @Param 参数
 */
@Controller
public class IndexController {


    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
