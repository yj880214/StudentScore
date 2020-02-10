<%--
  Created by IDEA.
  Author: YJ
  Date: 2020/2/5
  Time: 15:36
  To change this template use File | Settings | File Templates-Other
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改编辑/提交页面</title>
</head>
<body>
   <form action="${pageContext.request.contextPath}/uddateStu" method="get">
       记录编号：<input type="text" readonly="readonly" name="id" value="${obj.id}"><br/><br>
       学生姓名： <input type="text" name="name" value="${obj.name}"><br/><br>
       学生班级：<input type="text" name="classid" value="${obj.classid}"><br/><br>
       老师姓名： <input type="text" name="teacher" value="${obj.teacher}"><br/><br>
       学生成绩：<input type="text" name="score" value="${obj.score}"><br/><br>
       <input type="submit" value="修改">
   </form>
</body>
</html>
