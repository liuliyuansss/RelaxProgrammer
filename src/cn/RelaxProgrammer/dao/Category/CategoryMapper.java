package cn.RelaxProgrammer.dao.Category;

import cn.RelaxProgrammer.pojo.Category;

import java.util.List;

/**
 * 创建添加定义一个商品分类的接口
 */
public interface CategoryMapper {
    /**
     * 创建添加定义一个查询所有的分类商品的接口
     * @return
     */
    public List<Category> selectALLCategorys();
}
