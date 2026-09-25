package com.montenegrosistemas.arquiteturaSpring.montadora;

import java.awt.*;

public class Carro {

    private  String modelo;
    private Color color;
    private Motor motor;
    private Montadora montadora;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public CarroStatus darIgnicao(Chave chave) {

        if(chave.getMontadora() != this.montadora){
            return new CarroStatus("Nao e possivel iniciar o carro com essa chave");
        }
        else{
            return new CarroStatus("Carro ligado Rodando com o motor: "+motor);

        }
    }
}
