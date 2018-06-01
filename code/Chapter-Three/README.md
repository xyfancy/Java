1.添加CLASSPATH路径，在.zshrc文件（如果使用bash，对应.bash_profile文件）中添加下面语句`export CLASSPATH=.:Target_PATH/thinkinginjava/lib`。

2.运行脚本 `./makeEx.sh name` ，生成name文件夹，然后在文件夹下生成name.java文件，并使用gedit打开。

3.编辑代码，运行脚本后会默认使用gedit自动打开name.java文件

4.运行脚本 `./runEx.sh name`,脚本中包含以下命令：

* `cd name`：切换当前目录
* `javac name.java`：编译name.java
* `java name`：运行java程序。对于需要输入参数的实验，需要自行运行。
* `mkdir doc`:生成doc文件夹
* `javadoc -d doc name.java -encoding UTF-8 -charset UTF-8 -author`:在doc文件夹中生成文档。

5.运行脚本 `./gitpushEx.sh name`,将更改同步到远程仓库

