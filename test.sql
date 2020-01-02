/*
 Navicat Premium Data Transfer

 Source Server         : web
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 02/01/2020 13:18:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address`  (
  `a_id` int(8) NOT NULL AUTO_INCREMENT,
  `username` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `phonenumber` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`a_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES (2, '李四', '魔仙堡', '1684842565');
INSERT INTO `address` VALUES (4, '景轩', '西王楼', '1234567');
INSERT INTO `address` VALUES (5, '瑶瑶', '东王庙', '1234567');
INSERT INTO `address` VALUES (7, '咿呀', '123456', '1234567');

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `admin_ID` int(8) NOT NULL,
  `admin_name` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `admin_password` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`admin_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, '管理员一号', '123456');
INSERT INTO `admin` VALUES (2, '管理员二号', '456789');

-- ----------------------------
-- Table structure for opinion
-- ----------------------------
DROP TABLE IF EXISTS `opinion`;
CREATE TABLE `opinion`  (
  `oid` int(5) NOT NULL AUTO_INCREMENT,
  `opinion` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`oid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of opinion
-- ----------------------------
INSERT INTO `opinion` VALUES (1, 'igyquhgqihbiofiulrigkqhoiflurvb');
INSERT INTO `opinion` VALUES (2, 'etuiop]\\');
INSERT INTO `opinion` VALUES (3, 'dcscscd');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `OrderID` int(10) NOT NULL AUTO_INCREMENT,
  `gid` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `buytime` timestamp(0) NOT NULL,
  `address` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `username` varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`OrderID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (1, '01', '2018-07-09 00:00:00', '西南交通大学希望学院四栋651', '油亮');
INSERT INTO `orders` VALUES (3, '16', '2019-08-29 08:00:00', '西南交通大学希望学院四栋365', '蝴蝶');
INSERT INTO `orders` VALUES (4, '65', '2019-04-29 08:00:00', '西南交通大学希望学院三栋295', '广告');
INSERT INTO `orders` VALUES (6, '23', '2018-04-29 08:00:00', '西南交通大学希望学院三栋295', '高度');

-- ----------------------------
-- Table structure for tea_type
-- ----------------------------
DROP TABLE IF EXISTS `tea_type`;
CREATE TABLE `tea_type`  (
  `Tid` int(8) NOT NULL AUTO_INCREMENT,
  `type` enum('红茶','绿茶','黑茶','花茶','乌龙茶','新式茶') CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `name` varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `picture` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `text` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`Tid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tea_type
-- ----------------------------
INSERT INTO `tea_type` VALUES (1, '红茶', '碧螺春', 'posters/freljord_rakelstake_01.jpg', '袜子地方干部和你一天天热血三国那就劳烦');
INSERT INTO `tea_type` VALUES (2, '黑茶', '毛峰', '2', '12465448');
INSERT INTO `tea_type` VALUES (3, '红茶', '提前', '3', '塔尼亚 前已经而他2');
INSERT INTO `tea_type` VALUES (4, '黑茶', '76如图', '6', 'i反弹态势');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `UID` int(8) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `phonenumber` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`UID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'test', '123456', '13408634302');
INSERT INTO `user` VALUES (2, '叶凡', '6542656', '64295952644');
INSERT INTO `user` VALUES (3, '油亮', '456789', '1234567890');
INSERT INTO `user` VALUES (4, '景轩', '123456', '123456');

SET FOREIGN_KEY_CHECKS = 1;
