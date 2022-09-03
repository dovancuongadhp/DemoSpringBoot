package com.example.demospringboot.Model;

import javax.persistence.*;

@Entity
@Table(name = "tblProduct")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
    private String price;
    private String version;
    public Product(Integer id, String name, String price, String version) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.version = version;
    }

    public Product() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
