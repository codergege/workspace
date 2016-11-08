package cn.codergege.packagename.dao;

import cn.codergege.packagename.model.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}