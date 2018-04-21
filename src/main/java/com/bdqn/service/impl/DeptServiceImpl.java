package com.bdqn.service.impl;

import com.bdqn.mapper.DeptMapper;
import com.bdqn.model.Position;
import com.bdqn.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("deptService")
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Position> getPositionByDeptId(String id) {

        return deptMapper.getPositionByDeptId(id);
    }
}
