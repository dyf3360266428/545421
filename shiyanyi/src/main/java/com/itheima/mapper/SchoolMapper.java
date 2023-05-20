package com.itheima.mapper;

import com.itheima.dao.School;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface SchoolMapper {
   
    public List<School> findAll(int i);
    public List<School> findAll2();
}
