package com.jocdedaus.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.persistence.Id;

//    classe "DatabaseSequence" creada per fer autoincrement de "id" amb MongoDB
//    donat que @GeneratedValue no està disponible en aquest cas i MongoDB genera un id únic tipus hash.
//    https://www.baeldung.com/spring-boot-mongodb-auto-generated-field

@Document(collection = "database_sequences")
public class DatabaseSequence {

    @Id
    private String id;

    private long seq;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getSeq() {
        return seq;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }
}