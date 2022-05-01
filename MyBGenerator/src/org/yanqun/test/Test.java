package org.yanqun.test;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.yanqun.entity.Student;
import org.yanqun.mapper.StudentMapper;

import java.io.IOException;
import java.io.Reader;

public class Test {

    static void selectStudent() throws Exception {
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        Student student = studentMapper.selectoneStudent(31);
        System.out.println(student);
        session.close();
    }

    static void selectByK() throws Exception {
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        Student student = studentMapper.selectByKey(31);
        System.out.println(student);        session.close();

    }

    static  void selectIfstu() throws Exception {
        Reader reader=Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=sessionFactory.openSession();
        StudentMapper studentMapper=session.getMapper(StudentMapper.class);
        Student stu=new Student();
//        stu.setStuno(32);
        stu.setStuname("zs");
        Student student=studentMapper.selectIFStudent(stu);
        System.out.println(student);
        session.close();

    }


    public Test() throws IOException {
    }

    public static void main(String[] args) throws Exception{
//        selectStudent();
//
//        System.out.println("=================");
//        selectByK();

        selectIfstu();


    }
}
