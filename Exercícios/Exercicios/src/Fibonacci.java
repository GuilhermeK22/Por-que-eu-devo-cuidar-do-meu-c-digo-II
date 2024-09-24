/**
 * A classe Fibonacci fornece um método para calcular a sequência de Fibonacci de forma recursiva.
 */
public class Fibonacci {
    /**
     * Calcula o n-ésimo número na sequência de Fibonacci.
     *
     * @para n o índice na sequência de Fibonacci (deve ser um número não negativo)
     * @return o n-ésimo número na sequência de Fibonacci
     * @throws IllegalArgumentException se o índice for negativo
     */

    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O índice não pode ser negativo");
        }
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

