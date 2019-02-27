# ReviewList

+ [java虚拟机](#1)
+ [java并发](#2)







---

<a name="1"></a>
# java虚拟机 #
``` java
|--- 运行时数据区域
|----------程序计数器
|----------虚拟机栈
|----------本地方法栈
|----------堆
|----------方法区
|----------运行时常量池
|----------直接内存
|--- 垃圾收集
|----------对象是否可以被回收
|--------------引用计数法
|--------------(GC Roots)可达性分析法
|--- 垃圾收集算法
|--------------标记-清除
|--------------复制
|-----------------[内存划分]eden+s+s+old[8:1:1]
|--------------标记-整理
|--------------分代收集
|--- 垃圾收集器
|--------------Serial收集器(单线程)
|--------------ParNew收集器(Serial收集器多线程版本)
|--------------Parallel Scavenge收集器(吞吐量优先收集器)
|--------------Serial Old收集器(Old:老年代版本)
|--------------Parallel Old收集器
|--------------CMS收集器(停顿时间优先收集器)
|--------------G1收集器(即兼顾吞吐量又兼顾了停顿时间)
|--- 内存分配与回收策略
|--------------Minor GC 与 Full GC
|--------------对象分配策略
|-----------------对象优先分配Eden
|-----------------大对象直接进入老年代
|-----------------存活时间长的对象进入老年代(存活时间判断)
|-----------------动态对象年龄判断
|-----------------空间分配担保
|--------------Minor GC触发条件
|-----------------Eden区域满 触发Minor GC
|--------------Full GC触发条件
|-----------------调用 System.gc()
|-----------------老年代空间不足
|-----------------空间分配担保失败
|-----------------JDK 1.7 及以前的永久代空间不足
|-----------------Concurrent Mode Failure
|--- 类加载机制
|--------------类加载过程
|--------------类初始化时机
|--------------类加载器分类
|-----------------虚拟机角度
|-----------------开发人员角度
|--------------双亲委派模型
|-----------------工作流程
|-----------------优点
```
<a name="2"></a>
# java并发 #
``` java
|--- 基础知识
|--------------并发缺陷
|-----------------上下文切换[解决方案]
|--------------------无锁并发[concurrentHashMap中锁分段思想]
|--------------------CAS[乐观锁思想]
|--------------------使用最小线程
|--------------------协程[单线程中实现多任务调度，维持多任务切换]
|-----------------线程安全[引起原因]
|--------------------主内存和工作内存数据不一致
|--------------------重排序
|--- 线程基础
|-----------------如何创建线程
|--------------------继承Thread,重写run()
|--------------------实现runnable接口，重写run()
|--------------------实现callable接口，重写call()[异步]
|-----------------线程状态[6种]
|--------------------New
|--------------------Runnable
|--------------------Block
|--------------------Waiting
|--------------------Time-Waiting
|--------------------Terminated
|-----------------线程操作
|--------------------interrupted()[抛异常时 清除标记位]
|--------------------isInterrupted()[不清楚标记位]
|--------------------join()
|--------------------sleep()[与wait()区别]
|--------------------wait()[区别：本身、使用限制、锁是否释放、唤醒时机]
|--------------------yield()[与sleep()让出cpu资源时的区别]
|--- 并发理论
|-----------------JMM
|-----------------重排序
|--------------------as-if-serial关系
|--------------------happens-before关系
|--- 并发关键字
|-----------------synchronized
|--------------------底层实现原理
|--------------------happens-before关系
|--------------------JMM图示
|--------------------synchronied优化[缩短锁获取的时间]
|--------------------CAS原理、问题

```


