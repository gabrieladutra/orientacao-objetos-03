package exercicios;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

public class CorrentistaTeste {

    @Test
    public void construtor_quandoNumeroForPositivo_deveCriarUmaInstancia() {
        Double limite = 1000d;
        Integer numero = 51;
        Correntista c = new Correntista(limite, numero);
        assertNotNull(c);
    }

    @Test
    public void depositar_quandoValorDoDepositoForNegativo_deveLancarUmaExcecao() {
        Double limite = 1000d;
        Integer numero = 51;
        Double valor = -50d;
        Correntista c = new Correntista(limite, numero);
        assertThrows(RuntimeException.class, () -> c.depositar(-20d));
    }

    @Test
    public void depositar_quandoValorDoDepositoForPositivo_deveDepositar() {
        Correntista c = new Correntista(1000d, 51);
        Double saldoAtual = c.getSaldo();
        Double valor = 500d;
        c.depositar(valor);
        assertEquals(saldoAtual + valor, c.getSaldo());
    }
}
