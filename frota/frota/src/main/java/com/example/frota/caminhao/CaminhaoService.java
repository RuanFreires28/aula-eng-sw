package com.example.frota.caminhao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaminhaoService {

    @Autowired
    private CaminhaoRepository repository;

    public Caminhao save (Caminhao caminhao){
        return repository.save(caminhao);
    }



}
