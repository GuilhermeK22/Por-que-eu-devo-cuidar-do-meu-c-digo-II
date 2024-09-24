import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * A classe FibonacciTest contém testes unitários para a classe Fibonacci.
 */
public class FibonacciTest {
    private Fibonacci fibonacci;
    /**
     * Configura uma nova instância da classe Fibonacci antes de cada teste.
     */
    @BeforeEach
    public void setUp() {
        fibonacci = new Fibonacci();
    }
    /**
     * Testa os casos base da sequência de Fibonacci (0 e 1).
     */
    @Test
    public void testFibonacciBaseCases() {
        assertEquals(0, fibonacci.fibonacci(0));
        assertEquals(1, fibonacci.fibonacci(1));
    }

    /**
     * Testa os casos gerais da sequência de Fibonacci.
     */
    @Test
    public void testFibonacciGeneralCases() {
        assertEquals(1, fibonacci.fibonacci(2));
        assertEquals(1, fibonacci.fibonacci(3));
        assertEquals(2, fibonacci.fibonacci(4));
        assertEquals(3, fibonacci.fibonacci(5));
        assertEquals(5, fibonacci.fibonacci(6));
        assertEquals(8, fibonacci.fibonacci(7));
        assertEquals(13, fibonacci.fibonacci(8));
    }

    /**
     * Testa se a função lança uma exceção ao receber uma entrada negativa.
     */
    @Test
    public void testFibonacciNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> fibonacci.fibonacci(-1));
    }
}
