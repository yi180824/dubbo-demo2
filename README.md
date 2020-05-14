# 该项目使用maven搭建的父子模块+dubbo来实现分布式，用来测试dubbo实现微服务，作为进阶使用
## 项目介绍
	该项目使用spring+dubbo+zookeeper.服务在zookeeper中注册，使用dubbo管理服务.
## 项目搭建步骤： 
	第一步：安装jdk1.8
	第二步：安装zookeeper
	第三步：安装tomcat 
	第四步：下载dubbo并打包到tomcat测试dubbo-admin-2.6.0 
	第五步：创建项目
		5.1：创建maven项目：dubbo_moreModule(父模块)
		5.2：创建maven项目：dubbo1-Service（子模块-提供服务接口）
		5.3：创建maven项目：dubbo1-Provider（子模块-实现服务接口）
		5.4：创建maven项目：dubbo1-Consumer（子模块服务消费者） 
	第六步：启动zookeeper、tomcat 
	第七步: 启动服务实现者在zookeeper注册中心进行注册，然后启动服务消费者
	第八步：在dubbo-web界面查看服务http://localhost:8080/dubbo-admin-2.6.0/
