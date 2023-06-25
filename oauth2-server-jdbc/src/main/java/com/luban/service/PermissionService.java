package com.luban.service;

import com.luban.bean.Permission;

import java.util.List;

/**
 * @author Fox
 */
public interface PermissionService  {

    List<Permission> selectByUserId(Long userId);
}
