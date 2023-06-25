package com.luban.service;

import com.luban.bean.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author Fox
 */
public interface UserService extends UserDetailsService {

    User getByUsername(String username);
}
