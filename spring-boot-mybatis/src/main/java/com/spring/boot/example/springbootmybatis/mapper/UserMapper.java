package com.spring.boot.example.springbootmybatis.mapper;

import com.spring.boot.example.springbootmybatis.dao.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User getUserById(Integer id);
}