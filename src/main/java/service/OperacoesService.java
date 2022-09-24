package service;

import model.Calculadora;

public interface OperacoesService {

    void adicao(Calculadora calculadora, Double primeiroNumero, Double segundoNumero);

    void subtracao(Calculadora calculadora, Double primeiroNumero, Double segundoNumero);

    void multiplicacao(Calculadora calculadora, Double primeiroNumero, Double segundoNumero);

    void divisao(Calculadora calculadora, Double primeiroNumero, Double segundoNumero);
}
