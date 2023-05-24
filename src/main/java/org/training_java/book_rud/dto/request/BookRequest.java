package org.training_java.book_rud.dto.request;



public class BookRequest {
    private String id;

    private String name;

    private  String author;

    private  String code;
    public BookRequest (String id , String name, String author, String code) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}



