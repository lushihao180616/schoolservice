/*
 Navicat Premium Data Transfer

 Source Server         : 118.31.123.130_3306
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : 118.31.123.130:3306
 Source Schema         : service

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 21/02/2021 22:09:57
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
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

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
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES (1, '00', 1, '14020109109', 'ainidfafsdfsdfsdfsdfsdfsdfsdfafasfgsdgdsgaetaewrdfsdfewfd', '2021-02-07 21:24:48');
INSERT INTO `comment` VALUES (2, '00', 1, '14020109109', 'aini', '2021-02-07 21:24:49');
INSERT INTO `comment` VALUES (5, '00', 1, '14020109109', '1111', '2021-02-07 22:41:14');
INSERT INTO `comment` VALUES (6, '00', 1, '14020109109', '123456', '2021-02-07 22:47:36');
INSERT INTO `comment` VALUES (7, '00', 1, '14020109109', '发送到发送到发送到发送到发士大夫撒发撒地方水电费水电费撒打发斯蒂芬', '2021-02-08 13:26:17');
INSERT INTO `comment` VALUES (8, '00', 1, '14020109109', 'a', '2021-02-08 13:27:24');
INSERT INTO `comment` VALUES (9, '01', 1, '14020109109', '123', '2021-02-08 15:14:42');
INSERT INTO `comment` VALUES (10, '02', 1, '14020109109', '123', '2021-02-08 15:42:16');
INSERT INTO `comment` VALUES (12, '00', 6, '14020109109', '111', '2021-02-16 22:38:12');
INSERT INTO `comment` VALUES (13, '00', 6, '14020109109', '123', '2021-02-17 02:47:43');
INSERT INTO `comment` VALUES (14, '01', 2, '14020109109', '相声里面高清监控的偷拍隐蔽是很难的，单纯厂家就已经在线下注够难竞猜投注了', '2021-02-19 17:02:32');
INSERT INTO `comment` VALUES (15, '00', 2, '14020109109', '111', '2021-02-19 17:05:29');
INSERT INTO `comment` VALUES (16, '00', 6, '14020109109', '333', '2021-02-19 17:05:40');
INSERT INTO `comment` VALUES (17, '02', 2, '14020109109', '542', '2021-02-19 21:12:26');
INSERT INTO `comment` VALUES (18, '00', 9, '14020109109', '123', '2021-02-19 23:02:39');
INSERT INTO `comment` VALUES (19, '00', 9, '14020109109', '456', '2021-02-19 23:02:43');
INSERT INTO `comment` VALUES (20, '00', 9, '14020109109', '232', '2021-02-19 23:14:59');
INSERT INTO `comment` VALUES (21, '00', 9, '14020109109', '4', '2021-02-19 23:25:56');
INSERT INTO `comment` VALUES (22, '00', 6, '14020109109', '圣人做庄警儒教，浏览器打开威尼斯警连五肖', '2021-02-20 02:12:09');
INSERT INTO `comment` VALUES (23, '00', 9, '14020109109', '特3456书yuuo莞6543李zxcz蒜7782法fgnv级 完2347全dfji试3726测asad感3847知qwez到', '2021-02-20 10:22:33');
INSERT INTO `comment` VALUES (24, '00', 9, '14020109109', '特3456书yuuo莞6543李zxcz蒜7782法fgnv级 完2347全dfji试3726测asad感3847知qwez到', '2021-02-20 10:24:12');
INSERT INTO `comment` VALUES (25, '00', 9, '14020109109', '特3456书yuuo莞6543李zxcz蒜7782法fgnv级 完2347全dfji试3726测asad感3847知qwez到', '2021-02-20 10:33:51');
INSERT INTO `comment` VALUES (26, '00', 13, '14020109109', '洪城一块学你习的政策，文武习才是真正的两面人管6月4日黎明', '2021-02-20 15:27:14');

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
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of confessionwall
-- ----------------------------
INSERT INTO `confessionwall` VALUES (1, '14020109109', '表白张三', '背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看', '2021-01-13 10:30:00');
INSERT INTO `confessionwall` VALUES (3, '14020109109', '表白张三', '背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看', '2021-02-08 17:30:56');
INSERT INTO `confessionwall` VALUES (4, '14020109109', '表白张三', '背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看', '2021-02-08 17:30:57');
INSERT INTO `confessionwall` VALUES (5, '14020109109', '表白张三', '背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看', '2021-02-08 17:30:58');
INSERT INTO `confessionwall` VALUES (6, '14020109109', '表白张三', '背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看背影好看', '2021-02-08 17:30:59');
INSERT INTO `confessionwall` VALUES (8, '14020109109', '1', '2', '2021-02-19 22:21:03');
INSERT INTO `confessionwall` VALUES (12, '14020109109', '1', '2', '2021-02-20 14:28:53');
INSERT INTO `confessionwall` VALUES (13, '14020109109', '3', '4', '2021-02-20 14:29:31');

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
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of express
-- ----------------------------
INSERT INTO `express` VALUES (1, '14020109109', '莹华里12号楼', 2, '2021-01-23 12:23:42');
INSERT INTO `express` VALUES (2, '14020109109', '莹华里停车场地下', 2, '2021-01-23 12:23:44');
INSERT INTO `express` VALUES (3, '14020109109', '鑫茂军民园1号楼B座', 1, '2021-01-23 12:23:49');

-- ----------------------------
-- Table structure for great
-- ----------------------------
DROP TABLE IF EXISTS `great`;
CREATE TABLE `great`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型',
  `typeId` int(11) NULL DEFAULT NULL COMMENT '类型的主键',
  `stuNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '点赞人',
  `createTime` varchar(19) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 43 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of great
-- ----------------------------
INSERT INTO `great` VALUES (24, '00', 6, '14020109109', '2021-02-16 22:58:09');
INSERT INTO `great` VALUES (28, '01', 0, '14020109109', '2021-02-16 23:13:34');
INSERT INTO `great` VALUES (37, '00', 1, '14020109109', '2021-02-17 01:32:31');
INSERT INTO `great` VALUES (38, '00', 3, '14020109109', '2021-02-17 01:32:46');
INSERT INTO `great` VALUES (39, '00', 4, '14020109109', '2021-02-17 01:32:47');
INSERT INTO `great` VALUES (40, '02', 2, '14020109109', '2021-02-19 21:12:08');
INSERT INTO `great` VALUES (41, '02', 3, '14020109109', '2021-02-19 21:12:31');
INSERT INTO `great` VALUES (42, '01', 4, '14020109109', '2021-02-19 21:18:27');

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
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of image
-- ----------------------------
INSERT INTO `image` VALUES (1, 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3338784601,903272157&fm=26&gp=0.jpg', '00', 1);
INSERT INTO `image` VALUES (2, 'https://dss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=4126584210,676776784&fm=26&gp=0.jpg', '01', 1);
INSERT INTO `image` VALUES (7, 'https://sinacloud.net/schoolservice/image/14020109109_00_8.jpg', '00', 8);
INSERT INTO `image` VALUES (9, 'https://sinacloud.net/schoolservice/image/14020109109_00_12.jpg', '00', 12);
INSERT INTO `image` VALUES (10, 'https://sinacloud.net/schoolservice/image/14020109109_00_13.jpg', '00', 13);

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
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of lost
-- ----------------------------
INSERT INTO `lost` VALUES (1, '14020109109', '2021-01-14 18:00:00', '图书馆二楼', '图书馆二楼捡了一个钥匙1', '2021-01-15 14:20:00');
INSERT INTO `lost` VALUES (2, '14020109109', '2021-01-14 18:00:00', '图书馆二楼', '图书馆二楼捡了一个钥匙2', '2021-01-15 14:21:00');
INSERT INTO `lost` VALUES (3, '14020109109', '2021-01-14 18:00:00', '图书馆二楼', '图书馆二楼捡了一个钥匙3', '2021-01-15 14:22:00');

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
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of market
-- ----------------------------
INSERT INTO `market` VALUES (1, '14020109109', '方便面', '超便宜的方便面', '2021-01-15 15:37:00');
INSERT INTO `market` VALUES (2, '14020109109', '亲嘴烧', '超辣亲嘴烧', '2021-02-10 10:17:30');
INSERT INTO `market` VALUES (3, '14020109109', '果冻', '超大亲亲果冻', '2021-02-10 10:17:32');

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
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES (1, '14020109109', '00', '罗程为你的告白墙点赞啦', '2021-01-19 14:57:12', 'N');
INSERT INTO `message` VALUES (2, '14020109109', '01', '您的商品有了新的评论信息', '2021-01-19 14:57:13', 'N');
INSERT INTO `message` VALUES (3, '14020109109', '02', '您的商品有了新的评论信息', '2021-01-19 14:57:16', 'N');

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
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

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
INSERT INTO `user` VALUES ('14020109109', '卢世豪', '123', '大四', '14020109', '机械设计制造及其自动化', 0, '2', '', 2);
INSERT INTO `user` VALUES ('14020109110', '罗程', '14020109110', '大三', '14020109', '计算机工程学院', 1, '0', 'https://dss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3609671807,461735196&fm=26&gp=0.jpg', 2);
INSERT INTO `user` VALUES ('2', '测试', 'cs123456', '大一', '2', '测试', 0, '0', '', 1);

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
