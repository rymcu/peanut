package com.rymcu.peanut.repository;

import com.rymcu.peanut.entity.DocumentModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author ronger
 */
public interface DocumentRepository extends ElasticsearchRepository<DocumentModel, Long> {
}
