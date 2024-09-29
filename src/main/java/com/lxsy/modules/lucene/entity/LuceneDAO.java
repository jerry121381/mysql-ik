package com.lxsy.modules.lucene.entity;

import com.lxsy.modules.brand.entity.Brand;
import org.apache.lucene.document.*;
import org.apache.lucene.index.IndexWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @description: lucene dao
 * @author: husj
 * @create: 2024-09-29
 **/
@Component
public class LuceneDAO {

    private final static Logger log = LoggerFactory.getLogger(LuceneDAO.class);


    @Autowired
    private IndexWriter indexWriter;


    public void createBrandIndex(Brand brand) throws IOException {
        Document doc = new Document();
        Integer id = brand.getId();
        doc.add(new StoredField("id", id));
        doc.add(new NumericDocValuesField("sort_id", id));
        doc.add(new TextField("title", brand.getBrandName(), Field.Store.YES));
        log.info(doc.toString());
        // 存储到索引库
        indexWriter.addDocument(doc);
        indexWriter.commit();
    }
}
