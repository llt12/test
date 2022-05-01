package org.yanqun.mapper;


import org.yanqun.entity.Student;

public interface StudentMapper {
 

    int deleteByPrimaryKey(int stuno);

    int insert(Student record);

    int insertSelective(Student record);
    
    Student selectByPrimaryKey(int stuno);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    Student selectoneStudent(int stuno);

    Student selectByKey(int stuno);
    Student selectIFStudent(Student student);
}