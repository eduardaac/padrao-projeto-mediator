package padroescomportamentais.mediator;

public class Garcons {

    public String enviarPedidoPrato(String prato) {
        return SistemaPedidos.getInstancia().receberPedidoPrato(prato);
    }

    public String enviarCancelamento(String pedido) {
        return SistemaPedidos.getInstancia().receberCancelamento(pedido);
    }

    public String enviarObservacao(String observacao) {
        return SistemaPedidos.getInstancia().receberObservacao(observacao);
    }
}