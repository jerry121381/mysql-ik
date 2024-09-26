package com.lxsy.config;

import org.junit.jupiter.api.Order;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @description: lucene search runner
 * @author: husj
 * @create: 2024-09-26
 **/
@Component
@Order(value = 1)
public class SearchRunner implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
