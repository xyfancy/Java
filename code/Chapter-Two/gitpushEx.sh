#!/bin/zsh
#添加修改文件
git add .
#提交说明
git commit -m "add $1"
#推送到远程仓库
git push origin master



