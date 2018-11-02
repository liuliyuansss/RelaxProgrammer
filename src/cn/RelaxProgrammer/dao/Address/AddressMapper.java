package cn.RelaxProgrammer.dao.Address;

import cn.RelaxProgrammer.pojo.Address;

/**
 * 创建添加定义一个地址的数据库访问层
 */
public interface AddressMapper {
    //创建按照用户编码查询地址返回地址对象
    public Address CheckAddressByu(String user_code);
}
