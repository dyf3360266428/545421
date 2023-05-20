package com.itheima.mapper;

import com.itheima.dao.School;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SchoolMapper {
    @Select("select * from s_school where id=#{id}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "schoolname",property = "schoolname"),
            @Result(column = "id",property = "CourseList",javaType = List.class,
                    many=@Many(select = "com.itheima.mapper.CourseMapper.findBySid"))
    })
   public List<School> findAll(int id);



    @Select("select * from s_school ")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "schoolname",property = "schoolname"),
            @Result(column = "id",property = "CourseList",javaType = List.class,
                    many=@Many(select = "com.itheima.mapper.CourseMapper.findBySid"))
    })
    public List<School> findAll2();

}
