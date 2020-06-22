package com.aaa.service;

import com.aaa.entity.Emp;

import java.util.List;

/**
 * @author 郎老师
 * @company AAA软件教育
 * @title EmpService
 * @date 2019/12/31 15:51
 */
public interface EmpService {
    int add(Emp emp);
    List<Emp> query();
}
