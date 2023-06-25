package com.luban.service.impl;

import com.luban.bean.Content;
import com.luban.mapper.ContentMapper;
import com.luban.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Fox
 */
@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentMapper contentMapper;
    @Override
    public Content getById(Long id) {
        return contentMapper.getById(id);
    }

    @Override
    public List<Content> selectAll() {
        return contentMapper.selectAll();
    }
}
