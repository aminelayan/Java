package com.example.quiresandjoins.Service;

import com.example.quiresandjoins.Repositories.worldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class countryService {

    @Autowired
    private worldRepository worldRepository;

    public List<Object[]> getsolvene() {
        return worldRepository.findSolvene();
    }
    public List<Object[]> getcitiesdereaseing(){
        return worldRepository.findcitiesdecrease();
    }
    public List<Object[]> greater500(){
        return worldRepository.greater500();
    }

    public List<Object[]> greater89perc(){
        return worldRepository.greater89perc();
    }
    public List<Object[]> greater100(){
        return worldRepository.greater100();
    }

    public List<Object[]>morethan200(){
        return worldRepository.morethan200();
    }

    public List<Object[]>morethan500(){
        return worldRepository.morethan500();
    }

    public List<Object[]> region() {
        return worldRepository.region();
    }
}
