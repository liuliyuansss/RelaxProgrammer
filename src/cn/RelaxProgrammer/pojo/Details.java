package cn.RelaxProgrammer.pojo;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * 创建添加定义一个商品详情类
 */
public class Details {
    //创建商品唯一编码
    private String details_code;
    //创建卖家对象
    private User sale_user;
    //创建商品名称
    private String details_name;
    //创建商品单价
    private double details_price;
    //创建商品的剩余库存
    private int details_count;
    //创建商品描述
    private String details_description;
    //创建视频地址
    private String details_movie;
    //创建图片介绍文件位置
    private List<String> images;
    //创建商品分类id
    private int details_category_id;
    //创建发货城市id
    private int details_area_id;
    //创建商品上架时间
    private Date details_createtime;

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getDetails_code() {
        return details_code;
    }
    //创建生成商品编码的策略
    public void setDetails_code(String details_code) {
        User u=new User();
        int number=new Random().nextInt(10000);
        details_code =u.getUser_code()+number;
        this.details_code = details_code;
    }

    public User getSale_user() {
        return sale_user;
    }

    public void setSale_user(User sale_user) {
        this.sale_user = sale_user;
    }

    public String getDetails_name() {
        return details_name;
    }

    public void setDetails_name(String details_name) {
        this.details_name = details_name;
    }

    public double getDetails_price() {
        return details_price;
    }

    public void setDetails_price(double details_price) {
        this.details_price = details_price;
    }

    public int getDetails_count() {
        return details_count;
    }

    public void setDetails_count(int details_count) {
        this.details_count = details_count;
    }

    public String getDetails_description() {
        return details_description;
    }

    public void setDetails_description(String details_description) {
        this.details_description = details_description;
    }

    public String getDetails_movie() {
        return details_movie;
    }

    public void setDetails_movie(String details_movie) {
        this.details_movie = details_movie;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public int getDetails_category_id() {
        return details_category_id;
    }

    public void setDetails_category_id(int details_category_id) {
        this.details_category_id = details_category_id;
    }

    public int getDetails_area_id() {
        return details_area_id;
    }

    public void setDetails_area_id(int details_area_id) {
        this.details_area_id = details_area_id;
    }

    public Date getDetails_createtime() {
        return details_createtime;
    }

    public void setDetails_createtime(Date details_createtime) {
        this.details_createtime = details_createtime;
    }

    //创建商品的成色
    private double mass;
    //创建退款申请
    public Refunds getRefunds() {
        return refunds;
    }

    public void setRefunds(Refunds refunds) {
        this.refunds = refunds;
    }

    //创建退款申请
    private Refunds refunds;
}
