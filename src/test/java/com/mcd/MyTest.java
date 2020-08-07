package com.mcd;

import com.mcd.mapper.UserMapper;
import com.mcd.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by MaoChenDong on 2020/7/31.
 */

public class MyTest {
    @Test
    public void test() throws IOException {

        //废了好大劲整合 就是为了  调用方法 直接new一个类 然后调用类的方法就完事了    换言之 所有类 所有对象的所有实例 都具有了操作数据库的能力  自己本身就可以

//        String resources = "mybatis-config.xml";
//        InputStream in = Resources.getResourceAsStream(resources);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = mapper.selectUser();
//
//        for(User u:users){
//            System.out.println(u);
//        }


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        for (User u : userMapper.selectUser()) {
            System.out.println(u);

        }
    }
}
