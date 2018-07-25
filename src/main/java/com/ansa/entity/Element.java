package com.ansa.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.keyvalue.annotation.KeySpace;

import java.io.Serializable;


@KeySpace("element")
public class Element implements Serializable {

    @Id
    private String key;

    private String value;

    public String getKey() {
        return key;
    }

    public Element(String value){
        this.value = value;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
