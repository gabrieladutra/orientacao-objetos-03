package exercicios;

public class Circulo {
  private Double raio;

  public Circulo(Double raio) {
    setRaio(raio);
  }

  public Double getRaio() {
    return raio;
  }

  public void setRaio(Double raio) {
    if (raio <= 0) {
      throw new RuntimeException("raio negativo");
    }
    this.raio = raio;
  }

  public Double calcularCircunferencia() {
    return 2 * Math.PI * raio;
  }

  public Double calcularArea() {
    return Math.pow(raio, 2) * Math.PI;
  }

}
