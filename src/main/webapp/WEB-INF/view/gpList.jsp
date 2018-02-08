<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/index_work.css" type="text/css"></link>
    <script type="text/javascript" src="<%= request.getContextPath()%>/js/jquery-1.8.2.js"></script>

  </head>
  
  <body>
  	<h3 align="center"><font size="14px">股票买卖管理</font></h3>
  	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  	<input type="button" value="买入" onclick="mr()">
  	&nbsp;&nbsp;
  	<input type="button" value="买出" onclick="mc()">
	<table>
		<tr>
			<th>股票代码</th>
			<th>名称</th>
		</tr>
		<c:forEach items="${user}" var="u">
			<tr>
				<td>
					${u.bid}
				</td>
				<td>
					${u.name}
				</td>
			</tr>
		</c:forEach>
	</table>
  </body>
</html>
