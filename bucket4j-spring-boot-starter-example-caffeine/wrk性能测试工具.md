## wrk性能测试工具

### wrk使用

```
wrk -t12 -c20 -d10s -T60s  --latency http://localhost:8080/actuator
```

>启用 12个线程，每个线程发起 20个连接，持续 10秒

- -t 需要模拟的线程数
- -c 需要模拟的连接数
- --timeout 超时的时间
- -d 测试的持续时间