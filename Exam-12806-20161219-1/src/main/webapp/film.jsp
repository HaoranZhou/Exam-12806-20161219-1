<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="Ben.Customer"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">		
		<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>	
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>		
		<meta charset="utf-8" />
		<title></title>
	</head>
	<body>
		<%Customer cus=(Customer)session.getAttribute("Customer"); 
		%>
		<div class="container">
		<div class="pull-right">欢迎你<%=cus.getFirst_name() %></div>
		
		<div class="table-responsive">	
		<li><a href="add.jsp"><button class="btn btn-success">新增</button></a></li>
		<table id="table" class="table table-bordered table-hover">
			<thead>
				<tr>
					<th>电影序号</th>
					<th>电影标题</th>
					<th>电影内容简介</th>
					<th>电影语种</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${FilmList}" var="FilmList" varStatus="vs">  
				<tr>
					<input type="hidden" value="1" >
					<td>${FilmList.film_id}</td>
					<td>${FilmList.title}</td>
					<td>${FilmList.description}</td>
					<td>${FilmList.language}</td>
					<td>
				<ul class="nav nav-tabs">
			  
			  <li><a href="update.jsp?id=${FilmList.film_id}"><button class="btn btn-success">更新</button></a></li>
			  <li><a href="DeleteServlet?id=${FilmList.film_id}"><button class="btn btn-danger">删除</button></a></li>
				</ul>
					</td>
					
					
				</tr>
				</c:forEach> 
			</tbody>
		</table>

		</div>
				
		<ul class="pagination">
		    <li><a href="#">&laquo;</a></li>
		    <li><a href="#">1</a></li>
		    <li><a href="#">2</a></li>
		    <li><a href="#">3</a></li>
		    <li><a href="#">4</a></li>
		    <li><a href="#">5</a></li>
		    <li><a href="#">&raquo;</a></li>
		</ul>
		</div>
	</body>
<script>
	$("#table tr").click(function(){
    var tr = $(this);



});
</script>
</html>