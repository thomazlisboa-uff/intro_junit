package pagamento;


public class Pagamento {
    double valorPago;
    String data;
    String tipoPagamento;
    Fatura fatura;

  public Pagamento(double valorPago, String data) {
    this.valorPago = valorPago;
    this.data = data; 
    this.tipoPagamento = "BOLETO";
  }

  public void associarFatura(Fatura fatura){
    this.fatura = fatura;
}

public String mostrarPagamento(){
  String retorno = "Data: "+ this.data +" \n" +
                    "Tipo: "+ this.tipoPagamento +" \n" +
                    "Valor: "+ this.valorPago + " \n"+
                    "FATURA ID: "+ this.fatura.getId() + " \n"+
                    "Status da Fatura: "+ this.fatura.getStatus() + " \n"+
                    "#################################################### \n";
  return retorno;                  
}
}