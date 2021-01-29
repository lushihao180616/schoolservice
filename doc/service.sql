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

 Date: 29/01/2021 10:58:41
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
-- Table structure for audio
-- ----------------------------
DROP TABLE IF EXISTS `audio`;
CREATE TABLE `audio`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `src` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '音频地址',
  `type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型',
  `typeId` int(11) NULL DEFAULT NULL COMMENT '类型的主键',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of audio
-- ----------------------------
INSERT INTO `audio` VALUES (1, 'https://sharefs.yun.kugou.com/202101211103/5585b66f54e52bc79e927f10b9f3d921/KGTX/CLTX001/3dce58e3635e24f3139114c5e0519def.mp3', '03', 1);
INSERT INTO `audio` VALUES (2, 'https://sharefs.yun.kugou.com/202101231335/42826fe559b99e400a608f77cc165586/KGTX/CLTX001/9c29ccf742c1a8f8a8171dd3305b428b.mp3', '03', 2);
INSERT INTO `audio` VALUES (3, 'https://sharefs.yun.kugou.com/202101231348/d23a72cf117295ef3f7803a9cf1f5534/G227/M05/04/08/Iw4DAF9EtSyAHni8AEKYmb_KItw819.mp3', '03', 3);

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
-- Table structure for dormitory
-- ----------------------------
DROP TABLE IF EXISTS `dormitory`;
CREATE TABLE `dormitory`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `sex` int(1) NULL DEFAULT NULL COMMENT '宿舍类型（0:男生宿舍  1:女生宿舍）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of dormitory
-- ----------------------------
INSERT INTO `dormitory` VALUES (1, '1号楼', 0);
INSERT INTO `dormitory` VALUES (2, '2号楼', 1);

-- ----------------------------
-- Table structure for express
-- ----------------------------
DROP TABLE IF EXISTS `express`;
CREATE TABLE `express`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `stuNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学号',
  `place` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地点',
  `count` int(2) NULL DEFAULT NULL COMMENT '数量',
  `createTime` varchar(19) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of express
-- ----------------------------
INSERT INTO `express` VALUES (1, '14020109109', '莹华里12号楼', 2, '2021-01-23 12:23:42');

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
  `createTime` varchar(19) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of play
-- ----------------------------
INSERT INTO `play` VALUES (1, '14020109109', '请和我一起打游戏吧！', '0', '2021-01-13 20:32:10');
INSERT INTO `play` VALUES (2, '14020109110', '请和我一起打游戏吧！', '1', '2021-01-13 20:32:10');
INSERT INTO `play` VALUES (3, '14020109109', '请和我一起打游戏吧！', '0', '2021-01-13 20:32:10');

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
  `avatarUrl` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像地址',
  `dormitoryId` int(11) NULL DEFAULT NULL COMMENT '宿舍',
  PRIMARY KEY (`stuNum`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('14020109109', '卢世豪', '123456', '大四', '14020109', '机械设计制造及其自动化', 0, '2', NULL, 2);
INSERT INTO `user` VALUES ('14020109110', '罗程', '14020109110', '大三', '14020109', '计算机工程学院', 1, '0', 'https://dss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3609671807,461735196&fm=26&gp=0.jpg', 2);

-- ----------------------------
-- Table structure for video
-- ----------------------------
DROP TABLE IF EXISTS `video`;
CREATE TABLE `video`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `src` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '视频地址',
  `type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型',
  `typeId` int(11) NULL DEFAULT NULL COMMENT '类型的主键',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
