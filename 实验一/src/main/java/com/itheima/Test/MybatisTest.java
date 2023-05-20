package com.itheima.Test;


import com.itheima.dao.Course;
import com.itheima.dao.School;
import com.itheima.mapper.SchoolMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class MybatisTest {
    @Test
    public void FindById(){
        String resources="mybatis-config.xml";
        Reader reader=null;
        try {
            reader=Resources.getResourceAsReader(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlMapper=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=sqlMapper.openSession();
        Course course=session.selectOne("Mapper.findById",2);
        System.out.println(course);
        /**UserMapper mapper=session.getMapper(UserMapper.class);
        Course course=mapper.findById(2);
        System.out.println(course);*/
        session.close();
    }

    @Test
    public void FindAll(){
        String resources="mybatis-config.xml";
        Reader reader=null;
        try {
            reader=Resources.getResourceAsReader(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlMapper=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=sqlMapper.openSession();
        SchoolMapper mapper=session.getMapper(SchoolMapper.class);
        List<School> schoolList=mapper.findAll(1);
        for (School school: schoolList) {
            System.out.println(school);
        }
        session.close();
    }

    @Test
    public void FindAll2(){
        String resources="mybatis-config.xml";
        Reader reader=null;
        try {
            reader=Resources.getResourceAsReader(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlMapper=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=sqlMapper.openSession();
        SchoolMapper mapper=session.getMapper(SchoolMapper.class);
        List<School> schoolList=mapper.findAll2();
        for (School school: schoolList) {
            System.out.println(school);
        }
        session.close();
    }

    @Test
    public void update(){
        Course course=new Course();
        course.setHours(40);
        course.setId(4);
        course.setName("⾼级Web技术");
        course.setSid(1);
        String resources="mybatis-config.xml";
        Reader reader=null;
        try {
            reader=Resources.getResourceAsReader(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlMapper=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=sqlMapper.openSession();
        session.update("Mapper.updateCourse",course);
        session.commit();
        session.close();
    }

    @Test
    public void insert(){
        Course course=new Course();
        course.setHours(32);
        //course.setId(5);
        course.setName("大数据存储");
        course.setSid(1);
        String resources="mybatis-config.xml";
        Reader reader=null;
        try {
            reader=Resources.getResourceAsReader(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlMapper=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=sqlMapper.openSession();
        session.insert("Mapper.student-insert",course);
        session.commit();
        session.close();
    }
}
