package org.hamburgueria;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(25.0);

        pedido.setPagamento(new Pix());
        System.out.println(pedido.finalizarPedido());

        pedido.setPagamento(new Cartao());
        System.out.println(pedido.finalizarPedido());

        pedido.setPagamento(new Dinheiro());
        System.out.println(pedido.finalizarPedido());
    }
}