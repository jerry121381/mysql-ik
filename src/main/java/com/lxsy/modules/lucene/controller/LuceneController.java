package com.lxsy.modules.lucene.controller;

import com.lxsy.modules.lucene.service.ILuceneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: Lucene controller
 * @author: husj
 * @create: 2024-10-08
 **/
@RestController
@RequestMapping("/lxsy")
public class LuceneController {

    @Autowired
    private ILuceneService luceneService;

    @PostMapping("/create_index")
    public String createIndex() throws Exception {
        luceneService.createIndex();
        return "success";
    }
}
