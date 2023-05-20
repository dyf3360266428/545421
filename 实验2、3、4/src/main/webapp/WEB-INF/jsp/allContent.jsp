<% pageContext.setAttribute("path", request.getContextPath());%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <title>管理列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div style="text-align: right">
    <input type="button" name="Submit" onclick="goback();" value="返回">
</div>
<div class="container" style="text-align: center">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    基于SSM框架的管理系统
                </h1>
                <h3>
                    列表查询页
                </h3>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>列表 —— 显示所有内容</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row" style="text-align: left">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${path}/content/toAddContent">新增</a>
        </div>
    </div>
    <div class="row clearfix" >
        <div class="col-md-12 column" >
            <table class="table table-hover table-striped" >
                <thead>
                <tr>
                    <th>ID</th>
                    <th>封面</th>
                    <th>课程名称</th>
                    <th>课程时间</th>
                    <th>所教学院</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="content" items="${requestScope.get('list')}" varStatus="status">
                        <td>${content.contentId}</td>
                        <td><img src="https://m1.miaomc.cn/uploads/20230519_646749c469668.png" width="100"></td>
                        <td>${content.contentName}</td>
                        <td>${content.contentHours}</td>
                        <td>${content.contentSid}</td>
                        <td>
                            <a href="${path}/content/toUpdateContent?id=${content.contentId}">更改</a> |
                            <a href="<%=appPath%>/content/del/${content.contentId}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
