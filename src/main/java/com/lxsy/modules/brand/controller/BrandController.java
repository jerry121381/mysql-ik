package com.lxsy.modules.brand.controller;

import com.lxsy.modules.brand.dto.BindKeywordDTO;
import com.lxsy.modules.brand.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: brand controller
 * @author: husj
 * @create: 2024-09-20
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping("/lxsy")
public class BrandController {

    private final BrandService brandService;


    @PostMapping("/brand/bind_keyword")
    public boolean bindKeyword(BindKeywordDTO dto) {
        return brandService.bindKeyword(dto);
    }

    @PostMapping("/brand/bind_category")
    public boolean bindCategory() {

    }
}
