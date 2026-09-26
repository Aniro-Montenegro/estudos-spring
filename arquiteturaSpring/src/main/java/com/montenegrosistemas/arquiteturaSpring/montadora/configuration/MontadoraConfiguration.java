package com.montenegrosistemas.arquiteturaSpring.montadora.configuration;

import com.montenegrosistemas.arquiteturaSpring.montadora.Motor;
import com.montenegrosistemas.arquiteturaSpring.montadora.TipoMotor;
import com.montenegrosistemas.arquiteturaSpring.montadora.api.Aspirado;
import com.montenegrosistemas.arquiteturaSpring.montadora.api.Eletrico;
import com.montenegrosistemas.arquiteturaSpring.montadora.api.Turbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    @Aspirado
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("Aspirado)");
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    @Eletrico
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(230);
        motor.setCilindros(4);
        motor.setModelo("ELET");
        motor.setLitragem(6.0);
        motor.setTipoMotor(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    @Turbo
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(230);
        motor.setCilindros(4);
        motor.setModelo("Turbo");
        motor.setLitragem(6.0);
        motor.setTipoMotor(TipoMotor.TURBO);
        return motor;
    }

}
