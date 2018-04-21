package com.bdqn.mapper;

import com.bdqn.model.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherMapper {

    List<Teacher> selectTive(Teacher teacher);

    Teacher get(@Param("id")String id);

    int update(Teacher teacher);

    int delete(String id);
}