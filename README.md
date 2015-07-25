# work_space_idea

#项目描述
及时聊天语音程序，主要技术点 websocket协议、html5plus
项目定位为移动应用，为保证性能，所有js/css/html文件都写在app项目里(voice_demo_01)

#项目地址
https://github.com/347255699/work_space_idea.git

#项目结构

# mobileapp
voice_demo_01
  -css
  -fonts
  -js
  -unpackage // apk存放位置
  -audio.html
  -index.html // 测试住界面
  -manifest.json

# mobileweb
voiceChat
  -src
    -main
      -java
        -com
          -chat
            -common // 通用类
              -util // 工具类
        	-sys
        		-web
        		-entity
        		-service
        		-socket
        		-web
      -resources
        -mapper // mybatis映射文件
        -log4j.properties
        -spring-mvc.xml
        -spring-mybatis.xml
        -voice.properties
        -webdefault.xml
      -webapp
        -WEB-INF
          -web.html
        -test.html
    -test
    	-java
    	-resources
