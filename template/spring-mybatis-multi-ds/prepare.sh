#!/bin/bash
# @file: 
#	prepare.sh
# @desc:
#	copy codergege-lib-xxx.jar to ~/workspace/open-source/ ~/nutstore/open-source
# @Author:
#	codergege
# @Last Update:
#	2016-11-21 
# @usage:
#	sh prepare.sh

# path
home=/home/codergege
pwdDir=$pwd
libdir=$home/workspace/open-source
codergegeLib=$libdir/codergege-lib-1.0.jar
mysqlDriver=$libdir/mysql-connector-java-5.1.6.jar
oracleDriver=$libdir/ojdbc6.jar

# copy jar 包
mkdir -p lib/autogen

cp -a $codergegeLib lib/
cp -a $mysqlDriver lib/autogen
cp -a $oracleDriver lib/autogen

# 生成 src/test
mkdir -p src/test/java/cn/codergege
mkdir -p src/test/resources

