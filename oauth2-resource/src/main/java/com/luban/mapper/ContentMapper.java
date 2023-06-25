package com.luban.mapper;

import com.luban.bean.Content;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Fox
 */
@Repository
public interface ContentMapper {

    @Select("select * from tb_content where id=#{id}")
    Content getById(Long id);

    @Select("select * from tb_content")
    List<Content> selectAll();
}
