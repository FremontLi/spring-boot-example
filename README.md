# spring-boot-example介绍
使用SpringBoot+Mybatis，完成一个基础的用户查询和新增项目<br>
## user类
private Integer id;<br>
private String name;<br>
private String address;<br>
## user表：
`id` int(11) NOT NULL COMMENT 'id',<br>
`name` varchar(50) DEFAULT NULL COMMENT 'name',<br>
`address` varchar(100) DEFAULT NULL COMMENT 'address',<br>
PRIMARY KEY (`id`)<br>
