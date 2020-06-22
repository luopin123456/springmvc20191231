package com.aaa.mapper;

import com.aaa.entity.Emp;

import java.util.List;

/**
 * @author 郎老师
 * @company AAA软件教育
 * @title EmpDao
 * @date 2019/12/31 15:52
 */
public interface EmpDao {
    int add(Emp emp);
    List<Emp> query();
}
