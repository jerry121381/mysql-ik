package com.lxsy.modules.user.mapper;

import com.lxsy.modules.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @description: user mapper
 * @author: husj
 * @create: 2024-09-14
 **/
@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") Long id);
}
