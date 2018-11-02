package cn.RelaxProgrammer.pojo;

import java.util.Date;
import java.util.List;

/**
 * 创建添加定义一个用户实体类
 */
public class User {
    //创建用户后台生成的唯一编码
    private String user_code;

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_image() {
        return user_image;
    }

    public void setUser_image(String user_image) {
        this.user_image = user_image;
    }

    //创建用户自定义用户名称不可与其他用户名重复
    private String user_name;
    //创建用户密码
    private String user_password;

    public String getUser_identity() {
        return user_identity;
    }

    public void setUser_identity(String user_identity) {
        this.user_identity = user_identity;
    }

    //创建用户身份证号码
    private String user_identity;


    public Date getUser_birthday() {
        return user_birthday;
    }

    public void setUser_birthday(Date user_birthday) {
        this.user_birthday = user_birthday;
    }

    public int getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(int user_sex) {
        this.user_sex = user_sex;
    }

    //创建用户出生日期
    private Date user_birthday;
    //创建用户性别1=男，2=女
    private int user_sex;
    //创建用户邮箱地址
    private String user_email;

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    //创建用户手机号码
    private String user_phone;

    public int getUser_reputation() {
        return user_reputation;
    }

    public void setUser_reputation(int user_reputation) {
        this.user_reputation = user_reputation;
    }
   //创建用户的信誉度
    private int user_reputation;
    //创建用户的头像名称
    private String user_image;

    public Date getUser_createdate() {
        return user_createdate;
    }

    public void setUser_createdate(Date user_createdate) {
        this.user_createdate = user_createdate;
    }

    //创建用户注册时间
    private Date user_createdate;
    //创建用户收货地址集合
    private List<Address> address;
}
