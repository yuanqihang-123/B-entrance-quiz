### 完成度：
__Details:__
- \- 缺少添加学员的api
- \- 缺少查看分组的api

### 测试：
* 有些测试，但测的内容过于简单

### 知识点：
* 需要了解restful实践
* 需要了解Spring IoC Container

__Details:__

- \- UserController.java:17 推荐构造器注入
- \- UserController.java:27 path命名不符合restful实践，不应该包含动词

### 工程实践：
__Details:__

- \- UserRespository拼写错误
- \- UserService.java:2 无用的import需要删除
- \- UserService.java:21 重复代码（hard code）过多，需要重构
- \- UserService.java:31 拼写错误
- \- UserService.java:32 命名不表意
- \- UserService.java:33 magic number 6
- \- UserService.java:8 这个不删除，会导致编译错误



