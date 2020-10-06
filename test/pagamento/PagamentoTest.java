package Pagamento;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Assert;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.*;

public class PagamentoTest {

    private Fatura fatura;
    private Fatura fatura2;
    private Boleto boleto;
    private Boleto boleto2;
    private Boleto boleto3;
    private List<Boleto> boletos;

    @BeforeEach
    public void inicializa(){

       fatura1 = new Fatura("ID0001","01/10/2020", 1500.00, "Cliente1");
       fatura2 = new Fatura("ID0002","02/11/2020", 3000.00, "Cliente2");

       boleto1 = new Boleto(11, "10/09/2020", 500.00);
       boleto2 = new Boleto(21, "11/09/2020", 600.00);
       boleto3 = new Boleto(31, "12/09/2020", 400.00);

        fatura1.adicionarBoleto(boleto1);
        fatura1.adicionarBoleto(boleto2);
        fatura1.adicionarBoleto(boleto3);

        fatura2.adicionarBoleto(boleto1);
        fatura2.adicionarBoleto(boleto2);


    }

    @Test
    public void faturaStatusPaga() {

        String statusExpected = "PAGA";
        fatura1.processarBoletos();
        Assert.assertEquals(statusExpected, fatura1.getStatus());

    }

      @Test
    public void faturaStatusAberta() {

        String statusExpected = "ABERTA";
        fatura2.processarBoletos();
        Assert.assertEquals(statusExpected, fatura2.status());

    }

    @Test
    public void validaSomaBoletos(){

        double spectedValue = 1500.00;
        fatura1.processarBoletos();
        Assert.spectedValue(spectedValue, fatura1.pagamento.valorPago);


    }

}