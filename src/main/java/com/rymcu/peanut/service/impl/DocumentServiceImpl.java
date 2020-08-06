package com.rymcu.peanut.service.impl;

import com.rymcu.peanut.entity.DocumentModel;
import com.rymcu.peanut.repository.DocumentRepository;
import com.rymcu.peanut.service.DocumentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ronger
 */
@Service
public class DocumentServiceImpl implements DocumentService {

    @Resource
    private DocumentRepository documentRepository;

    @Override
    public DocumentModel find(DocumentModel model) {
        return null;
    }

    @Override
    public List<DocumentModel> findAll() {
        List<DocumentModel> list = new ArrayList<>();
        Iterable<DocumentModel> iterable = documentRepository.findAll();
        iterable.forEach(documentModel -> list.add(documentModel));
        return list;
    }

    @Override
    public DocumentModel findById(Long aLong) {
        return null;
    }

    @Override
    public DocumentModel save(DocumentModel model) {
        model = documentRepository.save(model);
        return model;
    }

    @Override
    public DocumentModel update(DocumentModel model) {
        return null;
    }

    @Override
    public DocumentModel delete(DocumentModel model) {
        return null;
    }
}
