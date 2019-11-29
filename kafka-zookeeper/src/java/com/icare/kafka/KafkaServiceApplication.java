package com.icare.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <pre>
 *    author  : tianhaibo
 *    email   : tianhaibo@jshuii.com
 *    time    : 2019/3/13   10:37
 *    desc    : 服务启动
 *    version : v1.0
 * </pre>
 */
@SpringBootApplication
public class KafkaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaServiceApplication.class,args);
    }
}
