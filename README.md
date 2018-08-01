# MultModuleDemo

**本项目研究功能模块化APP架构，基于Android系统。**

## 主要内容
> #### 设计理念
> #### 应用环境
> #### 原理
> #### 解决的问题
> #### 存在的疑问
## 正文
### 1. 设计理念
针对功能模块化，使之在最大程度上进行复用。
类似七巧板，每一个板块想象成一个功能模块，板块拼凑成的图案即为APP。
实际上就是将功能的复用提高到应用层级上来整合APP。
### 2. 应用环境
一家软件公司可能有好几款应用软件，一般都会有相同的登录验证方式，相同的广告展示等等。  
资源管理型软件，针对不同的角色，会有不同的功能模块显示。
### 3. 原理
###### 基本原理：  
每个功能模块设计为Module（模型），作为项目中的Library（库）。
而APP的Module只是集成各个功能模块，从而形成可编译的应用软件。
###### 项目举例说明：
以通用的进销存软件为例，进行详细说明。
以下是功能设计图：
![功能设计图](https://github.com/pulque/MultModuleDemo/tree/master/images/functions.png)  
从上图可以看出，不同的功能模块通过组合，可以形成不同的APP。  
以下是项目代码的截图：
![代码结构图](https://github.com/pulque/MultModuleDemo/tree/master/images/project_structure.png)  
以下是编译安装后APP的截图：
![手机APP展示图](https://github.com/pulque/MultModuleDemo/tree/master/images/apps.png)  
