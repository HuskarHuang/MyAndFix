apkpatch -f app-debug_fix.apk -t app-debug_bug.apk -o . -k ..\..\key\hwh.jks -p 111111 -a hwh -e 111111
apkpatch -f app-release_fix.apk -t app-release_bug.apk -o . -k ..\..\key\hwh.jks -p 111111 -a hwh -e 111111
apkpatch -f app-release_hwh_fix.apk -t app-release_hwh_bug.apk -o . -k ..\..\key\hwh.jks -p 111111 -a hwh -e 111111
apkpatch -f app-debug_hwh_fix.apk -t app-debug_hwh_bug.apk -o . -k ..\..\key\hwh.jks -p 111111 -a hwh -e 111111













2018-12-17 16:40:24.442 11095-11095/? I/art: Late-enabling -Xcheck:jni
2018-12-17 16:40:24.503 11095-11095/com.hwh.myandfix I/AndFix: setup: vmVersion = 2.1.0, apilevel = 24
2018-12-17 16:40:24.504 11095-11095/com.hwh.myandfix E/AndFix: vm is: art , apilevel is: 24
2018-12-17 16:40:24.510 11095-11095/com.hwh.myandfix I/MyApplication: inited.
2018-12-17 16:40:24.511 11095-11095/com.hwh.myandfix I/MyApplication: apatch loaded.
2018-12-17 16:40:24.526 11095-11095/com.hwh.myandfix W/art: Before Android 4.1, method double java.util.concurrent.ThreadLocalRandom.internalNextDouble(double, double) would have incorrectly overridden the package-private method in java.util.Random
2018-12-17 16:40:24.526 11095-11095/com.hwh.myandfix W/art: Before Android 4.1, method int java.util.concurrent.ThreadLocalRandom.internalNextInt(int, int) would have incorrectly overridden the package-private method in java.util.Random
2018-12-17 16:40:24.526 11095-11095/com.hwh.myandfix W/art: Before Android 4.1, method long java.util.concurrent.ThreadLocalRandom.internalNextLong(long, long) would have incorrectly overridden the package-private method in java.util.Random
2018-12-17 16:40:24.681 11095-11095/com.hwh.myandfix I/AndFix: modify com.hwh.test.hwh.fix flag:
2018-12-17 16:40:24.681 11095-11095/com.hwh.myandfix E/AndFix: setFieldFlag_7_0: 1 
2018-12-17 16:40:24.681 11095-11095/com.hwh.myandfix I/AndFix: modify com.hwh.test.hwh.test flag:
2018-12-17 16:40:24.681 11095-11095/com.hwh.myandfix E/AndFix: setFieldFlag_7_0: 1 
2018-12-17 16:40:24.681 11095-11095/com.hwh.myandfix E/AndFix: replace_7_0: -1659199292 , -1659199292
2018-12-17 16:40:24.681 11095-11095/com.hwh.myandfix I/AndFix: modify com.hwh.test.hwh_CF.fix flag:
2018-12-17 16:40:24.681 11095-11095/com.hwh.myandfix E/AndFix: setFieldFlag_7_0: 1 
2018-12-17 16:40:24.681 11095-11095/com.hwh.myandfix I/AndFix: modify com.hwh.test.hwh_CF.test flag:
2018-12-17 16:40:24.682 11095-11095/com.hwh.myandfix E/AndFix: setFieldFlag_7_0: 1 
2018-12-17 16:40:24.682 11095-11095/com.hwh.myandfix E/AndFix: replace_7_0: -1659199084 , -1659199084
2018-12-17 16:40:24.682 11095-11095/com.hwh.myandfix I/AndFix: modify com.hwh.test.hwh_CF.fix flag:
2018-12-17 16:40:24.682 11095-11095/com.hwh.myandfix E/AndFix: setFieldFlag_7_0: 1 
2018-12-17 16:40:24.682 11095-11095/com.hwh.myandfix I/AndFix: modify com.hwh.test.hwh_CF.test flag:
2018-12-17 16:40:24.682 11095-11095/com.hwh.myandfix E/AndFix: setFieldFlag_7_0: 1 
2018-12-17 16:40:24.682 11095-11095/com.hwh.myandfix I/MyApplication: apatch:/storage/emulated/0/out.apatch added.
2018-12-17 16:40:24.690 11095-11095/com.hwh.myandfix I/HwCust: Constructor found for class android.app.HwCustActivityImpl
2018-12-17 16:40:24.708 11095-11095/com.hwh.myandfix W/art: Before Android 4.1, method android.graphics.PorterDuffColorFilter android.support.graphics.drawable.VectorDrawableCompat.updateTintFilter(android.graphics.PorterDuffColorFilter, android.content.res.ColorStateList, android.graphics.PorterDuff$Mode) would have incorrectly overridden the package-private method in android.graphics.drawable.Drawable
2018-12-17 16:40:24.778 11095-11095/com.hwh.myandfix I/System.out: 0
2018-12-17 16:40:24.778 11095-11095/com.hwh.myandfix I/euler: fix error
2018-12-17 16:40:24.778 11095-11095/com.hwh.myandfix E/MainActivity: a
2018-12-17 16:40:24.779 11095-11095/com.hwh.myandfix I/euler: fix error
2018-12-17 16:40:24.779 11095-11095/com.hwh.myandfix I/euler: a
2018-12-17 16:40:24.779 11095-11095/com.hwh.myandfix E/MainActivity: 0
2018-12-17 16:40:24.779 11095-11095/com.hwh.myandfix E/MainActivity: 10
2018-12-17 16:40:24.791 11095-11095/com.hwh.myandfix I/HwPointEventFilter: do not support AFT because of no config
2018-12-17 16:40:24.822 11095-11119/com.hwh.myandfix I/Adreno: QUALCOMM build                   : cb2cbf6, Ib1167d03fb
    Build Date                       : 07/10/17
    OpenGL ES Shader Compiler Version: XE031.09.00.04
    Local Branch                     : 
    Remote Branch                    : refs/tags/AU_LINUX_ANDROID_LA.UM.5.5.R1.07.01.01.269.023
    Remote Branch                    : NONE
    Reconstruct Branch               : NOTHING
2018-12-17 16:40:24.828 11095-11119/com.hwh.myandfix I/OpenGLRenderer: Initialized EGL, version 1.4



