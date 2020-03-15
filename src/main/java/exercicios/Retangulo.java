package exercicios;

public class Retangulo {
  Double base;
  Double altura;

  public Retangulo(Double ladoBase, Double ladoAltura) {
    setBase(ladoBase);
    setAltura(ladoAltura);
  }

  public Double getBase() {
    return base;
  }


  public Double getAltura() {
    return altura;
  }

  public void setBase(Double ladoBase) {
    if (ladoBase <= 0) {
      throw new RuntimeException("lado negativo");
    }
    this.base = ladoBase;
  }

  public void setAltura(Double altura) {
    if (altura <= 0) {
      throw new RuntimeException("lado negativo");
    }
    this.altura = altura;
  }

  public Double calcularArea() {
    return base * altura;
  }

  public Double calcularPerimetro() {
    return 2 * base + 2 * altura;
  }
}
