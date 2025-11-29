package padroescomportamentais.mediator;

public class SistemaPedidos {

    private static SistemaPedidos instancia = new SistemaPedidos();

    private SistemaPedidos() {}

    public static SistemaPedidos getInstancia() {
        return instancia;
    }

    public String receberPedidoPrato(String prato) {
        return "O Sistema de Pedidos registrou o prato.\n"+
                "A Cozinha Principal respondeu a demanda conforme mensagem a seguir.\n" +
                ">>" + CozinhaPrincipal.getInstancia().prepararPrato(prato);
    }

    public String receberCancelamento(String pedido) {
        return "O Sistema de Pedidos registrou o cancelamento.\n"+
                "A Cozinha Principal respondeu a demanda conforme mensagem a seguir.\n" +
                ">>" + CozinhaPrincipal.getInstancia().cancelarPedido(pedido);
    }

    public String receberObservacao(String observacao) {
        return "O Sistema de Pedidos registrou a observação.\n"+
                "A Cozinha Principal respondeu a demanda conforme mensagem a seguir.\n" +
                ">>" + CozinhaPrincipal.getInstancia().anotarObservacao(observacao);
    }

}