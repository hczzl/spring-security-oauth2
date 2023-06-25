package com.luban;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Fox
 */
@SpringBootApplication
@MapperScan(basePackages = "com.luban.mapper")
public class OAuth2ServerJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ServerJdbcApplication.class,args);
    }
}
