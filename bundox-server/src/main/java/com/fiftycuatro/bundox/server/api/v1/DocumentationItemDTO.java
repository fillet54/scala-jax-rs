package com.fiftycuatro.bundox.server.api.v1;

import java.util.Objects;

public class DocumentationItemDTO {
    private String subject;
    private String documentId;
    private String path;
    private String type;
    
    public DocumentationItemDTO() { }
    
    public DocumentationItemDTO(String subject, String documentId, String path, String type) {
        this.subject = subject;
        this.documentId = documentId;
        this.path = path;
        this.type = type;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.subject);
        hash = 19 * hash + Objects.hashCode(this.documentId);
        hash = 19 * hash + Objects.hashCode(this.path);
        hash = 19 * hash + Objects.hashCode(this.type);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DocumentationItemDTO other = (DocumentationItemDTO) obj;
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        if (!Objects.equals(this.documentId, other.documentId)) {
            return false;
        }
        if (!Objects.equals(this.path, other.path)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
    
    
}
