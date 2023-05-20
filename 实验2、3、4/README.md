# 基于SSM框架的管理系统

## 介绍
基于SSM框架的管理系统

实现 **登录**、**注册**、**增**、**删**、**改**、**查**、**上传封面**

可继续完善增加前端、校验、其他功能等；

可作为SSM项目开发练习基础模型；

## 项目结构
```
.
├── database
│   └── MySQL.sql
├── LICENSE
├── ManagementSystem.iml
├── pom.xml
├── README.md
└── src
    └── main
        ├── java
        │   └── com
        │       ├── controller
        │       │   ├── ContentController.java
        │       │   ├── UploadController.java
        │       │   └── UserController.java
        │       ├── dao
        │       │   ├── ContentDao.java
        │       │   └── UserDao.java
        │       ├── pojo
        │       │   ├── Content.java
        │       │   └── User.java
        │       └── service
        │           ├── ContentService.java
        │           ├── impl
        │           │   ├── ContentServiceImpl.java
        │           │   └── UserService.java
        │           └── UserService.java
        ├── resources
        │   ├── jdbc.properties
        │   ├── log4j.properties
        │   ├── mapper
        │   │   ├── ContentMapper.xml
        │   │   └── UserMapper.xml
        │   ├── mybatis-config.xml
        │   └── spring
        │       ├── spring-dao.xml
        │       ├── spring-mvc.xml
        │       └── spring-service.xml
        └── webapp
            ├── login.jsp
            └── WEB-INF
                ├── applicationContext.xml
                ├── jsp
                │   ├── addContent.jsp
                │   ├── allContent.jsp
                │   ├── index.jsp
                │   ├── register.jsp
                │   └── updateContent.jsp
                ├── log4j.xml
                └── web.xml
```
