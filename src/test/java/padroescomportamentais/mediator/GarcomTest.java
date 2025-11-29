package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarcomTest {

    @Test
    void deveEnviarPedidoPrato() {
        Garcom garcom = new Garcom();
        assertEquals("O Sistema de Pedidos registrou o prato.\n" +
                        "A Cozinha Principal respondeu a demanda conforme mensagem a seguir.\n" +
                        ">>A Cozinha Principal iniciou o preparo do prato: Filé Mignon",
                garcom.enviarPedidoPrato("Filé Mignon"));
    }

    @Test
    void deveEnviarCancelamento() {
        Garcom garcom = new Garcom();
        assertEquals("O Sistema de Pedidos registrou o cancelamento.\n" +
                        "A Cozinha Principal respondeu a demanda conforme mensagem a seguir.\n" +
                        ">>A Cozinha Principal removeu o pedido da fila: Mesa 5, Pedido 1",
                garcom.enviarCancelamento("Mesa 5, Pedido 1"));
    }

    @Test
    void deveEnviarObservacao() {
        Garcom garcom = new Garcom();
        assertEquals("O Sistema de Pedidos registrou a observação.\n" +
                        "A Cozinha Principal respondeu a demanda conforme mensagem a seguir.\n" +
                        ">>A Cozinha Principal recebeu e confirmou a observação: Sem cebola",
                garcom.enviarObservacao("Sem cebola"));
    }

}