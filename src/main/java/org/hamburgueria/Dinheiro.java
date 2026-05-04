package org.hamburgueria;

public class Dinheiro implements PagamentoStrategy {

    @Override
    public String pagar(double valor) {
        return "Pagamento de R$ " + valor + " realizado em dinheiro";
    }
}