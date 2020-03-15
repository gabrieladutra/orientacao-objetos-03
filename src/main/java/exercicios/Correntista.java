package exercicios;

public class Correntista {
  private Integer numero;
  private Double saldo;
  private Double limite;

  public Correntista(Double limite, Integer numero) {
    saldo = 0d;
    setLimite(limite);
    this.numero = numero;
  }

  public Double getSaldo() {
    return saldo;
  }

  public Integer getNumero() {
    return numero;
  }

  public Double getLimite(){
    return limite;
  }

  public void depositar(Double valor) {
    if (valor <= 0) {
      throw new RuntimeException("Impossivel depositar valores negativos");
    }
    saldo = saldo + valor;
  }

  public void sacar(Double valor) {
    if (valor > saldo + limite) {
      throw new RuntimeException("saldo insuficiente");
    }
    saldo -= valor;
  }

  public void setLimite(Double limite) {
    if (limite < 0) {
      throw new RuntimeException("limite negativo");
    }
    this.limite = limite;
  }
  public void transferir (Double valor, Correntista destinatario){
    sacar(valor);
    destinatario.depositar(valor);
  }

}

