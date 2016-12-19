<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="Ben.Customer"%>
    <%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">		
		<meta charset="UTF-8">
		<title></title>
		<style>
			form{
				width:600px;
				margin:100px auto;
			}
		</style>
	</head>
	<body>
	<%Customer cus=(Customer)session.getAttribute("Customer"); 
		
		%>
		<div class="container">
		<div class="pull-right">欢迎你<%=cus.getFirst_name() %></div>
		<form action="InsertFilm" method="get">
			<legend>电影</legend>
			<div class="form-group">
		    	<label class="col-sm-2 control-label">标题</label>
		    	<div class="col-sm-5">
		      	<input type="text" class="form-control" name="film_title" 
		      		placeholder="请输入标题" value="" required>
		    	</div>
		    	<label class="col-sm-2 control-label">语言类型</label>
		    	<div class="col-sm-3">
		      	<input type="radio" name="language" value="English" checked>English
		      	<input type="radio" name="language" value="Italian">Italian
		      	<input type="radio" name="language" value="Japanese">Japanese
		      	<input type="radio" name="language" value="Mandarin">Mandarin
		      	<input type="radio" name="language" value="French">French
		      	<input type="radio" name="language" value="German">German
		      	
		    	</div>
		  	</div>
		  	<div class="form-group">
		    	<label class="col-sm-12 control-label">电影描述</label>
		    	<div class="col-sm-12">
		    		<textarea rows="5" class="form-control" name="description" 
		      		placeholder="请输入内容" value=""></textarea>
		    	</div>
		  	</div>	
		  	
		  	<div class="form-group">
		    	<div class="col-sm-offset-2 col-sm-6">
			      	<button type="submit" class="btn btn-success">新增</button>
			    </div>
			    <div class="col-sm-4">
			      	<a href="film.jsp">
			      		<input type="button" class="btn btn-default" value="返回">
			      	</a>
			    </div>
		    </div>
		</form></div>
	</body>
</html>
