import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * A classe CalculadoraTest contém testes unitários para a classe Calculadora.
 */
public class CalculadoraTest {
    private Calculadora calculadora;

    /**
     * Configura uma nova instância da classe Calculadora antes de cada teste.
     */
    @BeforeEach
    public void setUP() {
        calculadora = new Calculadora();
    }

    /**
     * Testa o método adicionar.
     */
    @Test
    public void testAdicionar() {
        assertEquals(5, calculadora.adicionar(2, 3));
        assertEquals(-1, calculadora.adicionar(-2, 1));
        assertEquals(0, calculadora.adicionar(0, 0));
    }
    /**
     * Testa o método subtrair.
     */
    @Test
    public void testSubtrair() {
        assertEquals(1, calculadora.subtrair(3, 2));
        assertEquals(-3, calculadora.subtrair(-2, 1));
        assertEquals(0, calculadora.subtrair(0, 0));
    }
    /**
     * Testa o método multiplicar.
     */
    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertEquals(-2, calculadora.multiplicar(-2, 1));
        assertEquals(0, calculadora.multiplicar(0, 5));
    }
    /**
     * Testa o método dividir.
     */
    @Test
    public void testDividir() {
        assertEquals(2, calculadora.dividir(6, 3));
        assertEquals(-2, calculadora.dividir(-4, 2));
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(1, 0));
    }
}
