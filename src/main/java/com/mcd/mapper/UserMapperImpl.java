package com.mcd.mapper;

import com.mcd.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * Created by MaoChenDong on 2020/8/1.
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
//    //为什么多一个类  spring牛 会自动创建  你再牛逼 mybatis都不是你的  你总不会自己创建吧    所以多出的这个类 就是解决这个bug
//
//    //我们所有操作 都是用sqlsession来执行 在原来  现在整合了 费那么多劲 就是为了 所有操作 都是用sqlsessiontemplate
//
//    //第一步 把sqlsessiontemplate 拿出来
//    private SqlSessionTemplate sqlSession;
//    //第二步 注入灵魂   然后为所欲为
//    public void setSqlSession(SqlSessionTemplate sqlSession) {
//        this.sqlSession = sqlSession;
//    }
//
//
//
//
////    !!!!   写了 extends SqlSessionDaoSupport  就可以不写 set方法


    @Override
    public List<User> selectUser() {
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


        User user = new User(7, "xiaowaanngg", "123");
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
     mapper.addUser(user);
       mapper.deleteUse(5);



        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUse(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUse(id);
    }
}
