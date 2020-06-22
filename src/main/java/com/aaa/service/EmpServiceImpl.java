package com.aaa.service;

import com.aaa.entity.Emp;
import com.aaa.mapper.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 郎老师
 * @company AAA软件教育
 * @title EmpServiceImpl
 * @date 2019/12/31 15:52
 */
@Service
public class EmpServiceImpl implements  EmpService {
    @Autowired
    private EmpDao empDao;
    @Override
    public int add(Emp emp) {
        if(emp==null){
            throw new RuntimeException("空异常");
        }
       return empDao.add(emp);
    }

    @Override
    public List<Emp> query() {
        return empDao.query();
    }
}
