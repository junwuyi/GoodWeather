# Andriod 天气预报 App

## 技术支持

本软件是基于 Andriod 的手机天气预报系统。

（1）本软件使用到的腾讯天气接口 ：

https://wis.qq.com/weather/common?source=pc&weather_type=observe|index|rise|alarm|air|tips|forecast_24h&province=&city=

（2）JSON 数据解析：

JavaScript Object Notation，但是独立于语言。类似 XML ，可以用来文本信息的存储和交换,是数据的载体。从天气预报接口获得天气信息时需要对天气进行解析，解析出自己需要的天气信息。

## 数据库的设计

本软件选择SQLite数据库作为数据存储的载体，建立数据库forecast.db，此数据库记录查询城市的天气信息，用户请求天气接口后将数据保存到本地，以便在无网的时候展示，建立一个info表 

数据库建立的info表如下：

|         |          |                     |
| ------- | :------- | ------------------- |
| 字段名  | 数据类型 | 名称                |
| _id     | Integer  | 城市ID(primary key) |
| city    | varchar  | 城市名              |
| content | text     | 天气详情            |

## 页面预览

程序首页

![image-20210914150528614](D:\Git-Space\GoodWeather\assets\image-20210914150528614.png)

城市管理

![image-20210914150616962](D:\Git-Space\GoodWeather\assets\image-20210914150616962.png)

![image-20210914150743046](D:\Git-Space\GoodWeather\assets\image-20210914150743046.png)

更多设置

![image-20210914150703037](D:\Git-Space\GoodWeather\assets\image-20210914150703037.png)
