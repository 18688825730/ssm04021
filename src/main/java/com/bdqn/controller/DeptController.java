package com.bdqn.controller;

import com.bdqn.model.Position;
import com.bdqn.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/{deptId}")
    @ResponseBody
    public List<Position> getPositionByDeptId(@PathVariable("deptId") String id){
        List<Position> positions = deptService.getPositionByDeptId(id);
        System.out.println(positions.toString());
        return positions;
    }

}
