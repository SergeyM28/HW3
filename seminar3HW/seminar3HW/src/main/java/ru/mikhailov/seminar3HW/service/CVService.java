package ru.mikhailov.seminar3HW.service;

import org.springframework.stereotype.Service;
import ru.mikhailov.seminar3HW.model.CV;

import java.util.ArrayList;
import java.util.List;

@Service
public class CVService {
    List <CV> CVs = new ArrayList<>();

    public void addCV (CV cv){
        CVs.add(cv);
    }
    public List<CV> getCVs (){
        return CVs;
    }
}
