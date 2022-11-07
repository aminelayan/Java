package com.dojos_and_ninjas.Models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name="ninjas")
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="dojo_id")
    private Dojo dojo;

    public Ninja(String firstName, String lastName, int age, Dojo dojo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dojo = dojo;
    }

    public Ninja() {

    }
}

