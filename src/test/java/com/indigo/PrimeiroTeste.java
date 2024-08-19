package com.indigo;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {

    @Test
    public void estruturaDeUmTeste(){
        //cenário
        int numero1 = 10, numero2 = 5;

        //execução
        int resultado = numero1 + numero2;

        //verificação
        Assertions.assertThat(resultado).isBetween(14,16);
    }
}
