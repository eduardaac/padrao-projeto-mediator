package padroescomportamentais.mediator;

public interface AreaCozinha {
    String prepararPrato(String prato);
    String cancelarPedido(String pedido);
    String anotarObservacao(String observacao);
}