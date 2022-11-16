package com.example.quiresandjoins.Repositories;

import com.example.quiresandjoins.Models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
@Repository
public interface worldRepository extends CrudRepository<Country,Long> {


//    List<Country> findALl();
    @Query(value = "select countries.name as Country, languages.language as Language,languages.percentage as Percentage from countries join languages on countries.id=languages.country_id WHERE languages.language = 'Slovene' ORDER BY percentage DESC",nativeQuery = true)
    List<Object[]>findSolvene();

    @Query(value = "select countries.name as country ,count(cities.name) as cities from countries  join cities on countries.id=cities.country_id group by (countries.name) order by cities desc",nativeQuery = true)
    List<Object[]>findcitiesdecrease();

    @Query(value = "select countries.id,cities.name,cities.population from countries join cities on countries.id=cities.country_id where countries.name = 'Mexico'and cities.population>500000",nativeQuery = true)
    List<Object[]>greater500();

    @Query(value = "select countries.name as name, languages.language as language, percentage from countries join languages on countries.id=languages.country_id where languages.percentage>89 order by languages.percentage desc",nativeQuery = true)
    List<Object[]>greater89perc();

    @Query(value = "select name, surface_area ,population from countries where population>100000 and surface_area<501",nativeQuery = true)
    List<Object[]>greater100();

    @Query(value = "select name, government_form ,capital, life_expectancy from countries where government_form= 'Constitutional Monarchy'and capital>200 and life_expectancy>75",nativeQuery = true)
    List<Object[]>morethan200();

    @Query(value = "select countries.name as Country_name, cities.name as City_name, cities.district as District, cities.population as Population from countries join cities on countries.id=cities.country_id where cities.district= 'Buenos Aires'and cities.population>500000",nativeQuery = true)
    List<Object[]> morethan500();

    @Query(value = "select region, count(name) as countries from countries group by (region)order by countries desc",nativeQuery = true)
    List<Object[]> region();
}
