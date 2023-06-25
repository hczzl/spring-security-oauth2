package com.luban.oauth2ssoclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class Oauth2SsoClient2DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2SsoClient2DemoApplication.class, args);
    }

}
