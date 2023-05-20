package com.itheima.Test;


import com.itheima.dao.Course;
import com.itheima.mapper.CourseMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

public class MybatisTest {

    private CourseMapper mapper;
    @Before
    public void before(){
        String resources="mybatis-config.xml";
        Reader reader=null;
        try {
            reader=Resources.getResourceAsReader(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlMapper=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=sqlMapper.openSession(true);
        mapper=session.getMapper(CourseMapper.class);
    }
    @Test
    public void FindById(){
        Course course=mapper.findById(2);
        System.out.println(course);
    }


    @Test
    public void update(){
        Course course=new Course();
        course.setHours(40);
        course.setId(4);
        course.setName("⾼级Web技术");
        course.setSid(1);
        mapper.updateCourse(course);
    }

    @Test
    public void insert(){
        Course course=new Course();
        course.setHours(32);
        course.setName("大数据存储");
        course.setSid(1);
       mapper.studentInsert(course);
    }
}
