package com.montenegrosistemas.arquiteturaSpring.montadora.api;

import com.montenegrosistemas.arquiteturaSpring.montadora.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TestfabricaController {

    private final Motor motorAspirado;
    private final Motor motorTurbo;
    private final Motor motorEletrico;

    // Injetando os três motores através do construtor
    public TestfabricaController(
            @Aspirado Motor motorAspirado,
            @Turbo Motor motorTurbo,
            @Eletrico Motor motorEletrico) {
        this.motorAspirado = motorAspirado;
        this.motorTurbo = motorTurbo;
        this.motorEletrico = motorEletrico;
    }

    // Rota: POST /carros/aspirado
    @PostMapping("/aspirado")
    public CarroStatus ligarCarroAspirado(@RequestBody Chave chave) {
        var carro = new HondaHRV(motorAspirado);
        return carro.darIgnicao(chave);
    }

    // Rota: POST /carros/turbo
    @PostMapping("/turbo")
    public CarroStatus ligarCarroTurbo(@RequestBody Chave chave) {
        var carro = new HondaHRV(motorTurbo);
        return carro.darIgnicao(chave);
    }

    // Rota: POST /carros/eletrico
    @PostMapping("/eletrico")
    public CarroStatus ligarCarroEletrico(@RequestBody Chave chave) {
        var carro = new HondaHRV(motorEletrico);
        return carro.darIgnicao(chave);
    }
}