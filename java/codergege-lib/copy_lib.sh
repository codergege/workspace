#!/bin/bash
# @file: 
#	copy_lib.sh
# @desc:
#	copy codergege-lib-xxx.jar to ~/workspace/open-source/ ~/nutstore/open-source
# @Author:
#	codergege
# @Last Update:
#	2016-11-21 
# @usage:
#	sh copy_lib.sh

# path
home=/home/codergege
pwdDir=$pwd
jar=build/libs/codergege-lib-1.0.jar
cp -a $jar $home/workspace/open-source/
cp -a $jar $home/nutstore/open-source/
