/**
 * A classe Calculadora fornece métodos básicos de operações aritméticas.
 */
public class Calculadora {
    /**
     * Adiciona dois números inteiros.
     * @para a o primeiro número
     * @para b o segundo número
     * @return a soma de a e b
     */
    int adicionar(int a, int b) {
        return a + b;
    }
    /**
     * Subtrai o segundo número inteiro do primeiro.
     * @para a o primeiro número
     * @para b o segundo número
     * @return a diferença entre a e b
     */
    int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     * @para a o primeiro número
     * @para b o segundo número
     * @return o produto de a e b
     */
    int multiplicar(int a, int b) {
        return a * b;
    }
    /**
     * Divide o primeiro número inteiro pelo segundo.
     * @para a o primeiro número
     * @para b o segundo número
     * @return o quociente de a dividido por b
     * @throws IllegalArgumentException se b for zero
     */
    int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor não pode ser zero");
        }
        return a / b;
    }
}
