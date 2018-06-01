#!/bin/zsh
#通过输入的名称创建一个新文件夹并且创建相应的.java文件用作输入练习代码
if [ ! -d $1 ]; then
	mkdir $1
#将模板复制生成一个新的.java文件
	cp sample.java $1/$1.java
#使用sed将文件中的Ex替换成相应的名字
#sed命令的选项
#-n ：只打印模式匹配的行
#-e ：直接在命令行模式上进行sed动作编辑，此为默认选项
#-f ：将sed的动作写在一个文件内，用–f filename 执行filename内的sed动作
#-r ：支持扩展表达式
#-i ：直接修改文件内容
#s为替换的意思。格式为s|被替换内容|用来替换内容|
#g为行内匹配全部替换
#在使用单引号时，变量的引用需要满足：单引号 双引号 变量 双引号 单引号
	sed -i -e 's|sample|'"$1"'|g' $1/$1.java
#切换到目录下
	cd $1
#CentOS7.0和gnome界面，重新打开一个新的终端，这里由于使用的是zsh，所以相关参数变为zsh，使用bash的改成bash即可
#	gnome-terminal  -x zsh -c "exec zsh;"
#用gedit打开该文件以方便编辑
	gedit $1.java	

else #如果文件夹已经存在输出错误信息
	echo "The dir already exits!"
fi



