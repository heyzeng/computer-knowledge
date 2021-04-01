## 实现SQL递归累加
```
# 原始数据
2019-01-01  20
2019-01-02  15
2019-01-03  10

# 递归累计的数据
2019-01-01  20
2019-01-02  35
2019-01-03  45
```
##表结构与数据

```sql
# 建表语句
CREATE TABLE student_scores(date_time date, num int);

# 插入数据
insert into table student_scores values('2019-01-03',20),('2019-01-03',15),('2019-01-03',10);
```

## `inner join`方法
```sql
SELECT b.date_time,
       sum(a.num)
FROM student_scores a
INNER JOIN student_scores b
WHERE a.date_time <= b.date_time
GROUP BY b.date_time;
```

## 笛卡尔积
```sql
SELECT b.date_time,
       sum(a.num)
FROM student_scores a,
     student_scores b
WHERE a.date_time<=b.date_time
GROUP BY b.date_time;
```

## `Hive`开窗函数
```sql
# 创建临时表,加字段temp
CREATE TEMPORARY TABLE student_scores(date_time date, num int, temp string);

# 插入数据
insert into table student_scores values('2019-01-03',20,'a'),('2019-01-03',15,'a'),('2019-01-03',10,'a');

# 利用Hive开窗函数sum求当前窗口的累加值
select sum(num) over(partition by temp order by num) from student_scores
```
### `Hive`临时表简介
- 创建的临时表仅仅在当前会话(session)是可见的，数据将会被存储在用户的暂存目录中，并在会话结束时被删除。
- 如果创建临时表的名字与当前数据库下的一个非临时表相同，则在这个会话中使用这个表名字时将会使用的临时表，而不是非临时表，用户在这个会话内将不能使用原表，除非删除或者重命名临时表
- 不支持分区字段
- 不支持创建索引
