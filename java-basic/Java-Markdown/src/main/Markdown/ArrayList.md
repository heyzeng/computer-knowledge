## `ArrayList`简介
>`ArrayList`类是一个可以动态修改的数组，与普通数组的区别就是它是没有固定大小的限制，我们可以添加或删除元素。
>`ArrayList`继承了`AbstractList`，并实现了`List`接口。

![ArrayList.png](https://i.loli.net/2021/03/31/KX9U1qfFQl5ZCVx.png)

<div align="center"> <img src="https://i.loli.net/2021/03/31/KX9U1qfFQl5ZCVx.png"/> </div><br>


## `ArrayList`理解
- `ArrayList`实现了`List`的接口，底层是一个数组，并实现可变的功能
- `ArrayList` 属性 ： `transient Object[] elementData`;在序列化时，忽略该属性
- `ArrayList`实现了`List`所有的操作 
- `permits all elements`, `including null` , `ArrayList` 可以加入`null`,并且多个
- `ArrayList` 是由数组来实现数据存储的
- `ArrayList` 基本等同于`Vector`, 除了` ArrayList`是线程不安全，但是执行效率高, 在多线程，操作同一个`ArrayList`对象时，是需要小心

## `ArrayList`源码分析
