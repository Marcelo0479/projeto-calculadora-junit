package br.com.calculadora;

public class Calculadora {
    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            // Lança uma exceção se o divisor for zero, como pedido no trabalho
            throw new IllegalArgumentException("Divisor não pode ser zero.");
        }
        return a / b;
    }
}
