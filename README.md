# AnyFunctionProLanguage
Any Functional Programming Language including Erlang Clojure Haskell and so on.

  1.   Erlang : 天生擅长高并发
  2.   Haskell : 天生就是函数式编程
  3.   Clojure : Based on JVM.支持不可变的数据结构。
       Clojure对于多线程编程不需要手动 lock 以及在 finally 里面进行unlock, 如同Java垃圾回收
       功能使得我们不用显示的请求，释放. You must know this language. It will surprise you.

       And Change your mind to this form

       In Java
       methodName(arg1, arg2, arg3);

       而Clojure的方法调用是这样的
       (function-name arg1 arg2 arg3)

       我为什么学习 Clojure ? 因为在之前的工作中，并发代码出现问题，一直查不出到底什么问题导致 =》
       并发上传文件到HDFS上，有的时候线程不会hung住，有的时候线程会hung住在一个地方，始终无法
       过去，一直都查不出什么情况，所以对于高并发易错的代码可以用Clojure进行替代重构。

       BTW
       这里有一些关键的问题，你可以问问你自己来看看你到底要不要学习Clojure
       你是想要找一种方式使得并发编程更简单么？
       你确定能够接受一种和面向对象完全不同的编程方式：函数式编程么？
       能运行在JVM上面， 并且可以调用java的类库，利用java的可移植性对你写的程序重要么？
       和静态类型比起来你更喜欢动态类型么？
       你觉得Lisp的简洁的，一致的语法动人么？
       如果对于上面某些问题的回答是肯定的，那么你应该考虑尝试下Clojure。
