package com.luban;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Fox
 */
public class PasswordEncoderTest {

    @Test
    public void test(){
        System.out.println(new BCryptPasswordEncoder().encode("123123"));
    }
}
