# spring boot logback log to aliyun loghub

**NOT update in time, any pull request is welcome!**

##  Usage

First, copy the [logback-spring.xml](https://raw.githubusercontent.com/wongoo/springboot-logging-aliyun-loghub-starter/master/src/main/resources/logback-spring.xml)
to your project.

Then add loghub config:
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

## Reference:
- aliyun-log-logback-appender, https://github.com/aliyun/aliyun-log-logback-appender
