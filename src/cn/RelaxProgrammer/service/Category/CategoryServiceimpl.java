package cn.RelaxProgrammer.service.Category;

import cn.RelaxProgrammer.dao.Category.CategoryMapper;
import cn.RelaxProgrammer.pojo.Category;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 创建添加顶一个查询所有的商品分类的实现类
 */
@Service("categoryService")
public class CategoryServiceimpl implements  CategoryService {
    @Resource
    private CategoryMapper categoryMapper;
    /**
     * 创建添加定义一个查询所有的商品分类的接口
     * @return
     */
    @Override
    public List<Category> selectALLCategorys() {
        return categoryMapper.selectALLCategorys();
    }
}
