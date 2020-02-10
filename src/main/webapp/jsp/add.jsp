<%--
  Created by IDEA.
  Author: YJ
  Date: 2020/2/5
  Time: 10:24
  To change this template use File | Settings | File Templates-Other
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
请编辑后，点击"添加"按钮<br/><br/>
<form action="${pageContext.request.contextPath}/addStu" method="get">
    学生姓名：<input type="text" name="name"><br/><br/>
    学生班级：<input type="text" name="classid"><br/><br/>
    老师姓名：<input type="text" name="teacher"><br/><br/>
    学生成绩：<input type="text" name="score"><br/><br/>
    <input type="submit" value="添加">
</form>
</body>
</html>
