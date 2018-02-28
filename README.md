# spring boot logback log to aliyun loghub

maven dependency:
```
<dependency>
    <groupId>springboot.logging.aliyun.loghub</groupId>
    <artifactId>springboot-logging-aliyun-loghub-starter</artifactId>
    <version>1.0.0</version>
</dependency>
```

config sample:
```
spring.application.name=test

loghub.enable=true
loghub.console_output_logback_status=true
loghub.disable_other_appenders=false
loghub.endpoint=http://cn-shenzhen.log.aliyuncs.com
loghub.access_key_id=mykeyid
loghub.access_key=mykey
loghub.project_name=myproject
loghub.log_store=mylogstore
loghub.topic=${spring.application.name}
```

NOTE: loghub appender will enable only when `loghub.enable!=false`  and `loghub.endpoint` configured.

# reference:
- aliyun-log-logback-appender, https://github.com/aliyun/aliyun-log-logback-appender