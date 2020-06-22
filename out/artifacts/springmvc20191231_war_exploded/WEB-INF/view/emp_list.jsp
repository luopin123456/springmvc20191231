<%--
  Created by IntelliJ IDEA.
  User: MrLang
  Date: 2019/12/31
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
    .tb{border: 1px solid blue; border-collapse: collapse;width:100%}
    .tb td{border:1px solid blue;}
</style>
<html>
<head>
    <title>显示数据</title>
</head>
<body>
    <div>items="${empList}":获取model中key的值</div>
    <div>var="emp":从集合中获取的每一项的元素：对象：emp，自定义名字</div>
    <table class="tb">
        <tr>
            <td>编号</td>
            <td>名称</td>
            <td>职务</td>
            <td>入职日期</td>
        </tr>
        <c:forEach items="${empList}"   var="emp">
           <tr>
               <td>${emp.empno}</td>
               <td>${emp.ename}</td>
               <td>${emp.job}</td>
               <td>${emp.hiredate}</td>
           </tr>
        </c:forEach>
    </table>

</body>
</html>
