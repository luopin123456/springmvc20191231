package com.aaa.controller;

import com.aaa.entity.Emp;
import com.aaa.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author 郎老师
 * @company AAA软件教育
 * @title EmpController
 * @date 2019/12/31 15:50
 */
@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;


   /* @RequestMapping("/add")
    public String add(Emp emp){
       if(empService.add(emp)>0){
           return "redirect:query";
       }else{
           return "error";
       }
    }

    @RequestMapping("/query")
    public String query(Map map){
        List<Emp> empList=empService.query();
        map.put("empList", empList);
        return "emp_list";
    }*/

    @RequestMapping("/add")
    @ResponseBody
    public String add(Emp emp){
        if(empService.add(emp)>0){
            System.out.println("1_______________________>");
            return "ok";
        }else{
            return "err";
        }

    }

    @RequestMapping("/query")
    @ResponseBody
    public List<Emp> query( ){
        List<Emp> empList=empService.query();
        return empList;
   }
}
