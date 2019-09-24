<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="processDao" class="pack.business.ProcessDao" />

<%
	String id = request.getParameter("id");
	boolean isSuccess = processDao.deleteData(id);
	
	if(isSuccess) response.sendRedirect("list.jsp");
	else response.sendRedirect("fail.jsp");
%>