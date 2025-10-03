# 简介
本项目是 uniappx 的 Android 本地打包的 Android 项目模板，参考的官方链接 https://doc.dcloud.net.cn/uni-app-x/native/use/android.html

# 区别
官方文档是将 uniappx 相关库和代码集成到 library ，然后将library集成到主 app ，本项目直接集成到了主 app

# 集成程度
本项目克隆下来后，可以直接运行，集成了一个最初始的 uniappx demo

# 集成步骤

* 创建自己的 uniappx 项目
* 修改 Android 项目里 `app/src/main/AndroidManifest.xml` 文件里的 `<meta-data android:name="DCLOUD_UNI_APPID" android:value="__UNI__ID" />` `__UNI__ID` 为自己的 uniid
* 修改 `cp.cmd` 脚本，这个脚本是为了方便复制 hbuildx 导出的本地打包文件，需要复制的文件可参考 [拷贝资源文件](https://doc.dcloud.net.cn/uni-app-x/native/use/android.html#%E6%8B%B7%E8%B4%9D%E8%B5%84%E6%BA%90%E6%96%87%E4%BB%B6) 和 [拷贝kt文件](https://doc.dcloud.net.cn/uni-app-x/native/use/android.html#%E6%8B%B7%E8%B4%9Dkt%E6%96%87%E4%BB%B6)，脚本逻辑比较简单，根据自己的实际路径修改即可

# 完成
以上步骤集成完成以后，即可运行 Android 项目