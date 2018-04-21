package com.bdqn.service;

import com.bdqn.model.Teacher;
import com.github.pagehelper.PageInfo;

public interface TeacherService {
    PageInfo<Teacher> listPage(Teacher teacher, Integer pageNum, int pageSize);

    Teacher get(String id);

    int update(Teacher teacher);

    int delete(String id);
}
