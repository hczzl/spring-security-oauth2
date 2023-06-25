package com.luban.mapper;

import com.luban.bean.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author Fox
 */
@Repository
public interface UserMapper {

    @Select("select * from tb_user where username=#{username}")
    User getByUsername(String username);
}
