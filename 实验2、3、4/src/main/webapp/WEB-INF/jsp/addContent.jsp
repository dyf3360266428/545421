<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>新增内容</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container" style="text-align: center">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    基于SSM框架的管理系统
                </h1>
                <h3>
                    新增页
                </h3>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-20 column">
            <div class="page-header">
                <h1>
                    <small>新增内容</small>
                </h1>
            </div>
        </div>
    </div>
    <form:form action="user/upload" method="post" enctype="multipart/form-data" >
        课程名称：<input type="text" name="contentName"><br><br><br>
        课程时间：<input type="text" name="contentHours"><br><br><br>
        所教学院：<input type="text" name="contentSid"><br><br><br>
        封面: <input type="text" name="picPath"><input type="file" name="file" value="请选择图片" ><br><br><br>
        <input type="button" value="添加" onclick="addContent()">
    </form:form>

    <script type="text/javascript">
        function addContent() {
            var form = document.forms[0];
            form.action = "<%=basePath %>content/addContent";
            form.method = "post";
            form.submit();
        }
    </script>
</div>