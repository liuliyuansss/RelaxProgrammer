package cn.RelaxProgrammer.dao.User;

import cn.RelaxProgrammer.pojo.Address;
import cn.RelaxProgrammer.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;

/**
 * 创建添加定义用户的数据库访问层
 */

public interface UserMapper {
    // （王同言）创建按照用户名和用户密码查询用户编码
    public User CheckUser(@Param("user_name") String user_code, @Param("user_password") String user_password);
    //（刘建达）创建按照用户手机号码查询用户编码
    public String CheckCodeByp(@Param("user_phone") String user_phone);
    //（刘建达）创建按照用户名称查询用户编码
    public String CheckCodeByn(@Param("user_name") String user_name);
    //（刘建达）创建按照用户邮箱地址查询用户编码
    public String CheckCodeBye(@Param("user_email") String user_email);
    //（刘建达）创建按照用户编码查询用户对象
    public User CheckCodeByu(String user_code);
    //（刘建达）创建按照用户编码查密码
    public String CheckPasswordByu(String user_code);
}
