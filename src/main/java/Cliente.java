
public class Cliente {

    private String statusCompras;

    public Cliente() {
        this.statusCompras = "Nenhuma compra realizada.";
    }

    public String getStatusCompras() {
        return statusCompras;
    }

    public void comprarNoPix(float valor) {
        Compra compra = new Compra(valor);
        this.statusCompras = compra.pagar(new PagamentoPix());
    }

    public void comprarNoDinheiro(float valor) {
        Compra compra = new Compra(valor);
        this.statusCompras = compra.pagar(new PagamentoDinheiro());
    }

    public void comprarNoCredito(float valor) {
        Compra compra = new Compra(valor);
        this.statusCompras = compra.pagar(new PagamentoCredito());
    }

    public void comprarNoBoleto(float valor) {
        Compra compra = new Compra(valor);
        this.statusCompras = compra.pagar(new PagamentoBoleto());
    }

}
