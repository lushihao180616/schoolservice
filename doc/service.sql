/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : service

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2021-01-13 20:56:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for confessionwall
-- ----------------------------
DROP TABLE IF EXISTS `confessionwall`;
CREATE TABLE `confessionwall` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `stuNum` varchar(20) DEFAULT NULL COMMENT '学号',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `content` text COMMENT '详情',
  `createTime` varchar(19) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of confessionwall
-- ----------------------------
INSERT INTO `confessionwall` VALUES ('1', '14020109109', '表白张三', '背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看', '2021-01-13 10:30:00');

-- ----------------------------
-- Table structure for image
-- ----------------------------
DROP TABLE IF EXISTS `image`;
CREATE TABLE `image` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `src` varchar(1000) DEFAULT NULL COMMENT '地址',
  `type` varchar(2) DEFAULT NULL COMMENT '图片类型',
  `typeId` int(11) DEFAULT NULL COMMENT '图片对应的类型id',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `image_type_typeId_index` (`type`,`typeId`) USING BTREE COMMENT '索引 类型 类型id'
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of image
-- ----------------------------
INSERT INTO `image` VALUES ('1', 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3338784601,903272157&fm=26&gp=0.jpg', '00', '1');

-- ----------------------------
-- Table structure for play
-- ----------------------------
DROP TABLE IF EXISTS `play`;
CREATE TABLE `play` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `stuNum` varchar(20) DEFAULT NULL COMMENT '学号',
  `content` text COMMENT '详情',
  `type` varchar(1) DEFAULT NULL COMMENT '游戏',
  `playTime` varchar(19) DEFAULT NULL COMMENT '游戏时间',
  `createTime` varchar(19) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of play
-- ----------------------------
INSERT INTO `play` VALUES ('1', '14020109109', '请和我一起打游戏吧！', '0', '2021-01-15 00:00:00', '2021-01-13 20:32:10');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `stuNum` varchar(20) NOT NULL COMMENT '学号',
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `pwd` varchar(30) DEFAULT NULL COMMENT '密码',
  `grade` varchar(10) DEFAULT NULL COMMENT '年级',
  `className` varchar(20) DEFAULT NULL COMMENT '班级',
  `major` varchar(20) DEFAULT NULL COMMENT '专业',
  `sex` int(1) DEFAULT NULL COMMENT '性别（0：男   1：女）',
  `manageFlag` varchar(1) DEFAULT NULL COMMENT '管理员标识（0：学生  1：导师  2：超级管理员）',
  `avatarUrl` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`stuNum`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('14020109109', '卢世豪', '123456', '大四', '14020109', '机械设计制造及其自动化', '1', '2', 'https://thirdwx.qlogo.cn/mmopen/vi_32/CpK8F54ibkpISHuOgIRWExmb0JHLPHpbibZZEJPDTRRDia7vgPhtM5VvVn9GfkSe1rYA47neicRb0znur9xxJZ229Q/132');
INSERT INTO `user` VALUES ('14020109110', '罗程', '14020109110', '大三', '14020109', '计算机工程学院', '1', '0', null);
SET FOREIGN_KEY_CHECKS=1;
