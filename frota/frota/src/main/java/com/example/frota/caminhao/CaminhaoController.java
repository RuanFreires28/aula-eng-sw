package com.example.frota.caminhao;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/caminhao")
public class CaminhaoController {

    @Autowired
    private CaminhaoRepository repository;

    @GetMapping("/formulario")
    public String carregaPaginaFormulario(Long id, Model model){

        return "caminhao/formulario";
    }
/*
    @PostMapping
    @Transactional
    public String cadastrar( @Valid CadastroCaminhao dados){
        Caminhao caminhao = new Caminhao(dados);
    }
  */
}