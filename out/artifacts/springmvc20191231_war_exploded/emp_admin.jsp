<%--
  Created by IntelliJ IDEA.
  User: MrLang
  Date: 2019/12/31
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工管理页面</title>
    <script src="static/js/jquery-1.12.4.js"></script>
    <script>
        $(function(){
            showData();
            $("#dialog").hide();//默认隐藏
        });

        function show(){
          $("#dialog").show(); //显示
        }
         //处理表单数据
        function handleForm(){
            var result=$("#formEmp").serialize();
            // alert(result);

         $.ajax({
             url:"/emp/add",
             type:"post",
             data:result, //表单序列化
             // dataType:"json", //返回的数据的类型
             success:function (data) {
                if(data=="ok"){
                    showData();//加载数据
                }
             }
         });
        }

        //显示数据
        function showData(){
            $("#data").empty();//清空数据
            $.ajax({
                url:"/emp/query",
                type:"get",
                // data:result, //表单序列化
                dataType:"json", //返回的数据的类型
                success:function (data) {
                    for(var i=0;i<data.length;i++){
                        $("#data").append("<div>"+data[i].empno+":"+data[i].ename+"</div>");
                    }
                }
            });
        }

    </script>
</head>
<body>
    <input type="button" value="录入" onclick="show()"/>
    <div id="dialog">
        <form action="/emp/add.action" method="post" id="formEmp" >
            <div>编号:<input type="text" name="empno"/>  </div>
            <div>名称:<input type="text" name="ename"/> </div>
             <div>入职日期:<input type="date" name="hiredate"/> </div>
            <div>职务:<input type="text" name="job"/> </div>
            <div>文件:<input type="file" name="file"/> </div>
            <div><input type="button" value="提交" onclick="handleForm()"/> </div>
        </form>
    </div>

    <div id="data">

    </div>

</body>
</html>
