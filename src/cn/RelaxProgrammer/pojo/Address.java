package cn.RelaxProgrammer.pojo;

/**
 * 创建添加定义一个地址类
 */
public class Address {
    //创建地址编码
    private String address_code;
    //创建是否为默认地址1=是，0=否
    private int isdefault;

    public String getAddress_code() {
        return address_code;
    }

    public void setAddress_code(String address_code) {
        this.address_code = address_code;
    }

    public int getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(int isdefault) {
        this.isdefault = isdefault;
    }

    public int getArea_id() {
        return area_id;
    }

    public void setArea_id(int area_id) {
        this.area_id = area_id;
    }

    public String getDetail_address() {
        return detail_address;
    }

    public void setDetail_address(String detail_address) {
        this.detail_address = detail_address;
    }

    public int getUser_time() {
        return user_time;
    }

    public void setUser_time(int user_time) {
        this.user_time = user_time;
    }

    //创建地区id
    private int area_id;
    //创建详细地址
    private String detail_address;
    //创建地址使用次数
    private int user_time;
}
