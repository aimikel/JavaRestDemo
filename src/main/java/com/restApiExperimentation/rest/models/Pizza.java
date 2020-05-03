package com.restApiExperimentation.rest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pizzas")
public class Pizza {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="size")
    private String size;

    public Pizza () {}

    public Pizza(int id, String name, String size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String toString() {
        return "Pizza available information: \n" + "Pizza id: " + getId() + "\nPizza name: " +
                getName() + "\nPizza size: " + getSize() + "\n";
    }
}
