package service;

import model.Calculadora;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.*;

import static org.hamcrest.CoreMatchers.is;

public class OperacaoesServiceTest {

    private OperacoesService operacoes;

    @Before
    public void setup() {
        operacoes = new OperacaoesServiceImpl();
    }

    @Test
    public void testeDeAdicao() {
        //Givem
        Calculadora calculadora = new Calculadora();

        //When
        operacoes.adicao(calculadora, 10.0,5.0);

        //Then
        Assert.assertThat(calculadora.getResultado(), is(15.0));
    }
    @Test
    public void testeDeSubtracao() {
        //Givem
        Calculadora calculadora = new Calculadora();

        //When
        operacoes.subtracao(calculadora, 0.0,5.0);

        //Then
        Assert.assertThat(calculadora.getResultado(), is(-5.0));

    }

    @Test
    public void testeDeMultiplicacao() {
        //Givem
        Calculadora calculadora = new Calculadora();

        //When
        operacoes.multiplicacao(calculadora, 0.0,5.0);

        //Then
        Assert.assertThat(calculadora.getResultado(), is(0.0));

    }

    @Test
    public void testeDeDivisao() {
        //Givem
        Calculadora calculadora = new Calculadora();

        //When
        operacoes.divisao(calculadora, 7.0,2.0);

        //Then
        Assert.assertThat(calculadora.getResultado(), is(3.5));

    }
}
