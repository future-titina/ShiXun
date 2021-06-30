package com.titina.shixun.mapper;

import com.titina.shixun.bean.UserBean;

public interface UserMapper {

    UserBean getInfo(String name, String author);
}
