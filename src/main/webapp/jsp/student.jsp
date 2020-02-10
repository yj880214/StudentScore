<%--
  Created by IDEA.
  Author: YJ
  Date: 2020/2/4
  Time: 10:24
  To change this template use File | Settings | File Templates-Other
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生成绩管理系统页面</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.0.js"></script>
</head>
<body>
  <h1 align="center">学生成绩管理系统</h1>
  <%--条件搜索区域:搜索条件--%>
  <div align="center">
      <form id="myForm" action="${pageContext.request.contextPath}/getScore" method="get">
          学生姓名：<input type="text" name="name" value="${pageBean.name}" size="6">
          班级编号：<input type="text" name="classid" value="${pageBean.classid}" size="6">
          授课老师：<input type="text" name="teacher" value="${pageBean.teacher}" size="6"><br/><br/>
          学生成绩：<input type="text" name="scoreFrom" value="${pageBean.scoreFrom}" size="6">
                 --<input type="text" name="scoreTo" value="${pageBean.scoreTo}" size="6">
         <input type="submit" value="搜索">
     </form>
  </div>
  <%--数据展示区域--%>
   <table border="1" align="center">
       <tr>
           <td>学号</td>
           <td>学生姓名</td>
           <td>班级</td>
           <td>老师</td>
           <td>成绩</td>
           <td>操作</td>
       </tr>
       <c:forEach items="${pageInfo.list}" var="s">
           <tr>
               <td>${s.id}</td>
               <td>${s.name}</td>
               <td>${s.classid}</td>
               <td>${s.teacher}</td>
               <td>${s.score}</td>
               <td><a href="${pageContext.request.contextPath}/deleteStu?id=${s.id}">删除</a>||
                   <a href="${pageContext.request.contextPath}/selectOne?id=${s.id}">修改</a></td>
           </tr>
       </c:forEach>
   </table>

  <%--分页实现区域--%>
  <table align="center">
    <tr>
        <td><a href="${pageContext.request.contextPath}/getScore?pageNum=1">首页</a></td>
        <td><a href="${pageContext.request.contextPath}/getScore?pageNum=${pageInfo.prePage}">上一页</a></td>
        <td><a href="${pageContext.request.contextPath}/getScore?pageNum=${pageInfo.pageNum+1>pageInfo.pages?pageInfo.pages:pageInfo.nextPage}">下一页</a></td>
        <td><a href="${pageContext.request.contextPath}/getScore?pageNum=${pageInfo.pages}">尾页</a></td>
        <td>第${pageInfo.pageNum}页/共${pageInfo.pages}页</td>
        <td><a href="jsp/add.jsp">添加成绩</a></td>
    </tr>
  </table>
  <%--添加入口，进入添加页面--%>
  <%--<a href="jsp/add.jsp">添加信息</a>--%>
</body>
</html>
