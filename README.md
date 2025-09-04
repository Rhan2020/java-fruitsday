# java-fruitsday

🍎 一个基于 Java Web 技术栈开发的在线水果商城系统，仿"天天果园"，提供完整的电商购物体验。

## 📖 项目简介

这是一个完整的水果电商平台，采用经典的 Java Web 开发模式，适合学习 Java Web 开发的基础技术栈。项目包含用户端购物功能和管理员后台管理功能，实现了一个小型电商系统的核心业务流程。
一个基于 Java、JSP、Servlet、MySQL的水果商城。

## 🎯 主要功能

### 用户端功能
- ✅ **用户注册/登录** - 支持邮箱和手机号登录
- ✅ **商品浏览** - 展示所有水果商品，支持分类浏览
- ✅ **商品详情** - 查看商品详细信息、规格、价格等
- ✅ **购物车管理** - 添加商品到购物车，管理购买数量
- ✅ **收藏功能** - 收藏喜欢的商品
- ✅ **商品搜索** - 根据商品名称搜索
- ✅ **热门推荐** - 首页展示热门水果

### 管理员功能
- ✅ **用户管理** - 用户的增删改查操作
- ✅ **商品管理** - 商品的增删改查操作
- ✅ **库存管理** - 商品库存数量管理
- ✅ **数据统计** - 基础的数据展示

### 数据库设计
- `fruits` - 商品信息表 (商品ID、名称、规格、价格、描述、库存等)
- `user` - 用户信息表 (用户ID、邮箱、手机、密码、用户名)
- `hotfruits` - 热门商品表 (推荐商品ID)
- `shop1/shop12` - 购物车和收藏表 (用户购物车和收藏状态)

### 🛠️ 技术栈

- **后端框架**: Java Web (JSP + Servlet)
- **构建工具**: Maven 3.x
- **数据库**: MySQL 5.6+
- **前端技术**: HTML5 + CSS3 + JavaScript + Bootstrap
- **服务器**: Apache Tomcat 8.x/9.x
- **开发工具**: IntelliJ IDEA
- **JDK版本**: JDK 1.8+

### 📁 项目结构

```
java-fruitsday/
├── src/main/java/com/fruitDayDB/
│   ├── dao/           # 数据访问层
│   │   ├── FruitDao.java
│   │   ├── UserDao.java
│   │   └── ShopDao.java
│   ├── service/       # 业务逻辑层
│   │   ├── FruitService.java
│   │   ├── UserService.java
│   │   └── ShopService.java
│   ├── servlet/       # 控制器层
│   │   ├── FruitServlet.java
│   │   ├── UserServlet.java
│   │   ├── ShopServlet.java
│   │   ├── BSServlet.java
│   │   └── selServlet.java
│   ├── vo/           # 实体类
│   │   ├── Fruit.java
│   │   ├── User.java
│   │   └── Cart.java
│   └── db/           # 数据库连接工具
│       └── DBUtils.java
├── src/main/webapp/
│   ├── *.jsp         # JSP页面
│   ├── css/          # 样式文件
│   ├── js/           # JavaScript文件
│   ├── img/          # 图片资源
│   └── WEB-INF/
│       └── web.xml   # Web配置文件
├── fruitday.sql      # 数据库脚本
└── pom.xml           # Maven配置文件
```

## 🚀 快速开始

### 环境要求

在开始之前，请确保您的开发环境满足以下要求：

| 软件 | 版本要求 | 说明 |
|------|----------|------|
| JDK | 1.8+ | Java开发工具包 |
| Maven | 3.6+ | 项目构建工具 |
| MySQL | 5.6+ | 数据库 |
| Tomcat | 8.5+ | Web应用服务器 |
| IDE | IntelliJ IDEA / Eclipse | 开发工具 (推荐IDEA) |

### 📥 安装部署

#### 1. 克隆项目
```bash
git clone https://github.com/your-username/java-fruitsday.git
cd java-fruitsday
```

