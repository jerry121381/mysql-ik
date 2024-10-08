package com.lxsy.modules.lucene.service;

import java.io.IOException;

/**
 * @description: lucene service
 * @author: husj
 * @create: 2024-09-29
 **/
public interface ILuceneService {

    void createIndex() throws IOException;

    void synProductCreatIndex() throws IOException;
}
