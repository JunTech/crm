package top.juntech.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author juntech
 * @Descripe 課程列表控制器
 * @date 2020/6/16 23:09
 * @ClassName CourseOrderController
 * @Param 参数
 */
@Controller
@RequestMapping("courseorder")
public class CourseOrderController {

    @RequestMapping("/list")
    public String list(){
        return "courseorder/list";
    }

}
