package com.aaa.entity;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author 郎老师
 * @company AAA软件教育
 * @title Emp
 * @date 2019/12/30 17:27
 */
public class Emp {
    private Integer empno;
    private String ename;
    private String job;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hiredate;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", hiredate=" + hiredate +
                '}';
    }

    public Emp(Integer empno, String ename, String job, Date hiredate) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.hiredate = hiredate;
    }

    public Emp() {
    }
}
