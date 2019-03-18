package com.icare.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * <pre>
 *    author  : tianhaibo
 *    email   : tianhaibo@jshuii.com
 *    time    : 2019/3/13   10:37
 *    desc    : 服务启动
 *    version : v1.0
 * </pre>
 */
@EnableAutoConfiguration
public class DubboServiceApplication {

    public static void main(String[] args) {
        /*new SpringApplicationBuilder(DubboServiceApplication.class)
                .listeners((ApplicationListener<ApplicationEnvironmentPreparedEvent>) event -> {
                    Environment environment = event.getEnvironment();
                    int port = environment.getProperty("embedded.zookeeper.port", int.class);
                    new EmbeddedZooKeeper(port, false).start();
                }).run(args);*/
        SpringApplication.run(DubboServiceApplication.class,args);
    }
}
