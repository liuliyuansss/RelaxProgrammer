package cn.RelaxProgrammer.pojo;

import java.util.Date;

/**
 * 创建添加定义订单唯一商品表
 */
public class Order {
    //创建订单唯一编码
    private  String order_code;
    //创建卖家对象
    private  User sale_user;
    //创建买家对象
    private User buy_user;
    //创建订单创建时间
    private Date create_time;
    //创建付款时间
    private Date pay_time;
    //创建订单完成时间
    private Date final_paytime;
    //创建订单关闭时间
    private Date close_time;
    //创建收货地址编码
    private String address_code;
    //创建订单状态，1待付款，2已付款，3已完成，0已取消，4待查看
    private int statues;
    //创建卖家备注
    private String remark;
    //创建运费
    private double expenses;
    //创建最终付款金额
    private double final_pay;
    //创建退款申请
    private Refunds refounds;
}
