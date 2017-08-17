/*
Navicat MySQL Data Transfer

Source Server         : 127
Source Server Version : 50605
Source Host           : 127.0.0.1:3306
Source Database       : fruitday

Target Server Type    : MYSQL
Target Server Version : 50605
File Encoding         : 65001

Date: 2017-01-09 19:03:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for fruits
-- ----------------------------
DROP TABLE IF EXISTS `fruits`;
CREATE TABLE `fruits` (
  `fid` int(255) NOT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `spec` varchar(255) DEFAULT NULL,
  `up` double(255,0) DEFAULT NULL,
  `t1` longtext,
  `t2` longtext,
  `inum` int(11) DEFAULT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fruits
-- ----------------------------
INSERT INTO `fruits` VALUES ('1', '佳沛新西兰绿奇异果', '4+2盒', '78', '产地 新西兰 销售规格 6个 商品单重 80-90g ', '储藏方法 0-4度冷藏 营养元素 维生素C、叶酸 特别提醒存放4-5天，成熟后更甜 品牌 佳沛', '3');
INSERT INTO `fruits` VALUES ('3', '枣', '2斤', '23', '185-210g', '储藏方法 0-4度冷藏 营养元素 膳食纤维，天然叶酸，VC，钙，铁', '3');
INSERT INTO `fruits` VALUES ('4', '菠萝', '1个', '59', '产地\r\n国产\r\n销售规格\r\n2斤/4斤\r\n商品单重\r\n250g以上', '储藏方法\r\n0-4度冷藏保存\r\n营养元素\r\n维生素C，果胶，纤维素', '4');
INSERT INTO `fruits` VALUES ('8', '南非青提', '2斤', '68', '产地\r\n南非\r\n销售规格\r\n2斤', '储藏方法\r\n0-4度冷藏\r\n营养元素\r\n白藜芦醇，B类维生素，花青素，钙，蛋白质，果糖', '3');
INSERT INTO `fruits` VALUES ('9', '里达葡萄', '2斤', '98', '185-210g', '储藏方法 0-4度冷藏 营养元素 维生素C、叶酸 特别提醒存放4-5天，成熟后更甜 品牌 佳沛', '4');
INSERT INTO `fruits` VALUES ('10', '墨西哥牛油果', '6个', '40', '产地 墨西哥 销售规格 6个 商品单重 140g以上 ', '储藏方法 0-4度冷藏  营养元素叶酸，钾，钙，磷', '3');
INSERT INTO `fruits` VALUES ('11', '美国华盛顿红地厘蛇果', '6个', '30', '产地\r\n美国销售规格\r\n6个\r\n商品单重\r\n185-210g', '储藏方法\r\n0-4度冷藏保存\r\n营养元素\r\n维生素C，果胶，纤维素', '3');
INSERT INTO `fruits` VALUES ('14', '美国佛罗里达葡萄柚', '6个', '40', '产地 美国 销售规格 6个 商品单重 单个重240-310g', '储藏方法 0-4度冷藏 营养元素 膳食纤维，天然叶酸，VC，钙，铁', '3');
INSERT INTO `fruits` VALUES ('16', '赣南红心脐橙', '2斤/4斤', '49', '产地\r\n国产\r\n销售规格\r\n2斤/4斤\r\n商品单重\r\n250g以上', '储藏方法\r\n0-4度冷藏\r\n营养元素\r\n胡萝卜素，维生素C，花青素，钾，叶酸，纤维素', '3');
INSERT INTO `fruits` VALUES ('20', '紫薯', '500g', '11', '产地\r\n中国\r\n销售规格\r\n500g', '储藏方法\r\n阴凉干燥处\r\n营养元素\r\n纤维素，花青素，硒\r\n烹饪方法\r\n蒸煮煨烤', '3');

-- ----------------------------
-- Table structure for hotfruits
-- ----------------------------
DROP TABLE IF EXISTS `hotfruits`;
CREATE TABLE `hotfruits` (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hotfruits
-- ----------------------------
INSERT INTO `hotfruits` VALUES ('1');
INSERT INTO `hotfruits` VALUES ('3');
INSERT INTO `hotfruits` VALUES ('4');
INSERT INTO `hotfruits` VALUES ('8');
INSERT INTO `hotfruits` VALUES ('9');
INSERT INTO `hotfruits` VALUES ('10');
INSERT INTO `hotfruits` VALUES ('11');
INSERT INTO `hotfruits` VALUES ('14');
INSERT INTO `hotfruits` VALUES ('16');
INSERT INTO `hotfruits` VALUES ('20');

-- ----------------------------
-- Table structure for shop1
-- ----------------------------
DROP TABLE IF EXISTS `shop1`;
CREATE TABLE `shop1` (
  `fid` int(11) NOT NULL,
  `isStar` tinyint(1) NOT NULL,
  `isCart` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shop1
-- ----------------------------
INSERT INTO `shop1` VALUES ('1', '1', '0');
INSERT INTO `shop1` VALUES ('11', '1', '0');
INSERT INTO `shop1` VALUES ('14', '1', '1');

-- ----------------------------
-- Table structure for shop12
-- ----------------------------
DROP TABLE IF EXISTS `shop12`;
CREATE TABLE `shop12` (
  `fid` int(255) NOT NULL,
  `isCart` tinyint(255) DEFAULT NULL,
  `isStar` tinyint(255) DEFAULT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shop12
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  `uname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'youwillsee2018@qq.com', '15754326763', 'suhong1', 'youwillsee2018@qq.com');
