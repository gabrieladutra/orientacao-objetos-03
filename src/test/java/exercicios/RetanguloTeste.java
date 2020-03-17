package exercicios;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTeste {
    @Test
    public void construtor_quandoUmLadoForNegativo_deveLancarUmaExcecao() {
        assertThrows(RuntimeException.class, () -> new Retangulo(5d, -5d));
    }

    @Test
    public void construtor_quandoOsLadosForemPositivos_deveCriarUmaInstancia() {
        Double base = 5d;
        Double altura = 5d;
        Retangulo r = new Retangulo(base, altura);
        assertNotNull(r);
    }

    @Test
    public void calcularArea_quandoBaseEAlturaForemValidos_deveCalcularArea() {
        Double base = 5d;
        Double altura = 5d;
        Retangulo r = new Retangulo(base, altura);
        r.calcularArea();
        assertEquals(base * altura, r.calcularArea());
    }

    @Test
    public void calcularPerimeto_quandoBaseEAlturaForemValidos_deveCalcularPerimetro() {
        Double base = 5d;
        Double altura = 5d;
        Retangulo r = new Retangulo(base, altura);
        assertEquals(2 * base + 2 * altura, r.calcularPerimetro());

    }
}
