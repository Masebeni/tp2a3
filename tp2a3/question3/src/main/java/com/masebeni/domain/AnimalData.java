package com.masebeni.domain;

import com.masebeni.services.Animalss;

import java.io.Serializable;

/**
 * Created by Isiphile on 2016/03/13.
 */
public class AnimalData implements Serializable {
    private int id;
    private int age;
    private String type;

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnimalData data= (AnimalData) o;

        return id == data.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "AnimalData{" + "Breed type= " + type + '}';
    }
}
