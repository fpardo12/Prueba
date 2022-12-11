package com.apiprueba.rest.Model;

import jakarta.persistence.*;
@Entity
@Table(schema = "TasksCrud")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;
    @Column
    private String lastname;
    @Column
    private long age;
    @Column
    private String photo;
    @Column
    private String document;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public long getAge() {
        return age;
    }
    public void setAge(long age) {
        this.age = age;
    }
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public String getDocument() {
        return document;
    }
    public void setDocument(String document) {
        this.document = document;
    }
}
