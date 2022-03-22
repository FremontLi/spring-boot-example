# spring-boot-example介绍
使用SpringBoot+Mybatis，完成一个基础的用户查询和新增项目<br>
[参考文章](https://www.cnblogs.com/huang-changfan/p/12254470.html)<br>
## User类
private Integer id;<br>
private String name;<br>
private String address;<br>
## user用户表：
`id` int(11) NOT NULL COMMENT 'id',<br>
`name` varchar(50) DEFAULT NULL COMMENT 'name',<br>
`address` varchar(100) DEFAULT NULL COMMENT 'address',<br>
PRIMARY KEY (`id`)<br>
