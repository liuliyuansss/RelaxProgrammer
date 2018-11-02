package cn.RelaxProgrammer.controller;

import com.miaodiyun.httpApiDemo.AccountInfo;
import com.miaodiyun.httpApiDemo.IndustrySMS;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SMSController {
    @RequestMapping("/sendsms")
    public  String send(){
        // 获取开发者账号信息
        AccountInfo.execute();
        // 验证码通知短信接口
        IndustrySMS.execute();
        System.out.println("已经进入该方法");
        return "send";
    }
}
