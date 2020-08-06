package com.rymcu.peanut.web;

import com.rymcu.peanut.core.result.GlobalResult;
import com.rymcu.peanut.core.result.GlobalResultGenerator;
import com.rymcu.peanut.entity.DocumentModel;
import com.rymcu.peanut.service.DocumentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ronger
 */
@RestController
@RequestMapping("/api/v1/document")
public class DocumentController {

    @Resource
    private DocumentService documentService;

    @PostMapping("/add")
    public GlobalResult save(DocumentModel documentModel) {
        documentModel = documentService.save(documentModel);
        return GlobalResultGenerator.genSuccessResult(documentModel);
    }

    @GetMapping("/search")
    public GlobalResult search() {
        List<DocumentModel> list = documentService.findAll();
        return GlobalResultGenerator.genSuccessResult(list);
    }
}
