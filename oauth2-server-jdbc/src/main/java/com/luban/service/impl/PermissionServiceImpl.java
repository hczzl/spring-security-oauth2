package com.luban.service.impl;

import com.luban.bean.Permission;
import com.luban.mapper.PermissionMapper;
import com.luban.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Fox
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;
    @Override
    public List<Permission> selectByUserId(Long userId) {

        return permissionMapper.selectByUserId(userId);
    }
}
