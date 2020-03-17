package exercicios;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

public class CirculoTeste {
    @Test
    public void construtor_quandoUmRaioforNegativo_deveLancarUmaExcecao() {
        assertThrows(RuntimeException.class, () -> new Circulo(-5d));
    }

    @Test
    public void construtor_quandoUmRaioForPossitivo_deveCriarUmaInstancia() {
        Circulo c = new Circulo(5d);
        assertNotNull(c);
    }

    @Test
    public void calcularArea_quandoRaioForValido_deveCalcularArea() {
        Double raio = 5d;
        Circulo c = new Circulo(raio);
        c.calcularArea();
        assertEquals(Math.pow(raio, 2) * Math.PI, c.calcularArea());
    }

    @Test
    public void calcularCircunferencia_quandoRaioForValido_deveCalcularCircunferencia() {
        Double raio = 5d;
        Circulo c = new Circulo(raio);
        c.calcularCircunferencia();
        assertEquals(2 * Math.PI * raio, c.calcularCircunferencia());
    }

}



