package com.bdqn.service.impl;

import com.bdqn.mapper.TeacherMapper;
import com.bdqn.model.Teacher;
import com.bdqn.service.TeacherService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public PageInfo<Teacher> listPage(Teacher teacher, Integer pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Teacher> list = teacherMapper.selectTive(teacher);
        PageInfo<Teacher> pageInfo = new PageInfo<Teacher>(list);
        pageInfo.setList(list);
        return pageInfo;
    }

    @Override
    public Teacher get(String id) {
        return teacherMapper.get(id);
    }

    @Override
    public int update(Teacher teacher) {
        teacherMapper.update(teacher);

        return 0;
    }

    @Override
    public int delete(String id) {


        return teacherMapper.delete(id);
    }
}
