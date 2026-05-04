package org.hamburgueria;

public class Cartao implements PagamentoStrategy {

    @Override
    public String pagar(double valor) {
        return "Pagamento de R$ " + valor + " realizado no cartão";
    }
}