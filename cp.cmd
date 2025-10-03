rem 删除assets目录
rd /s /q F:\AndroidStudioProjects\UniappxAndroidNative\app\src\main\assets\apps\__UNI__4D36B06

rem 复制assets目录
xcopy /e /i E:\hello\unpackage\resources\app-android\__UNI__4D36B06 F:\AndroidStudioProjects\UniappxAndroidNative\app\src\main\assets\apps\__UNI__4D36B06\

rem 复制主kt文件
rd /s /q F:\AndroidStudioProjects\UniappxAndroidNative\app\src\main\java\pages\
del F:\AndroidStudioProjects\UniappxAndroidNative\app\src\main\java\index.kt
xcopy /e /i E:\hello\unpackage\resources\app-android\uniappx\app-android\src F:\AndroidStudioProjects\UniappxAndroidNative\app\src\main\java

rem 复制plugin
rd /s /q F:\AndroidStudioProjects\UniappxAndroidNative\app\src\main\java\uniappx\plugin\
xcopy /e /i E:\hello\unpackage\resources\app-android\uni_modules\social-android\utssdk\app-android\src F:\AndroidStudioProjects\UniappxAndroidNative\app\src\main\java\uniappx\plugin