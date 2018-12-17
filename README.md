### 将andfix c Android.mk改为CMakeLists.txt

```
root@HWGemini:/data/user/0/com.hwh.myandfix/files/apatch_opt # ls -l
-rw------- u0_a277  u0_a277     12720 2018-12-15 17:24 out.apatch
root@HWGemini:/data/user/0/com.hwh.myandfix/files/apatch # ls -l
-rw------- u0_a277  u0_a277      2617 2018-12-15 17:24 out.apatch

```

- Android中热修复框架AndFix原理解析及案例使用 https://blog.csdn.net/u011277123/article/details/53282381


###  Linux 查看.so中导出函数
- 方法一
```
nm -D  **.so
```
- 但这样能看到所有的导出，乱七八糟的很多，筛选用：
```
nm **.so | grep XX
```


- 方法二
```
objdump -tT **.so
```