package com.vinson.svc.dao;

import com.vinson.svc.bean.Article;
import org.apache.ibatis.annotations.Param;

public interface ArticleDao {

    public Article findById(@Param("id") int id);
}
