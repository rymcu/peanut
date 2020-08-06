package com.rymcu.peanut.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @author ronger
 */
@Document(indexName = "doc-index", type = "doc")
public class DocumentModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long idDoc;

    /** 名称 */
    private String docName;

    /** 描述 */
    private String description;

    /** 创建时间 */
    private String createdTime;

    public Long getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(Long idDoc) {
        this.idDoc = idDoc;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

}
