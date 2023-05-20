package com.itheima.mapper;

import com.itheima.dao.Course;
import com.itheima.dao.School;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CourseMapper {
    @Select("select * from s_student where id=#{id}")
    public Course findById(int id);

    @Update(" update s_student set hours=#{hours} where id=#{id}")
    public void updateCourse(Course course);

    @Insert(" insert into s_student values(#{id},#{name},#{hours},#{sid})")
    public void studentInsert(Course course);

    @Select("select * from s_student where sid=#{sid}")
    public Course findBySid(int sid);
}
