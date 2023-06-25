package com.luban.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Fox
 */
@Data
public class Content implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long categoryId;

    private String title;

    private String subTitle;

    private String titleDesc;

    private String url;

    private String pic;

    private String pic2;

    private String content;

    private Date created;

    private Date updated;


}
