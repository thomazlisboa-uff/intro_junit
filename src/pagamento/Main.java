package pagamento;


class Main {
  public static void main(String[] args) {
   
   Fatura fatura1 = new Fatura("ID0001","01/10/2020", 1500.00, "Cliente1");
   Boleto boleto1Fatura1 = new Boleto(11, "10/09/2020", 500.00);
   Boleto boleto2Fatura1 = new Boleto(21, "11/09/2020", 600.00);
   Boleto boleto3Fatura1 = new Boleto(31, "12/09/2020", 400.00);

   fatura1.adicionarBoleto(boleto1Fatura1);
   fatura1.adicionarBoleto(boleto2Fatura1);
   fatura1.adicionarBoleto(boleto3Fatura1);

   fatura1.processarBoletos();

   Fatura fatura2 = new Fatura("ID0002","05/10/2020", 1500.00, "Cliente2");
   Boleto boleto1Fatura2 = new Boleto(21, "13/09/2020", 1000.00);
   Boleto boleto2Fatura2 = new Boleto(22, "14/09/2020", 500.00);
   Boleto boleto3Fatura2 = new Boleto(23, "15/09/2020", 250.00);

    fatura2.adicionarBoleto(boleto1Fatura2);
    fatura2.adicionarBoleto(boleto2Fatura2);
    fatura2.adicionarBoleto(boleto3Fatura2);

    fatura2.processarBoletos();

   Fatura fatura3 = new Fatura("ID0003","10/10/2020", 2000.00, "Cliente3");
   Boleto boleto1Fatura3 = new Boleto(31, "16/09/2020", 500.00);
   Boleto boleto2Fatura3 = new Boleto(32, "17/09/2020", 400.00);

   fatura3.adicionarBoleto(boleto1Fatura3);
   fatura3.adicionarBoleto(boleto2Fatura3);

  fatura3.processarBoletos();

  }
}