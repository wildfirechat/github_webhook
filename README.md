# 野火IM机器人应用之Github Webhook
Github Webhook服务器，接收Github回调事件，然后发送给指定的个人或者群组。可以参考本应用实现各种具有webhook功能的系统事件通知。

#### 修改配置
找到配置文件```application.properties```，修改下面配置。
```
#机器人的用户Id，可以从服务器t_robot数据库中查到。
robot.im_id=FireRobot
#机器人密钥，可以从服务器t_robot数据库中查到。
robot.im_secret=123456

#IM服务器地址，注意端口用的是80端口，不是API的18080端口。
robot.im_url=http://192.168.2.15:80

#转发会话类型，0是单人会话，1是群聊
forward.conversation_type=1
#转发会话目标
forward.conversation_target=tR16v6xx
```

#### 编译
```
mvn package
```

#### 运行
在```target```目录找到```github_webhook-XXXX.jar```，拷贝到具有公网IP的服务器上，然后执行下面语句：
```
java -jar github_webhook-XXXX.jar
```
>> 在linux机器上，为了防止关掉终端后退出，可以用nohup命令执行，例如 ```nohup java -jar github_webhook-XXXX.jar &```

#### 配置github
成功运行后，你的webhook地址就是```http://ip:8090/github/payload```。打开github设置然后配置时选择json格式就可以了

#### 对接其他系统
本工程是个范例工程，理论上您可以参考本工程实现对接上任何带有webhook功能的系统，只需要接收到webhook，找到需要发送的会话发送出去，一个显得很高大上的功能就实现了。快来给您的业务系统都对接上机器人功能吧～～

#### LICENSE
UNDER MIT LICENSE. 详情见LICENSE文件
