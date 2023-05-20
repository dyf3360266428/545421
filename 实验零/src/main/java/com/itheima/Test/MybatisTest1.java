package com.itheima.Test;


import com.itheima.dao.Course;
import com.itheima.dao.School;
import com.itheima.mapper.CourseMapper;
import com.itheima.mapper.SchoolMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class MybatisTest1 {

    private SchoolMapper mapper;

    @Before
    public void before() {
        String resources = "mybatis-config.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlMapper.openSession(true);
        mapper = session.getMapper(SchoolMapper.class);
    }

    @Test
    public void FindCourse() {
        List<School> schoolList = mapper.findAll(1);
        for (School school : schoolList) {
            System.out.println(school);
        }
    }

    @Test
    public void FindCourse1() {
        List<School> schoolList = mapper.findAll2();
        for (School school : schoolList) {
            System.out.println(school);
        }
    }
}