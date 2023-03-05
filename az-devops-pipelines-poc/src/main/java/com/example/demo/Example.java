package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="ptl_dropdown_type", schema="portal")
public class Example {

    @Id
    @Column(name="dropdown_type_id")
    private Long id;

    @Column(name="dropdown_type_cd")
    private String cd;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

}