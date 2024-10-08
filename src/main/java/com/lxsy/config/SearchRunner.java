package com.lxsy.config;

import com.lxsy.modules.lucene.service.ILuceneService;
import org.junit.jupiter.api.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @description: lucene search runner  项目启动后执行同步数据库方法
 * @author: husj
 * @create: 2024-09-26
 **/
@Component
@Order(value = 1)
public class SearchRunner implements ApplicationRunner {

    @Autowired
    private ILuceneService service;

    @Override
    public void run(ApplicationArguments arg0) throws Exception {
        /**
         * 启动后将同步Product表,并创建index
         */
        service.synProductCreatIndex();
    }
}
