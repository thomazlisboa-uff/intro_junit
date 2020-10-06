package pagamento;

import java.util.ArrayList;
import java.util.Iterator;


public class Fatura {
  String id;
  String data;
  double valorTotal;
  String nomeCliente;
  String status;
  private ArrayList<Boleto> boletos;
  Pagamento pagamento;

  public Fatura(String id, String data, double valorTotal, String nomeCliente){
    this.id = id;
    this.data = data;
    this.valorTotal = valorTotal;
    this.nomeCliente = nomeCliente;
    this.status = "ABERTA";
    this.pagamento = null;

    boletos = new ArrayList<Boleto>();
  }

  public String getId(){
    return this.id;
  }

  public String getStatus(){
    return this.status;
  }

  public void adicionarBoleto(Boleto boleto){
    boletos.add(boleto);
  }

  public void processarBoletos(){

    double totalBoletos = 0.0;

    for (Iterator<Boleto> i = boletos.iterator(); i.hasNext();) {
			Boleto boleto = (Boleto) i.next();
			totalBoletos += boleto.getValorPago();
		}

    if(totalBoletos >= this.valorTotal){
      this.status = "PAGA";
    }

    this.pagamento = new Pagamento(totalBoletos, "01/10/2020");
    this.pagamento.associarFatura(this);

    System.out.print(this.pagamento.mostrarPagamento());
  }

}