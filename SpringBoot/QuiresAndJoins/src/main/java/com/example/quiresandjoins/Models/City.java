package com.example.quiresandjoins.Models;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @NotNull
    private String countryCode;
    @NotNull
    private String district;

    @NotNull
    private Integer population;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private City city;


    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date createdAt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }
}