#### 2. 数据库配置

**创建数据库：**
```sql
-- 连接MySQL数据库
mysql -u root -p

-- 创建数据库
CREATE DATABASE fruitday CHARACTER SET utf8 COLLATE utf8_general_ci;

-- 使用数据库
USE fruitday;
```

**导入数据：**
```bash
# 在项目根目录下执行
mysql -u root -p fruitday < fruitday.sql
```

**修改数据库连接配置：**

编辑 `src/main/java/com/fruitDayDB/db/DBUtils.java` 文件，修改数据库连接参数：

```java
// 根据您的MySQL配置修改以下参数
URL = "jdbc:mysql://127.0.0.1:3306/fruitday";
USERNAME = "root";        // 您的数据库用户名
PASSWORD = "root";        // 您的数据库密码
```

#### 3. Maven依赖安装
```bash
# 在项目根目录下执行
mvn clean install
```

#### 4. 部署到Tomcat

**方式一：IDE部署（推荐）**

1. 在 IntelliJ IDEA 中打开项目
2. 配置 Tomcat 服务器：
   - Run → Edit Configurations
   - 添加 Tomcat Server → Local
   - 配置 Tomcat 安装路径
   - 在 Deployment 选项卡中添加 Artifact: `x-test:war exploded`
3. 点击运行按钮启动项目

**方式二：手动部署**

```bash
# 构建WAR包
mvn clean package

# 将生成的WAR包复制到Tomcat的webapps目录
cp target/x-test.war $TOMCAT_HOME/webapps/

# 启动Tomcat
$TOMCAT_HOME/bin/startup.sh  # Linux/Mac
# 或
$TOMCAT_HOME/bin/startup.bat # Windows
```

#### 5. 访问应用

启动成功后，在浏览器中访问：

- **用户端首页**: http://localhost:8080/x-test/
- **管理员登录**: http://localhost:8080/x-test/login.jsp

### 🔐 测试账号

**管理员账号（默认）：**
- 邮箱：youwillsee2018@qq.com
- 密码：suhong1

**测试用户账号：**
- 可通过注册页面自行注册新用户

### 📱 功能演示

**访问路径说明：**
- 首页：`/index.jsp`
- 用户注册：`/reg.jsp`
- 用户登录：`/login.jsp`
- 商品列表：`/sel.jsp`
- 购物车：`/showcart.jsp`
- 管理员后台：`/BSindex.jsp`

### ⚠️ 常见问题

**1. 数据库连接失败**
- 检查MySQL服务是否启动
- 确认数据库用户名密码是否正确
- 检查数据库是否存在

**2. 项目启动失败**
- 检查JDK版本是否为1.8+
- 确认Maven依赖是否正确下载
- 检查Tomcat配置是否正确

**3. 页面样式缺失**
- 检查CSS文件路径是否正确
- 确认静态资源是否正确部署

**4. 中文乱码问题**
- 确认项目编码为UTF-8
- 检查数据库字符集是否为utf8
- 确认Tomcat配置支持UTF-8

### 部分项目运行截图

