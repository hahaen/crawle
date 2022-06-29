## 多线程爬虫和ES数据分析实战

数据库创建
```
docker run --name news -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=news mysql
```

flyway
```
mvn flyway:migrate
```

![image](https://github.com/hahaen/crawle/tree/main/img/1.png)
