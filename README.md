# flutter_android_map_view
test for writing map app with flutter and android

练习项目  android map app  和flutter 结合


第一次提交  集成flutter aar到android app
遇到问题

1 集成flutter_module aar 识别不出来FlutterActivity等相关类，编译报错

   解决方案：
   1 flutter sdk 版本和分支下错，在/flutter/bin/cache/artifacts/engine/存在的不是flutter.jar， 而是gensnapot重新下载fluttersdk 
   2 As不能自动打包flutter sdk的jar包，自己手动打包


2 flutter 运行报错   can not find libflutter.so
   解决方案：libflutter.so 在flutter.jar中，找到合适的架构的flutter.jar 拷贝到android 的lib下
            我的是32位的 所以在android-arm-release 找到对应的flutter.jar 并且配置
              ndk {
                  abiFilters "armeabi-v7a"
                 }     
      
