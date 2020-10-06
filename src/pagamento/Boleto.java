package pagamento;

public class Boleto{
  int codigo;
  String data;
  double valorPago;

  public Boleto(int codigo, String data, double valorPago){
    this.codigo = codigo;
    this.data = data;
    this.valorPago = valorPago;
  }

  public double getValorPago(){
    return this.valorPago;
  }
}