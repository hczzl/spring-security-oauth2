package com.luban.service;


import com.luban.bean.Content;

import java.util.List;

public interface ContentService {

    Content getById(Long id);

    List<Content> selectAll();


}
