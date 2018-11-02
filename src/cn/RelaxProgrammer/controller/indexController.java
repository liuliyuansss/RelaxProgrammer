package cn.RelaxProgrammer.controller;

import cn.RelaxProgrammer.pojo.Category;
/*import cn.RelaxProgrammer.service.Category.CategoryService;*/
import cn.RelaxProgrammer.service.Category.CategoryService;
import cn.RelaxProgrammer.service.User.userService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * 创建天津定义一个首页控制器类
 */
@Controller
public class indexController {
    @Resource
    private CategoryService categoryService;
    @Resource
    private userService userService;
    @RequestMapping(value = {"/","/index"},method = RequestMethod.GET)
    public String index(Model model){
       /* System.out.println("进入该方法");
        model.addAttribute("Category1",categoryService.selectAllCategory());
        List<Category> l=categoryService.selectAllCategory();
        System.out.println("*****************************************************************************"+l.size());
        model.addAttribute("ee",categoryService.ss("数码产品"));*/
        List<Category> llll=categoryService.selectALLCategorys();
        System.out.println("**********************************************************"+llll);
        model.addAttribute("Category1",llll);
        return "index";
    }
    @RequestMapping(value = "/index1",method = RequestMethod.GET)
    public String indexone(Model model,String user_code){
        System.out.println("进入该方法！！！！！！！！！！！！！！！！！！！！！！！！！！");
        String p=userService.CheckPasswordByu("199712091536015982");
        model.addAttribute("r",p);
        return "index";
    }
}
