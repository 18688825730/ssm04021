package com.bdqn.service;

import com.bdqn.model.Position;

import java.util.List;

public interface DeptService {

    List<Position> getPositionByDeptId(String id);
}