![indexPNG](https://github.com/Rhan2020/java-fruitsday/blob/master/readmeImg/index.png)
![morePNG](https://github.com/Rhan2020/java-fruitsday/blob/master/readmeImg/more.png)
![cartPNG](https://github.com/Rhan2020/java-fruitsday/blob/master/readmeImg/cart.png)
![searchPNG](https://github.com/Rhan2020/java-fruitsday/blob/master/readmeImg/search.jpg)
![showfruitsPNG](https://github.com/Rhan2020/java-fruitsday/blob/master/readmeImg/showfruits.png)
![addfruitsPNG](https://github.com/Rhan2020/java-fruitsday/blob/master/readmeImg/addfruits.png)
![showuserPNG](https://github.com/Rhan2020/java-fruitsday/blob/master/readmeImg/showuser.png)
![adduserPNG](https://github.com/Rhan2020/java-fruitsday/blob/master/readmeImg/adduser.png)

## 🔧 开发指南

### 项目导入IDE

**IntelliJ IDEA：**
1. 打开 IDEA，选择 `File` → `Open`
2. 选择项目根目录的 `pom.xml` 文件
3. 选择 `Open as Project`
4. 等待 Maven 自动下载依赖

**Eclipse：**
1. 选择 `File` → `Import` → `Existing Maven Projects`
2. 选择项目根目录
3. 点击 `Finish`

### 代码结构说明

**MVC架构：**
- **Model（模型层）**: `vo` 包 - 实体类
- **View（视图层）**: JSP页面 - 用户界面
- **Controller（控制层）**: `servlet` 包 - 请求处理

**三层架构：**
- **表示层**: Servlet + JSP
- **业务逻辑层**: Service 类
- **数据访问层**: DAO 类

### 核心配置文件

| 文件 | 作用 | 位置 |
|------|------|------|
| `web.xml` | Web应用配置 | `src/main/webapp/WEB-INF/` |
| `pom.xml` | Maven项目配置 | 项目根目录 |
| `DBUtils.java` | 数据库连接配置 | `src/main/java/com/fruitDayDB/db/` |

### 🏗️ 二次开发建议

**功能扩展方向：**
- 🛒 **订单系统** - 添加订单生成、支付、发货等流程
- 💳 **支付集成** - 集成微信支付、支付宝等第三方支付
- 📱 **移动端适配** - 增加响应式设计或开发移动端App
- 🔍 **搜索优化** - 集成Elasticsearch实现更强大的搜索功能
- 📊 **数据分析** - 添加销售统计、用户行为分析等功能
- 🎨 **UI美化** - 使用Vue.js、React等现代前端框架重构界面
- 🔐 **安全加强** - 添加验证码、JWT认证、密码加密等安全措施

**技术升级建议：**
- 使用Spring Boot替代传统Servlet
- 使用MyBatis替代原生JDBC
- 使用Redis做缓存
- 使用Spring Security做权限管理
- 使用Docker做容器化部署

## 📚 学习价值

这个项目非常适合：

- **Java Web初学者** - 了解Servlet + JSP的基本开发模式
- **MVC架构学习** - 理解三层架构的设计思想
- **数据库操作实践** - 掌握JDBC的基本使用
- **电商业务理解** - 学习电商系统的核心业务逻辑
- **毕业设计参考** - 作为计算机专业毕业设计的参考项目

## 🤝 贡献指南

欢迎提交Issue和Pull Request来改进项目！

**贡献方式：**
1. Fork 本项目
2. 创建您的特性分支 (`git checkout -b feature/AmazingFeature`)
3. 提交您的更改 (`git commit -m 'Add some AmazingFeature'`)
4. 推送到分支 (`git push origin feature/AmazingFeature`)
5. 打开一个 Pull Request

## 📄 授权及版权说明

### 🎓 项目用途声明
本项目**仅供学习使用**，是一个基于 Java Web 技术的学习项目。

### 📝 开源协议
- 项目源码可**随意使用**，无需额外授权
- 可自由进行修改、分发和商业使用
- 使用本项目源码时无需署名，但非常欢迎 ⭐️ Star 或打赏支持作者

### ⚠️ 免责声明
- 项目中涉及的"天天果园"等商标、品牌名称及相关图片资源均为其**官方所有**
- 本项目仅作为技术学习演示，不涉及任何商业用途
- 因使用本项目代码或资源所产生的任何法律后果与原作者**无关**
- 请在合法合规的前提下使用本项目

### ☕️ 请我喝杯咖啡
如果这个项目对你有帮助，欢迎请我喝杯咖啡 😊

<p align="center">
  <img src="./readmeImg/pay.jpg" width="200" alt="微信支付" />
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="./readmeImg/alipay.jpg" width="200" alt="支付宝" />
</p>
