package com.my.api.mapper;
import com.my.api.mapper.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * author: liqm
 * 2020-04-22
 */
@Mapper
public interface BaseMapper{

    @Insert("insert into user(id,name) values(#{id}, #{name})")
    void save(User user);
}
