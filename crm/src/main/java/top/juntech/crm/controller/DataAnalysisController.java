package top.juntech.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author juntech
 * @Descripe 描述
 * @date 2020/6/16 23:19
 * @ClassName 类名
 * @Param 参数
 */
@Controller
@RequestMapping("dataanalysis")
public class DataAnalysisController {

    @RequestMapping("list")
    public String list(){
        return "dataanalysis/list";
    }
}
