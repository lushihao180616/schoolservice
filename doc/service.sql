/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50626
 Source Host           : localhost:3306
 Source Schema         : service

 Target Server Type    : MySQL
 Target Server Version : 50626
 File Encoding         : 65001

 Date: 15/01/2021 17:29:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for activityaudio
-- ----------------------------
DROP TABLE IF EXISTS `activityaudio`;
CREATE TABLE `activityaudio`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `src` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '音频类型',
  `typeId` int(11) NULL DEFAULT NULL COMMENT '音频对应的类型id',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `activityaudio_type_typeId_index`(`type`, `typeId`) USING BTREE COMMENT '索引 类型 类型id'
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for activitybeautiful
-- ----------------------------
DROP TABLE IF EXISTS `activitybeautiful`;
CREATE TABLE `activitybeautiful`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `stuNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of activitybeautiful
-- ----------------------------
INSERT INTO `activitybeautiful` VALUES (1, '14020109109');

-- ----------------------------
-- Table structure for activityimage
-- ----------------------------
DROP TABLE IF EXISTS `activityimage`;
CREATE TABLE `activityimage`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `src` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片类型',
  `typeId` int(11) NULL DEFAULT NULL COMMENT '图片对应的类型id',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `activityimage_type_typeId_index`(`type`, `typeId`) USING BTREE COMMENT '索引 类型 类型id'
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for activityvideo
-- ----------------------------
DROP TABLE IF EXISTS `activityvideo`;
CREATE TABLE `activityvideo`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `src` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '视频类型',
  `typeId` int(11) NULL DEFAULT NULL COMMENT '视频对应的类型id',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `activityvideo_type_typeId_index`(`type`, `typeId`) USING BTREE COMMENT '索引 类型 类型id'
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for confessionwall
-- ----------------------------
DROP TABLE IF EXISTS `confessionwall`;
CREATE TABLE `confessionwall`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `stuNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学号',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '详情',
  `createTime` varchar(19) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of confessionwall
-- ----------------------------
INSERT INTO `confessionwall` VALUES (1, '14020109109', '表白张三', '背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看', '2021-01-13 10:30:00');

-- ----------------------------
-- Table structure for image
-- ----------------------------
DROP TABLE IF EXISTS `image`;
CREATE TABLE `image`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `src` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片类型',
  `typeId` int(11) NULL DEFAULT NULL COMMENT '图片对应的类型id',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `image_type_typeId_index`(`type`, `typeId`) USING BTREE COMMENT '索引 类型 类型id'
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of image
-- ----------------------------
INSERT INTO `image` VALUES (1, 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3338784601,903272157&fm=26&gp=0.jpg', '00', 1);
INSERT INTO `image` VALUES (2, 'https://dss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=4126584210,676776784&fm=26&gp=0.jpg', '01', 1);

-- ----------------------------
-- Table structure for lost
-- ----------------------------
DROP TABLE IF EXISTS `lost`;
CREATE TABLE `lost`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `stuNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学号',
  `getTime` varchar(19) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '捡到的时间',
  `place` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地点',
  `content` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '详情',
  `createTime` varchar(19) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of lost
-- ----------------------------
INSERT INTO `lost` VALUES (1, '14020109109', '2021-01-14 18:00:00', '图书馆二楼', '图书馆二楼捡了一个钥匙', '2021-01-15 14:20:00');

-- ----------------------------
-- Table structure for market
-- ----------------------------
DROP TABLE IF EXISTS `market`;
CREATE TABLE `market`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `stuNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学号',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `content` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '详情',
  `createTime` varchar(19) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of market
-- ----------------------------
INSERT INTO `market` VALUES (1, '14020109109', '方便面', '超便宜的方便面', '2021-01-15 15:37:00');

-- ----------------------------
-- Table structure for play
-- ----------------------------
DROP TABLE IF EXISTS `play`;
CREATE TABLE `play`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `stuNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学号',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '详情',
  `type` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '游戏',
  `playTime` varchar(19) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '游戏时间',
  `createTime` varchar(19) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of play
-- ----------------------------
INSERT INTO `play` VALUES (1, '14020109109', '请和我一起打游戏吧！', '0', '2021-01-15 00:00:00', '2021-01-13 20:32:10');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `stuNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学号',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `pwd` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `grade` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级',
  `className` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '班级',
  `major` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '专业',
  `sex` int(1) NULL DEFAULT NULL COMMENT '性别（0：男   1：女）',
  `manageFlag` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员标识（0：学生  1：导师  2：超级管理员）',
  `avatarUrl` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`stuNum`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('14020109109', '卢世豪', '123456', '大四', '14020109', '机械设计制造及其自动化', 0, '2', 'https://thirdwx.qlogo.cn/mmopen/vi_32/CpK8F54ibkpISHuOgIRWExmb0JHLPHpbibZZEJPDTRRDia7vgPhtM5VvVn9GfkSe1rYA47neicRb0znur9xxJZ229Q/132');
INSERT INTO `user` VALUES ('14020109110', '罗程', '14020109110', '大三', '14020109', '计算机工程学院', 0, '0', NULL);

SET FOREIGN_KEY_CHECKS = 1;
