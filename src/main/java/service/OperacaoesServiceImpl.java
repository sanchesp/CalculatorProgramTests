package service;

import model.Calculadora;

public class OperacaoesServiceImpl implements OperacoesService{

    @Override
    public void adicao(Calculadora calculadora, Double primeiroNumero, Double segundoNumero) {
        calculadora.setResultado(primeiroNumero+segundoNumero);
    }

    @Override
    public void subtracao(Calculadora calculadora, Double primeiroNumero, Double segundoNumero) {
        calculadora.setResultado(primeiroNumero-segundoNumero);
    }

    @Override
    public void multiplicacao(Calculadora calculadora, Double primeiroNumero, Double segundoNumero) {
        calculadora.setResultado(primeiroNumero*segundoNumero);
    }

    @Override
    public void divisao(Calculadora calculadora, Double primeiroNumero, Double segundoNumero) {
        calculadora.setResultado(primeiroNumero/segundoNumero);
    }
}
