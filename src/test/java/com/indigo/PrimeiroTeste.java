package com.indigo;

import com.sun.imageio.plugins.common.I18N;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {

    @Test
    public void deveSomar2Numeros(){
        //cenário
        Calculadora calculadora = new Calculadora();
        int numero1 = 10, numero2 = 5;

        //execução
        int resultado = calculadora.somar(numero1, numero2);

        //verificação
        Assertions.assertThat(resultado).isEqualTo(15);
    }

    @Test(expected = RuntimeException.class)
    public void naoDeveSomarNumerosNegativos(){
        //cenario
        Calculadora calculadora = new Calculadora();
        int num1 = -10, num2 = 5;

        //execução
        calculadora.somar(num1, num2);
    }

    //TODO: Implementar subtrair, multiplicar e dividir(não pode dividir por 0)

    @Test
    public void deveSubtrair2Numeros(){
        //cenario
        Calculadora calculadora = new Calculadora();
        int numero1 = 10, numero2 = 5;

        //execução
        calculadora.subtrair(numero1, numero2);
    }

    @Test
    public void deveMultiplicar2Numeros(){
        //cenario
        Calculadora calculadora = new Calculadora();
        int numero1 = 10, numero2 = 5;

        //execução
        calculadora.multiplicar(numero1, numero2);
    }

    @Test
    public void deveDividir2Numeros(){
        //cenario
        Calculadora calculadora = new Calculadora();
        int numero1 = 10, numero2 = 5;

        //execução
        calculadora.dividir(numero1, numero2);
    }

    @Test(expected = RuntimeException.class)
    public void naoDeveDividirNumerosCom0(){
        //cenario
        Calculadora calculadora = new Calculadora();
        int numero1 = 10, numero2 = 0;

        //execução
        calculadora.dividir(numero1, numero2);
    }
}

class Calculadora{

    int somar(int num1, int num2){
        if(num1 < 0 || num2 < 0){
            throw new RuntimeException("Não é permitido somar numeros negativos.");
        }
        return num1 + num2;
    }

    int subtrair(int num1, int num2){
        return num1 - num2;
    }

    int multiplicar(int num1, int num2){

        return num1 * num2;
    }

    int dividir(int num1, int num2){
        if(num1 == 0 || num2 == 0){
            throw new RuntimeException("Não pode dividir um numero com 0.");
        }
        return num1 / num2;

    }
}