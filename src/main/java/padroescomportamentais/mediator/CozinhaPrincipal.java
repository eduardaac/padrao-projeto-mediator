package padroescomportamentais.mediator;

public class CozinhaPrincipal implements AreaCozinha {

    private static CozinhaPrincipal instancia = new CozinhaPrincipal();

    private CozinhaPrincipal() {}

    public static CozinhaPrincipal getInstancia() {
        return instancia;
    }

    public String prepararPrato(String prato) {
        return "A Cozinha Principal iniciou o preparo do prato: " + prato;
    }

    public String cancelarPedido(String pedido) {
        return "A Cozinha Principal removeu o pedido da fila: " + pedido;
    }

    public String anotarObservacao(String observacao) {
        return "A Cozinha Principal recebeu e confirmou a observação: " + observacao;
    }
}