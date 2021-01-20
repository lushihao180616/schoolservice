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

 Date: 20/01/2021 17:36:36
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
  INDEX `activityaudio_type_typeId_index`(`type`, `typeId`) USING BTREE COMMENT '索引 类型 类型id'
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for activitybeautiful
-- ----------------------------
DROP TABLE IF EXISTS `activitybeautiful`;
CREATE TABLE `activitybeautiful`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `stuNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of activitybeautiful
-- ----------------------------
INSERT INTO `activitybeautiful` VALUES (1, '14020109109');
INSERT INTO `activitybeautiful` VALUES (2, '14020109110');

-- ----------------------------
-- Table structure for activitybeautifulgreat
-- ----------------------------
DROP TABLE IF EXISTS `activitybeautifulgreat`;
CREATE TABLE `activitybeautifulgreat`  (
  `stuNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '最美活动参与者',
  `fromStuNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '最美活动点赞人',
  PRIMARY KEY (`stuNum`, `fromStuNum`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of activitybeautifulgreat
-- ----------------------------
INSERT INTO `activitybeautifulgreat` VALUES ('14020109109', '14020109109');
INSERT INTO `activitybeautifulgreat` VALUES ('14020109109', '14020109110');

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
  INDEX `activityimage_type_typeId_index`(`type`, `typeId`) USING BTREE COMMENT '索引 类型 类型id'
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of activityimage
-- ----------------------------
INSERT INTO `activityimage` VALUES (1, 'https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1394231506,476719335&fm=26&gp=0.jpg', '00', 1);
INSERT INTO `activityimage` VALUES (2, 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1293114384,771965355&fm=26&gp=0.jpg', '00', 1);
INSERT INTO `activityimage` VALUES (3, 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3037191816,866925375&fm=26&gp=0.jpg', '00', 1);

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
  INDEX `activityvideo_type_typeId_index`(`type`, `typeId`) USING BTREE COMMENT '索引 类型 类型id'
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型',
  `typeId` int(11) NULL DEFAULT NULL COMMENT '类型的主键',
  `stuNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评论人',
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评论内容',
  `createTime` varchar(19) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

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
  INDEX `image_type_typeId_index`(`type`, `typeId`) USING BTREE COMMENT '索引 类型 类型id'
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
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `stuNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学号',
  `type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型',
  `content` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '消息内容',
  `createTime` varchar(19) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `readFlag` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'N' COMMENT '读取标识（已读：Y  未读：N）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES (1, '14020109109', '00', '罗程为你的告白墙点赞啦', '2021-01-19 14:57:12', 'N');
INSERT INTO `message` VALUES (2, '14020109109', '01', '您的商品有了新的评论信息', '2021-01-19 14:57:12', 'N');

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
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

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
INSERT INTO `user` VALUES ('14020109110', '罗程', '14020109110', '大三', '14020109', '计算机工程学院', 1, '0', 'https://dss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3609671807,461735196&fm=26&gp=0.jpg');

SET FOREIGN_KEY_CHECKS = 1;
