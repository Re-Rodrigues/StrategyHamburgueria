package org.hamburgueria;

import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertEquals;

class PedidoTest {

    @Test
    void devePagarComPix() {
        Pedido pedido = new Pedido(25.0);

        pedido.setPagamento(new Pix());

        assertEquals(
                "Pagamento de R$ 25.0 realizado via Pix",
                pedido.finalizarPedido()
        );
    }

    @Test
    void devePagarComCartao() {
        Pedido pedido = new Pedido(30.0);

        pedido.setPagamento(new Cartao());

        assertEquals(
                "Pagamento de R$ 30.0 realizado no cartão",
                pedido.finalizarPedido()
        );
    }

    @Test
    void devePagarComDinheiro() {
        Pedido pedido = new Pedido(15.0);

        pedido.setPagamento(new Dinheiro());

        assertEquals(
                "Pagamento de R$ 15.0 realizado em dinheiro",
                pedido.finalizarPedido()
        );
    }

    @Test
    void devePermitirTrocarFormaDePagamento() {
        Pedido pedido = new Pedido(20.0);

        pedido.setPagamento(new Pix());
        assertEquals(
                "Pagamento de R$ 20.0 realizado via Pix",
                pedido.finalizarPedido()
        );

        pedido.setPagamento(new Cartao());
        assertEquals(
                "Pagamento de R$ 20.0 realizado no cartão",
                pedido.finalizarPedido()
        );
    }

    @Test
    void naoDeveFinalizarSemPagamento() {
        Pedido pedido = new Pedido(10.0);

        assertEquals(
                "Forma de pagamento não definida",
                pedido.finalizarPedido()
        );
    }
}