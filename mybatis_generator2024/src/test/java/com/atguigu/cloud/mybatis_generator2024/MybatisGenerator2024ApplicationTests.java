package com.atguigu.cloud.mybatis_generator2024;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisGenerator2024ApplicationTests {

    @Test
    void contextLoads() {
        String bVersion = SpringBootVersion.getVersion();
        System.out.println("SpringBoot 版本号：" + bVersion);
    }

}
