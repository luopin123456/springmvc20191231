<%--
  Created by IntelliJ IDEA.
  User: MrLang
  Date: 2019/12/31
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工录入</title>
</head>
<body>
<form action="/emp/add.action" method="post" >
    <div>编号:<input type="text" name="empno"/>  </div>
    <div>名称:<input type="text" name="ename"/> </div>
    <%--   <div>入职日期:<input type="date" name="hiredate"/> </div>--%>
    <div>职务:<input type="text" name="job"/> </div>
    <div>文件:<input type="file" name="file"/> </div>
    <div><input type="submit" value="提交"/> </div>
</form>
</body>
</html>
