package com.aaa.mapper;

import com.aaa.entity.Emp;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 郎老师
 * @company AAA软件教育
 * @title EmpDaoImpl
 * @date 2019/12/31 15:53
 */
@Repository
public class EmpDaoImpl implements EmpDao {
    List<Emp> empList=new ArrayList<>();
    @Override
    public int add(Emp emp) {
        System.out.println("录入:"+emp);
        empList.add(emp);
        return 1;
    }

    @Override
    public List<Emp> query() {
        System.out.println("查询数据:"+empList);
        return empList;
    }
}
