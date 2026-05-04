package org.hamburgueria;

public class Pedido {

    private double valor;
    private PagamentoStrategy pagamento;

    public Pedido(double valor) {
        this.valor = valor;
    }

    public void setPagamento(PagamentoStrategy pagamento) {
        this.pagamento = pagamento;
    }

    public String finalizarPedido() {
        if (pagamento == null) {
            return "Forma de pagamento não definida";
        }
        return pagamento.pagar(valor);
    }
}