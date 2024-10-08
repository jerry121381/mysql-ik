package com.lxsy.modules.brand.mapper;

import com.lxsy.modules.brand.entity.Brand;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description: brand mapper
 * @author: husj
 * @create: 2024-09-20
 **/
@Mapper
public interface BrandMapper extends BaseMapper<Brand> {

    /**
     * 查询所有商标
     * @return 所有商标
     */
    List<Brand> selectAll();
}




