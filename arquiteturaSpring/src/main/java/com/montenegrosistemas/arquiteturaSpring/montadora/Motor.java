package com.montenegrosistemas.arquiteturaSpring.montadora;

public class Motor {
    private String modelo;
    private Integer cavalos;
    private Integer cilindros;
    private Double litragem;
    private TipoMotor tipoMotor;

    public String getModelo() {
        return modelo;
    }

    public Integer getCavalos() {
        return cavalos;
    }

    public Integer getCilindros() {
        return cilindros;
    }

    public Double getLitragem() {
        return litragem;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCavalos(Integer cavalos) {
        this.cavalos = cavalos;
    }

    public void setCilindros(Integer cilindros) {
        this.cilindros = cilindros;
    }

    public void setLitragem(Double litragem) {
        this.litragem = litragem;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String toString() {
        return "Motor - " +
                "modelo=' " + modelo + '\'' +
                ", cavalos=" + cavalos +
                ", cilindros=" + cilindros +
                ", litragem=" + litragem +
                ", tipoMotor=" + tipoMotor
                ;
    }
}
