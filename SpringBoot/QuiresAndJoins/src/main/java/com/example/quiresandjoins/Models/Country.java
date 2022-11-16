package com.example.quiresandjoins.Models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="countries")

public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    private String code;

    @NotNull
    private String name;

    private enum continent{
        Asia, Africa, NorthAmerica, SouthAmerica, Antarctica, Europe, Australia
    }

    @NotNull
    private String region;

    @NotNull
    private double surfaceArea;

    @NotNull
    private short indepYear;

    @NotNull
    private int population;

    @NotNull
    private double lifeExpectancy;

    @NotNull
    private double gnp;

    @NotNull
    private double gnpOld;

    @NotNull
    private String localName;

    @NotNull
    private String govermentForm;

    @NotNull
    private String headOfState;

    @NotNull
    private int capital;

    @NotNull
    private String code2;

    @OneToMany(mappedBy="city", fetch = FetchType.LAZY)
    private List<City> cityList;

}
