package com.mcd.mapper;

import com.mcd.pojo.User;

import java.util.List;

/**
 * Created by MaoChenDong on 2020/7/31.
 */
public interface UserMapper {
    public List<User> selectUser();
}
