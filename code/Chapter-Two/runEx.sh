#!/bin/zsh
#切换目录
echo "Info:Change current dir to "$1""
 	cd $1
#编译java源文件
echo "Info:Compile "$1.java""
	javac $1.java
#运行java程序
echo "Info:Run "$1""
echo "=============="
echo "Output:"
echo "=============="
	java $1
echo "=============="
#生成存放文档的目录
if [ ! -d doc ]; then
	echo "Info:Make dir doc"
	mkdir doc
else 
	echo "Warning:The dir already exits!"
fi
#使用javadoc生成相应的文档
echo "Info:Run javadoc"
	javadoc -d doc $1.java -encoding UTF-8 -charset UTF-8 -author
echo "Info:Finish!"
echo "=============="

