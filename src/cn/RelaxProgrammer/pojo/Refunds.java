package cn.RelaxProgrammer.pojo;

import java.util.Date;

/**
 * 创建添加定义退款申请
 */
public class Refunds {
    //创建退款原因
    private String refunds_reason;
    //创建退款价格
    private double refunds_price;
    //创建退款提交时间
    private Date refunds_createtime;
    //创建退款状态,1待回复，2申请成功，3卖家拒绝退款，0取消申请
    private int refunds_statues;
    //创建关闭时间
    private Date close_time;
    //创建卖家回复
    private String refunds_respond;
}
