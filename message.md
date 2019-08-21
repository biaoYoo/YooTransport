
    
**简要描述：** 

- 聊天连接请求

**请求URL：** 
- ` ws://IP:9326 ` 


**请求方式：**
- WS

**参数（单人与多人群聊(带容器)简称-1toN；多人群聊简称-NtoN）：**

|参数名|必选|类型|说明|规则|
|:----    |:---|:----- |:-----   |:-----  |
 |name| 是 |string| 聊天昵称|基本信息|
|senderType| 是 |string| 聊天类型（SINGLE-单聊（暂不支持），GROUP-群聊）|基本信息|
 |userId|是  |string| 用户主键|基本信息|
  |roomName| 是 |string| 聊天群组号|1toN-是单人的用户主键，NtoN-是业务主键|
  |icon|  是|string|头像地址|基本信息|
  |containerId|  |string| 容器主键| 1toN-是多人的用户主键 |
 |targetId|  |string| 目标业务主键|1toN-当群组号不是业务主键时，多人方需要传 |
 |clientType|  |string| 请求的客户端类|账号密码验证所在的项目|
  |account|  |string| 账号|-|
   |password|  |string| 密码（MD5密文）|-|

 **使用操作**
	根据所使用的规则，选择连接时所需参数。1个客服对多用户的情况连接后，由用户发送createContainer，客服接受到createContainer后到发送addContainer，即可完成连接与容器创建，客服发信息时需要带指定容器的主键。多人群聊的情况下则可以修改所在房间updateRoomName，并修改用户信息updateUserInfo

 **消息类型和消息事件说明与使用**

|类型|说明|必带参数|非必带参数|
|:----    |:---|:----- |-----   |
|所有规则通用-消息类型 |
|text| 文字 | messageContent-内容| -|
|picture| 图片 | accessoryContent-附带信息 | -|
|video| 视频 | accessoryContent-附带信息 | -|
|voice| 语音 | accessoryContent-附带信息 | -|
|event| 自定义事件 | accessoryContent-自定义内容 | messageContent|
|多人群聊规则（不带容器）-消息事件| 
|updateRoomName| 修改房间 | messageContent-房间号码 | -|
|updateUserInfo| 修改用户信息 | - | userIconUpdate-头像，messageContent-名字|
|单人与多人群聊规则（带容器）| 
|createContainer| 创建容器 |  acceptId-指定创建人，targetId-业务主键 | -|
|addContainer| 添加至容器 |containerId-添加指定容器 | -|
|removeContainer| 删除容器 |containerId-删除指定容器 | -|
|autoReturn| 自动回复信息 | messageContent-回复代号，containerId-指定容器 | -|


 **发送信息**

``` 
//发送信息，对应类型加上对应信息
 {
	"messageContent":"xxx", --消息内容
	"messageType":"xxx", --信息类型 文字（text）,图片（picture）,视频（video）,语音（voice）,自定义事件（event）
	"eventType":"xxx",--消息事件  普通消息（ordinary）,添加至容器-写在内容器主键（addContainer）,创建容器-单聊接受是指定创建的人（createContainer）,删除容器-提醒容器内所有人（removeContainer），自动回复信息-消息内容放指定回复信息代号容器主键需要填（autoReturn）
	"acceptId":"xxx", --单聊接收人的用户主键
	"userIcon":"xxx",  --发送人头像
	"containerId":"xxx", --容器主键（多人聊天使用）
	"targetId":"xxx",  --单人与多人聊天规则中，单人发送至多人容器时带（业务主键）
	"accessoryContent":{
		--附件信息
	}
}

```

 **接收信息**

``` 
//接收信息，对应类型加上对应信息
 {
	"messageContent":"xxx", --消息内容
	"messageType":"xxx", --信息类型 文字（text）,图片（picture）,视频（video）,语音（voice）
	"acceptId":"xxx", --单聊接收人的用户主键
	"nickName":"xxx", --发送人的名字
	"createUser":"xxx" , --发送人的用户主键
	"createTime":"xxx",  --发送时间
	"containerId":"xxx", --容器主键（多人聊天使用）
	"userIcon":"xxx",  --发送人头像
	"accessoryContent":{
		--附件信息
	}
}

```
 **附带信息**
```
//图片 - 附件信息
{
	"file":"xxx", --文件访问地址
	"previewUrl":"xxx" --图片预览地址
}
//视频 - 附件信息
{
	"file":"xxx", --文件访问地址
	"previewUrl":"xxx", --图片预览地址
	"duration":xxx --视频时长
}
//语音 - 附件信息
{
	"file":"xxx", --文件访问地址
	"duration":xxx --语音时长
}
//自定义事件 - 附件信息
{
	"eventType":"xxx", --事件类型
	"eventDescription":"xxx", --事件描述
	"customContent":"xxx" --自定义内容
}


```
 **心跳确认消息**

d98591378b184375b1c3ab5ded0964f0e6c00ba934154583ac97

 ** 进入返回消息(in)**

``` 
{
    "messageType":"notice", --提示消息
    "nickName":"11", --当前人的昵称
    "count":1, --当前在线人数
	"userId":'12', --当前人的用户主键（容器号）
    "action":"in", --当前动作是离开还是进入
    "messageContent":"11 进来了，现在共有【1】人在线", --提示消息
	"roomName":"xxx" --当前房间号
}
```

 ** 离开返回消息(out && outAll)**

``` 
{
    "messageType":"notice", --提示消息
    "nickName":"22", --当前人的昵称
    "count":1, --当前在线人数
	"userId":'21', --当前人的用户主键（容器号）
    "action":"out", --当前动作是离开还是进入（outAll提示所有人退出）
    "messageContent":"22, 离开了，现在共有【1】人在线", --提示消息
	"roomName":"xxx" --当前房间号
}
```
