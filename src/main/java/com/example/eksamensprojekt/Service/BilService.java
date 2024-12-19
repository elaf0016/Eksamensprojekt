package com.example.eksamensprojekt.Service;
import com.example.eksamensprojekt.Model.Bil;
import com.example.eksamensprojekt.Repository.BilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BilService {
    @Autowired
    BilRepository bilRepository;
    public List<Bil>fetchAllBil(){
        return bilRepository.fetchAllBil();
    }
    public void addBil(Bil b){
        bilRepository.addBil(b);
    }
    public Bil findBilByStelNummer(String stelnummer){
        return bilRepository.findBilByStelNummer(stelnummer);
    }
    public Boolean deleteBil(String stelnummer){
        return bilRepository.deleteBil(stelnummer);
    }
    public void updateBil(Bil b){
        bilRepository.updateBil(b);
    }


}
