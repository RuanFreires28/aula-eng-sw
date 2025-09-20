package com.example.frota.caminhao;


import jakarta.validation.constraints.NotBlank;

public record CadastroCaminhao(@NotBlank String modelo, @NotBlank String placa, @NotBlank double cargaMaxima) {


}

