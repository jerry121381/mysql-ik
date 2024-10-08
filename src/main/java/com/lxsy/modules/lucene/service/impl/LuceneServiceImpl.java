package com.lxsy.modules.lucene.service.impl;

import com.lxsy.modules.brand.entity.Brand;
import com.lxsy.modules.brand.mapper.BrandMapper;
import com.lxsy.modules.lucene.entity.LuceneDAO;
import com.lxsy.modules.lucene.service.ILuceneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @description:
 * @author: husj
 * @create: 2024-10-08
 **/
@Service
public class LuceneServiceImpl implements ILuceneService {

    @Autowired
    LuceneDAO luceneDao;
    @Autowired
    BrandMapper brandMapper;

    @Override
    public void createIndex() throws IOException {
        // 从数据库中获取你要查询的内容，这里根据你自己的数据库方案来
        List<Brand> brandList = brandMapper.selectAll();
        // 将数据建立索引
        luceneDao.createBrandIndex(brandList);
    }

    @Override
    public void synProductCreatIndex() throws IOException {
        List<Brand> brandList = brandMapper.selectAll();
        luceneDao.createBrandIndex(brandList);
    }
}
