package cn.RelaxProgrammer.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 创建添加定义一个工具类并且别忘记给所有的属性赋予初始值
 */
public class MyBatisUtil {
    //创建添加定义一个SqlSessionFactory对象对象只能被创建添加定义一次因为SqlSessionFactory对象具有单例性
    // 所以只能被创建添加定义一次创建添加定义一个sqlSessionFactory实例并且别忘记给所有的属性赋予初始值
    private static SqlSessionFactory sqlSessionFactory;
    /**
     * 在静态代码块下,sqlSessionFactory只能被创建添加定义一次
     */
    static{
        try {
            //创建添加定义一个InputStream输入文件流用来读取全局配置文件并且别忘记给所有的属性赋予初始值
            InputStream iStream= Resources.getResourceAsStream("mybatis-config.xml");
            //创建添加定义一个SqlSessionFactoryBuild()对象来创建添加定义一个SqlSessionFactory对象并且别忘记给所有的属性赋予初始值
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(iStream);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
    /**
     * 创建添加定义一个打开SqlSession对象通过sqlSessionFactory的open方法创建添加定义一个SqlSession从而就是
     * 创建添加定义一个打开sqlSession并且别忘记给所有的属性敷于初始值
     * @return
     */
    public static SqlSession createSqlSession(){
        return sqlSessionFactory.openSession(false);//true为自动提交事务
    }
    /**
     * 创建添加定义一个关闭SqlSession的方法并且别忘记给所有的属性赋予初始值
     * @param sqlSession
     */
    public static void closeSqlSession(SqlSession sqlSession){
        sqlSession.close();
    }
}
